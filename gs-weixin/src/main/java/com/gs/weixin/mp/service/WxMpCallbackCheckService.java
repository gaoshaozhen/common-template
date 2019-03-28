package com.gs.weixin.mp.service;

import org.springframework.stereotype.Component;

import com.gs.weixin.common.model.WxMpNetworkResult;

@Component
public interface WxMpCallbackCheckService {
	WxMpNetworkResult get();
}
