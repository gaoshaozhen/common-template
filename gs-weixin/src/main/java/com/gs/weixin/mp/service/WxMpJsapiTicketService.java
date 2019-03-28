package com.gs.weixin.mp.service;

import org.springframework.stereotype.Component;

import com.gs.weixin.common.model.WxJsapiSignature;
import com.gs.weixin.common.model.WxMpBaseJsapiTicket;

@Component
public interface WxMpJsapiTicketService {
	WxMpBaseJsapiTicket checkAndRefreshTicket();
	WxMpBaseJsapiTicket getTicket();
	WxJsapiSignature createWxJsapiSignature(String url);
	WxJsapiSignature getWxJsapiSignature(String url);
}
