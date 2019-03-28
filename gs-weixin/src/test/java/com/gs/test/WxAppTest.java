package com.gs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.common.event.WxMpCommonMessageEvent;
import com.gs.weixin.common.event.publisher.CustomizePublisher;
import com.gs.weixin.mp.model.WxMpCommonMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class WxAppTest {
	
	@Autowired
	private CustomizePublisher customizePublisher;
	
	@Test
	public void testCommonMessage() {
		
		WxMpCommonMessage message = new WxMpCommonMessage();
		message.setToUser("sd");
		WxMpCommonMessageEvent event = new WxMpCommonMessageEvent(message );
		customizePublisher.publish(event );
	}
}
