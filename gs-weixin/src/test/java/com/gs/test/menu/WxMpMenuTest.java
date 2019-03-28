package com.gs.test.menu;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.mp.model.menu.WxMenu;
import com.gs.weixin.mp.model.menu.WxMenuButton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class WxMpMenuTest {

	@Autowired
	private WxMpConfig wxMpConfig;
	
	@Test
	public void testMenuCreateWxMenu() {
		WxMenu menu = new WxMenu();
		List<WxMenuButton> buttons = new ArrayList<>();
		menu.setButtons(buttons);
		WxMenuButton b1 = new WxMenuButton();
		b1.setKey("sd");
		b1.setName("test");
		b1.setType("click");
		b1.setSubButtons(null);
		buttons.add(b1);
		wxMpConfig.getWxMpService().getWxMpMenuService().menuCreate(menu );
	}

	@Test
	public void testMenuCreateString() {
		WxMenu menu = new WxMenu();
		List<WxMenuButton> buttons = new ArrayList<>();
		menu.setButtons(buttons);
		WxMenuButton b1 = new WxMenuButton();
		b1.setKey("sd");
		b1.setName("test");
		b1.setType("click");
		b1.setSubButtons(null);
		buttons.add(b1);
		wxMpConfig.getWxMpService().getWxMpMenuService().menuCreate(JsonUtils.toJsonString(menu));
	}

	@Test
	public void testMenuDelete() {
//		wxMpConfig.getWxMpService().getWxMpMenuService().menuDelete();
	}

	@Test
	public void testMenuDeleteString() {
		String menuId = "";
		wxMpConfig.getWxMpService().getWxMpMenuService().menuDelete(menuId );
	}

	@Test
	public void testMenuGet() {
		wxMpConfig.getWxMpService().getWxMpMenuService().menuGet();
	}

	@Test
	public void testMenuTryMatch() {
		String userid = "";
		wxMpConfig.getWxMpService().getWxMpMenuService().menuTryMatch(userid );
	}

	@Test
	public void testGetSelfMenuInfo() {
		wxMpConfig.getWxMpService().getWxMpMenuService().getSelfMenuInfo();
	}

}
