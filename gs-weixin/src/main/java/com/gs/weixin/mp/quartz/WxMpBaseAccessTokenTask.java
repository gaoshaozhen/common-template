package com.gs.weixin.mp.quartz;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gs.weixin.common.model.CommonConfig;
import com.gs.weixin.mp.config.WxMpConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WxMpBaseAccessTokenTask {
	
	@Autowired
	private CommonConfig commonConfig;
	
	@Autowired
	private WxMpConfig wxMpConfig;
	
	private ScheduledExecutorService scheduleService = Executors.newScheduledThreadPool(1);
	
	@PostConstruct
	public void initTask() {
		if("mp".equalsIgnoreCase(commonConfig.getDeployType()) 
				&& "true".equalsIgnoreCase(commonConfig.getMpTokenAutoRefresh())){
			scheduleService.scheduleWithFixedDelay(()->{
				try {
					refreshWxMpAccessToken();
				}catch(Exception e) {
					log.error("error:{}", e);
				}
			}, 0, 5, TimeUnit.SECONDS);			
		}
	}
	
	private void refreshWxMpAccessToken() {
		wxMpConfig.getWxMpService().getWxMpBaseAccessTokenService().checkAndRefreshToken();
	}
}
