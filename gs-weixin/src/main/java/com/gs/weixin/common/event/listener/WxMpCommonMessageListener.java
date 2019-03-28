package com.gs.weixin.common.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.gs.weixin.common.event.WxMpCommonMessageEvent;
import com.gs.weixin.mp.model.WxMpCommonMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class WxMpCommonMessageListener implements ApplicationListener<WxMpCommonMessageEvent>{

	
	@Override
	public void onApplicationEvent(WxMpCommonMessageEvent event) {
		log.debug("微信消息:{}", event);
		this.dispatchEvent(event);
	}
	
	/**
	 * TODO 
	 */
	@Async
	private void dispatchEvent(WxMpCommonMessageEvent event) {
		WxMpCommonMessage msg = (WxMpCommonMessage)event.getSource();
	}
}
