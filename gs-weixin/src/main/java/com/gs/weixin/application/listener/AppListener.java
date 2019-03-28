package com.gs.weixin.application.listener;

import org.springframework.stereotype.Component;

import com.gs.weixin.common.model.CommonConfig;
import com.gs.weixin.common.utils.JsonUtils;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.*;
import org.springframework.data.redis.core.RedisTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AppListener implements ApplicationListener<ApplicationStartedEvent> {
	
	@Autowired
	private CommonConfig commonConfig;
	
//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		log.info("{}启动完成", event.getApplicationContext().getId());
		log.debug("commonConfig:\n{}", JsonUtils.toJsonStringAndFormat(commonConfig));
//		log.debug("redis:{}", redisTemplate.toString());
	}
}
