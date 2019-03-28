package com.gs.weixin.mp.service.impl;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.mp.WxApi;
import com.gs.weixin.mp.model.template.WxMpTemplate;
import com.gs.weixin.mp.model.template.WxMpTemplateIndustry;
import com.gs.weixin.mp.model.template.WxMpTemplateList;
import com.gs.weixin.mp.model.template.WxMpTemplateMessage;
import com.gs.weixin.mp.service.WxMpService;
import com.gs.weixin.mp.service.WxMpTemplateMsgService;

public class WxMpTemplateMsgServiceImpl implements WxMpTemplateMsgService {

	private WxMpService wxMpService;
	
	public WxMpTemplateMsgServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	@Override
	public boolean setIndustry(WxMpTemplateIndustry wxMpIndustry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WxMpTemplateIndustry getIndustry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendTemplateMsg(WxMpTemplateMessage templateMessage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addTemplate(String shortTemplateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WxMpTemplate> getAllPrivateTemplate() {		
		String res = wxMpService.getContentByPost(WxApi.TEMPLATE_GET_ALL, null);
		return JsonUtils.from(res, new TypeReference<WxMpTemplateList>() {}).getTemplateList();
	}

	@Override
	public boolean delPrivateTemplate(String templateId) {
		// TODO Auto-generated method stub
		return false;
	}

}
