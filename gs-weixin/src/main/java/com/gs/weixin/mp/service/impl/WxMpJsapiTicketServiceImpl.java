package com.gs.weixin.mp.service.impl;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.script.DigestUtils;

import com.gs.weixin.common.SpringContextUtil;
import com.gs.weixin.common.model.WxJsapiSignature;
import com.gs.weixin.common.model.WxMpBaseJsapiTicket;
import com.gs.weixin.common.service.CacheService;
import com.gs.weixin.mp.WxMpConstants;
import com.gs.weixin.mp.service.WxMpJsapiTicketService;
import com.gs.weixin.mp.service.WxMpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WxMpJsapiTicketServiceImpl implements WxMpJsapiTicketService {

	private WxMpService wxMpService;
	
	public WxMpJsapiTicketServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}
	
	@Override
	public synchronized WxMpBaseJsapiTicket checkAndRefreshTicket() {
		String mpAppid = this.getAppid();
		log.info("开始刷新jsapi_ticket,appid={}", mpAppid);
		WxMpBaseJsapiTicket oldTicket = this.getOldTicket(mpAppid);
		if(oldTicket != null) {
			log.info("jsapi_ticket已经生效，停止刷新,appid={}", mpAppid);
			return oldTicket;
		}
		WxMpBaseJsapiTicket newTicket = this.wxMpService.executeByPost(WxMpConstants.BASE_JSAPI_TICKET_URL, WxMpBaseJsapiTicket.class, null);
		this.getCacheService().set(WxMpConstants.BASE_JSAPI_TICKET_KEY + ":" + mpAppid, newTicket, newTicket.getExpiresIn() - 200, TimeUnit.SECONDS);
		
		log.info("成功刷新jsapi_ticket,appid={}", mpAppid);
		return newTicket;
	}

	@Override
	public WxMpBaseJsapiTicket getTicket() {
		String mpAppid = this.getAppid();
		WxMpBaseJsapiTicket oldTicket = this.getOldTicket(mpAppid);
		if(oldTicket == null) {
			return this.checkAndRefreshTicket();
		}
		return oldTicket;
	}
	
	private String getAppid() {
		return this.wxMpService.getWxConfig().getAppId();
	}
	
	private WxMpBaseJsapiTicket getOldTicket(String appid) {
		CacheService cacheService = wxMpService.getWxConfig().getCacheService();
		return (WxMpBaseJsapiTicket)cacheService.get(WxMpConstants.BASE_JSAPI_TICKET_KEY+ ":" + appid);
	}
	
	private CacheService getCacheService() {
		return SpringContextUtil.getBean(CacheService.class);
	}

	@Override
	public WxJsapiSignature createWxJsapiSignature(String url) {
		long timestamp = System.currentTimeMillis() / 1000;
		String randomStr = UUID.randomUUID().toString();
		String jsapiTicket = getTicket().getTicket();
		
		String signature = DigestUtils.sha1DigestAsHex("jsapi_ticket=" + jsapiTicket + "&noncestr=" + randomStr + 
				"&timestamp=" + timestamp + "&url=" + url);
		WxJsapiSignature jsapiSignature = new WxJsapiSignature();
		jsapiSignature.setAppId(this.getAppid());
		jsapiSignature.setTimestamp(timestamp);
		jsapiSignature.setNonceStr(randomStr);
		jsapiSignature.setUrl(url);
		jsapiSignature.setSignature(signature);
		log.debug("jsapiSignature:{}", jsapiSignature);
		return jsapiSignature;
	}
	
	private synchronized WxJsapiSignature checkAndGetWxJsapiSignature(String url) {
		String mpAppid = this.getAppid();
		CacheService cache = this.getCacheService();
		String key = WxMpConstants.BASE_JSAPI_SIGN_KEY + ":" + mpAppid + ":" + url;
		WxJsapiSignature apiSign = (WxJsapiSignature)cache.get(key);
		if(apiSign == null) {
			apiSign = this.createWxJsapiSignature(url);
			cache.set(key, apiSign, 300, TimeUnit.SECONDS);
			log.info("cache jsapi-sign[appid={}]:{}, ", mpAppid, Objects.toString(apiSign));
		}
		return apiSign;
		
	}

	@Override
	public WxJsapiSignature getWxJsapiSignature(String url) {
		String mpAppid = this.getAppid();
		CacheService cache = this.getCacheService();
		String key = WxMpConstants.BASE_JSAPI_SIGN_KEY + ":" + mpAppid + ":" + url;
		WxJsapiSignature apiSign = (WxJsapiSignature)cache.get(key);
		if(apiSign == null) {
			apiSign = this.checkAndGetWxJsapiSignature(url);
		}else {
			log.debug("jsapiSignature(cache):{}", apiSign);
		}
		return apiSign;
	}
}
