package com.gs.weixin.mp.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.mp.config.WxMpConfig;

public interface WxMpService {
	WxMpBaseAccessTokenService getWxMpBaseAccessTokenService();	
	WxMpWebAccessTokenService getWxMpWebAccessTokenService();
	WxMpConfig getWxConfig();
	WxMpMaterialService getWxMpMaterialService();
	WxMpJsapiTicketService getWxMpJsapiTicketService();
	WxMpCallbackCheckService getWxMpCallbackCheckService();
	WxMpTemplateMsgService getWxMpTemplateMsgService();
	WxMpSubscribeMsgService getWxSubcribeMsgService();
	WxMpCustomService getWxMpCustomService();
	WxMpDataCubeService getWxMpDataCubeService();
	WxMpMenuService getWxMpMenuService();
	WxMpUserService getWxMpUserService();
	
	<T>T executeByPost(String uri, Class<T> resClass, Object data);
	<T>T executeByPost(String uri, TypeReference<T> target, Object data);
	String getContentByPost(String uri, Object data);
	String getContentByGet(String uri);
	
}
