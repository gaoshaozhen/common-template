package com.gs.weixin.mp.service.impl;

import com.gs.weixin.mp.model.subscribe.WxMpSubscribeMessage;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.WxMpSubscribeMsgService;

public class WxMpSubscribeMsgServiceImpl implements WxMpSubscribeMsgService {

	private WxMpService wxMpService;
	
	public WxMpSubscribeMsgServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	@Override
	public String subscribeMsgAuthorizationUrl(String redirectURI, int scene, String reserved) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sendSubscribeMessage(WxMpSubscribeMessage message) {
		// TODO Auto-generated method stub
		return false;
	}

}
