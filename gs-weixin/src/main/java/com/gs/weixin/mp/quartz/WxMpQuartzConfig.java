package com.gs.weixin.mp.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;

import com.gs.weixin.mp.config.WxMpConfig;

//@Configuration
//@Profile("mp")
public class WxMpQuartzConfig {
	
	@Autowired
	private WxMpConfig mpConfig;
	
	@Bean
	public WxMpBaseAccessTokenTask WxMpBaseAccessTokenTask() {
		return new WxMpBaseAccessTokenTask();
	}
	
    @Scheduled(cron="0/3 * * * * ?")
	public void testMaterialCount() {
//    	mpConfig.getWxMpService().getWxMpMaterialService().materialCount();
    	mpConfig.getWxMpService().getWxMpJsapiTicketService().getWxJsapiSignature("http://www.baidu.com");
	}

    @Scheduled(cron="0 0/1 * * * ?")
    public void testByMinut() {
    	mpConfig.getWxMpService().getWxMpCallbackCheckService().get();
    }
}
