package com.gs.weixin.mp.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.common.WxApiClient;
import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.mp.service.WxMpBaseAccessTokenService;
import com.gs.weixin.mp.service.WxMpCallbackCheckService;
import com.gs.weixin.mp.service.WxMpCustomService;
import com.gs.weixin.mp.service.WxMpDataCubeService;
import com.gs.weixin.mp.service.WxMpJsapiTicketService;
import com.gs.weixin.mp.service.WxMpMaterialService;
import com.gs.weixin.mp.service.WxMpMenuService;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.WxMpSubscribeMsgService;
import com.gs.weixin.mp.service.WxMpTemplateMsgService;
import com.gs.weixin.mp.service.WxMpUserService;
import com.gs.weixin.mp.service.WxMpWebAccessTokenService;

public class WxMpServiceImpl implements WxMpService{
	private WxMpConfig wxMpConfig;
	private WxMpBaseAccessTokenService wxMpBaseAccessTokenService;
	private WxMpWebAccessTokenService wxMpWebAccessTokenService;
	private WxMpMaterialService wxMpMaterialService;
	private WxMpJsapiTicketService wxMpJsapiTicketService;
	private WxMpCallbackCheckService wxMpCallbackCheckService;

	private WxMpTemplateMsgService wxMpTemplateMsgService;
	private WxMpSubscribeMsgService wxMpSubscribeMsgService;
	private WxMpCustomService wxMpCustomService;
	private WxMpDataCubeService wxMpDataCubeService;
	private WxMpMenuService wxMpMenuService;
	private WxMpUserService wxMpUserService;
	
	public WxMpServiceImpl(WxMpConfig wxMpConfig) {
		this.wxMpConfig = wxMpConfig;
		this.wxMpBaseAccessTokenService = new WxMpBaseAccessTokenServiceImpl(this);
		this.wxMpMaterialService = new WxMpMaterialServiceImpl(this);
		this.wxMpJsapiTicketService= new WxMpJsapiTicketServiceImpl(this);
		this.wxMpJsapiTicketService= new WxMpJsapiTicketServiceImpl(this);
		this.wxMpCallbackCheckService = new WxMpCallbackCheckServiceImpl(this);
		this.wxMpTemplateMsgService = new WxMpTemplateMsgServiceImpl(this);
		this.wxMpSubscribeMsgService = new WxMpSubscribeMsgServiceImpl(this);
		this.wxMpCustomService = new WxMpCustomServiceImpl(this);
		this.wxMpDataCubeService = new WxMpDataCubeServiceImpl(this);
		this.wxMpMenuService = new WxMpMenuServiceImpl(this);
		this.wxMpUserService = new WxMpUserServiceImpl(this);
	}
	
	@Override
	public WxMpCallbackCheckService getWxMpCallbackCheckService() {
		return this.wxMpCallbackCheckService;
	}
	
	@Override
	public WxMpBaseAccessTokenService getWxMpBaseAccessTokenService() {
		
		return wxMpBaseAccessTokenService;
	}

	@Override
	public WxMpWebAccessTokenService getWxMpWebAccessTokenService() {
		
		return wxMpWebAccessTokenService;
	}

	@Override
	public WxMpConfig getWxConfig() {
		return this.wxMpConfig;
	}


	@Override
	public <T> T executeByPost(String uri, Class<T> resClass, Object data) {
		uri = this.buildUrl(uri);
		return WxApiClient.executeByPost(uri, resClass, data);
	}

	@Override
	public <T> T executeByPost(String uri, TypeReference<T> resClass, Object data) {
		uri = this.buildUrl(uri);
		return WxApiClient.executeByPost(uri, resClass, data);
	}
	
	@Override
	public String getContentByPost(String uri, Object data) {
		uri = this.buildUrl(uri);
		return WxApiClient.getContentByPost(uri, data);
	}

	@Override
	public WxMpMaterialService getWxMpMaterialService() {
		
		return wxMpMaterialService;
	}

	@Override
	public WxMpJsapiTicketService getWxMpJsapiTicketService() {
		return this.wxMpJsapiTicketService;
	}

	@Override
	public WxMpTemplateMsgService getWxMpTemplateMsgService() {
		return wxMpTemplateMsgService;
	}

	@Override
	public WxMpSubscribeMsgService getWxSubcribeMsgService() {
		return wxMpSubscribeMsgService;
	}

	@Override
	public WxMpCustomService getWxMpCustomService() {
		return wxMpCustomService;
	}

	@Override
	public WxMpDataCubeService getWxMpDataCubeService() {
		return wxMpDataCubeService;
	}

	@Override
	public String getContentByGet(String uri) {
		uri = this.buildUrl(uri);
		return WxApiClient.getContentByGet(uri);
	}

	@Override
	public WxMpMenuService getWxMpMenuService() {
		return wxMpMenuService;
	}
	
	private String buildUrl(String uri) {
		if(uri.indexOf('?') == -1) {
			uri += "?";
		}
		uri += "&access_token="+this.wxMpBaseAccessTokenService.getToken().getAccessToken();
		return uri;
	}

	@Override
	public WxMpUserService getWxMpUserService() {
		return this.wxMpUserService;
	} 
	
}
