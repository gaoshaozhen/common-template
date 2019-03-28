package com.gs.test.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.mp.config.WxMpConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class WxTemplateTest {
	
	@Autowired
	private WxMpConfig wxMpConfig;
	
	@Test
	public void testGetAllTemplate() {
		wxMpConfig.getWxMpService().getWxMpTemplateMsgService().getAllPrivateTemplate();
	}

	@Test
	public void testGetIndustry() {
		wxMpConfig.getWxMpService().getWxMpTemplateMsgService().getIndustry();
	}

}
