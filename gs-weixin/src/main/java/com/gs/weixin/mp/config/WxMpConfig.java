package com.gs.weixin.mp.config;

import com.gs.weixin.common.service.CacheService;
import com.gs.weixin.mp.service.WxMpService;

public interface WxMpConfig {
	  
	  String getAppId();

	  String getSecret();

	  String getAesKey();
	  
	  WxMpService getWxMpService();
	  
	  /**
	   * 	是否自动刷新token
	   */
	  boolean autoRefreshToken();
	  
	  CacheService getCacheService();
	  
}
