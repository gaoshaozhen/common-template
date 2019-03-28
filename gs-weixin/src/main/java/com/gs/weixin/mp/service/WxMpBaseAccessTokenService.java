package com.gs.weixin.mp.service;

import org.springframework.stereotype.Component;

import com.gs.weixin.common.model.WxMpBaseAccessToken;

@Component
public interface WxMpBaseAccessTokenService {
	WxMpBaseAccessToken checkAndRefreshToken();
	WxMpBaseAccessToken getToken();
}
