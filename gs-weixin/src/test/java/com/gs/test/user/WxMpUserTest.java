package com.gs.test.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.mp.model.WxMpUserQuery;
import com.gs.weixin.mp.model.user.WxMpUser;
import com.gs.weixin.mp.model.user.WxMpUserList;
import com.gs.weixin.mp.service.WxMpUserService;
import lombok.extern.slf4j.Slf4j;
import java.util.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class WxMpUserTest {

	@Autowired
	private WxMpConfig wxMpConfig;
	
	@Test
	public void testUserUpdateRemark() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		service.userUpdateRemark("ds", "sd");
	}

	@Test
	public void testUserInfoString() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		List<String> list = new ArrayList<>();
		service.userInfo("");
	}

	@Test
	public void testUserInfoStringString() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		WxMpUser user = service.userInfo("", "cn");
	}

	@Test
	public void testUserList() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		
		WxMpUserList list = service.userList("");
	}

	@Test
	public void testUserInfoListListOfString() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		List<String> openids = new ArrayList<>();
		service.userInfoList(openids);
	}

	@Test
	public void testUserInfoListWxMpUserQuery() {
		WxMpUserService service = wxMpConfig.getWxMpService().getWxMpUserService();
		WxMpUserQuery userQuery = new WxMpUserQuery();
		service.userInfoList(userQuery);
	}
}
