package com.gs.weixin.mp.service.impl;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.mp.model.WxMpUserQuery;
import com.gs.weixin.mp.model.user.WxMpUser;
import com.gs.weixin.mp.model.user.WxMpUserList;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.WxMpUserService;

/**
 * Created by Binary Wang on 2016/7/21.
 */
public class WxMpUserServiceImpl implements WxMpUserService {
	private static final String API_URL_PREFIX = "https://api.weixin.qq.com/cgi-bin/user";
	private WxMpService wxMpService;

	public WxMpUserServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	@Override
	public void userUpdateRemark(String openid, String remark) {
		String url = API_URL_PREFIX + "/info/updateremark";
		ObjectNode node = JsonUtils.createObjectNode();

		node.put("openid", openid);
		node.put("remark", remark);
		this.wxMpService.executeByPost(url, String.class, JsonUtils.writeValueAsString(node));
	}

	@Override
	public WxMpUser userInfo(String openid) {
		return this.userInfo(openid, null);
	}

	@Override
	public WxMpUser userInfo(String openid, String lang) {
		String url = API_URL_PREFIX + "/info";
		lang = lang == null ? "zh_CN" : lang;
		String responseContent = this.wxMpService.getContentByGet(url + "?openid=" + openid + "&lang=" + lang);
		return JsonUtils.from(responseContent, new TypeReference<WxMpUser>() {
		});
	}

	@Override
	public WxMpUserList userList(String next_openid) {
		String url = API_URL_PREFIX + "/get";

		String responseContent = this.wxMpService
				.getContentByGet(url + next_openid == null ? null : "?next_openid=" + next_openid);
		return JsonUtils.from(responseContent, new TypeReference<WxMpUserList>() {
		});
	}

	@Override
	public List<WxMpUser> userInfoList(List<String> openids) {
		return this.userInfoList(new WxMpUserQuery(openids));
	}

	@Override
	public List<WxMpUser> userInfoList(WxMpUserQuery userQuery) {
		String url = API_URL_PREFIX + "/info/batchget";
		String responseContent = this.wxMpService.executeByPost(url, String.class, JsonUtils.toJsonString(userQuery));
		return JsonUtils.from(responseContent, new TypeReference<List<WxMpUser>>() {
		});
	}
}
