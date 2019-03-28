package com.gs.weixin.mp.config;

import com.gs.weixin.common.service.CacheService;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.impl.WxMpServiceImpl;

/**
 * 
 * @author gaosz
 *
 */
public class WxMpConfigStorage implements WxMpConfig{

	private WxMpService wxMpService;
	private CacheService cacheService;
	private String appid;
	private String secret;
	private String aesKey;
	
	public WxMpConfigStorage(String appid, String secret, String aesKey, CacheService cacheService) {
		this.appid = appid;
		this.secret = secret;
		this.aesKey = aesKey;
		this.wxMpService =  new WxMpServiceImpl(this);
		this.cacheService = cacheService;
	}
	
	@Override
	public String getAppId() {
		return appid;
	}

	@Override
	public String getSecret() {
		return secret;
	}

	@Override
	public String getAesKey() {
		return aesKey;
	}

	@Override
	public boolean autoRefreshToken() {
		return false;
	}

	@Override
	public WxMpService getWxMpService() {
	
		return wxMpService;
	}

	@Override
	public CacheService getCacheService() {
		return cacheService;
	}
}
