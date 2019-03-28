package com.gs.weixin.mp.service.impl;

import java.util.concurrent.TimeUnit;

import com.gs.weixin.common.SpringContextUtil;
import com.gs.weixin.common.WxApiClient;
import com.gs.weixin.common.model.WxMpBaseAccessToken;
import com.gs.weixin.common.service.CacheService;
import com.gs.weixin.common.utils.StringFormatUtils;
import com.gs.weixin.mp.WxMpConstants;
import com.gs.weixin.mp.service.WxMpBaseAccessTokenService;
import com.gs.weixin.mp.service.WxMpService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class WxMpBaseAccessTokenServiceImpl implements WxMpBaseAccessTokenService {
	
	private WxMpService wxMpService;

	public WxMpBaseAccessTokenServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	@Override
	public synchronized WxMpBaseAccessToken checkAndRefreshToken() {
		String mpAppid = wxMpService.getWxConfig().getAppId();
		String mpSecret = wxMpService.getWxConfig().getSecret();
		String key = WxMpConstants.BASE_ACCESS_TOKEN_KEY+ ":" + mpAppid;
		
		log.debug("开始刷新baseAccessToken，appid={}", wxMpService.getWxConfig().getAppId());
		// 1检查缓存是否存在，没有才刷新
		CacheService cacheService = getCacheService();
		WxMpBaseAccessToken oldToken = (WxMpBaseAccessToken)cacheService.get(key);
		if(oldToken != null) {
			log.debug("baseAccessToken已经生效，停止刷新，appid={}", mpAppid);
			return oldToken;
		}
		// 2刷新后立即写入缓存
		WxMpBaseAccessToken token = WxApiClient.executeByPost(StringFormatUtils.format(WxMpConstants.BASE_ACCESS_TOKEN_URL, mpAppid, mpSecret), WxMpBaseAccessToken.class, null);
		cacheService.set(key, token, token.getExpiresIn() - 200, TimeUnit.SECONDS);
		log.debug("成功刷新baseAccessToken，appid={}", mpAppid);
		return token;
	}

	@Override
	public WxMpBaseAccessToken getToken() {
		String mpAppid = wxMpService.getWxConfig().getAppId();
		
		CacheService cacheService = getCacheService();
		WxMpBaseAccessToken oldToken = (WxMpBaseAccessToken)cacheService.get(WxMpConstants.BASE_ACCESS_TOKEN_KEY+ ":" + mpAppid);
		if(oldToken == null) {
			return this.checkAndRefreshToken();
		}
		return oldToken;
	}
	
	private CacheService getCacheService() {
		return SpringContextUtil.getBean(CacheService.class);
	}

}
