package com.gs.weixin.mp.service.impl;

import java.util.Objects;

import com.gs.weixin.common.model.WxMpCheckOperator;
import com.gs.weixin.common.model.WxMpNetworkResult;
import com.gs.weixin.mp.WxMpConstants;
import com.gs.weixin.mp.service.WxMpCallbackCheckService;
import com.gs.weixin.mp.service.WxMpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WxMpCallbackCheckServiceImpl implements WxMpCallbackCheckService {

	private WxMpService wxMpService;
	
	public WxMpCallbackCheckServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}
	
	@Override
	public WxMpNetworkResult get() {
		WxMpCheckOperator operator = new WxMpCheckOperator();
		operator.setAction("all");
		operator.setCheckOperator("DEFAULT");
		WxMpNetworkResult result = this.wxMpService.executeByPost(WxMpConstants.CALLBACK_CHECK_URL, WxMpNetworkResult.class, operator);
		log.debug("callback[appid={}]:{}", this.wxMpService.getWxConfig().getAppId(), Objects.toString(result));
		return null;
	}

}
