package com.gs.weixin.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gs.weixin.common.WxApiClient;
import com.gs.weixin.common.model.CommonConfig;
import com.gs.weixin.common.service.CacheService;
import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.mp.config.WxMpConfigStorage;
import com.gs.weixin.mp.service.WxMpBaseAccessTokenService;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.impl.WxMpBaseAccessTokenServiceImpl;
import com.gs.weixin.mp.service.impl.WxMpServiceImpl;

@Configuration
@Profile("mp")
public class MpBeans {
	
	@Qualifier("ecacheCacheServiceImpl")
	@Autowired
	private CacheService cacheService;
	
	@Autowired
	private CommonConfig commonConfig;
	
	@Bean
	public WxMpConfig getWxMpConfig() {
		WxMpConfig config = new WxMpConfigStorage(commonConfig.getMpAppid(), commonConfig.getMpSecret(), commonConfig.getMpAesKey(), cacheService);

		return config; 
	}
}
