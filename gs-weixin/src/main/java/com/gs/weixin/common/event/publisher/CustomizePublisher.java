package com.gs.weixin.common.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.gs.weixin.common.event.WxMpCommonMessageEvent;

@Component
public class CustomizePublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	 
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
		
	}
	
	public void publish(WxMpCommonMessageEvent event) {
      applicationEventPublisher.publishEvent(event);
	}

}
