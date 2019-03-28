package com.gs.weixin.common;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.gs.weixin.common.service.CacheService;

@Component
public class WxMpMessageSessionManager {
	
	@Qualifier("ecacheCacheServiceImpl")
	@Autowired(required = false)
	private CacheService cacheService;
	
	public boolean isNew(String sessionId) {
		return cacheService.setIfNull(sessionId, sessionId, 5, TimeUnit.MINUTES);
	}
}
