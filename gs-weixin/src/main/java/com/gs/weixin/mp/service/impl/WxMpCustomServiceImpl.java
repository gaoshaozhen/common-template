package com.gs.weixin.mp.service.impl;

import java.io.File;
import java.util.Date;

import com.gs.weixin.mp.model.custom.WxMpKefuMessage;
import com.gs.weixin.mp.model.custom.request.WxMpKfAccountRequest;
import com.gs.weixin.mp.model.custom.response.WxMpKfList;
import com.gs.weixin.mp.model.custom.response.WxMpKfMsgList;
import com.gs.weixin.mp.model.custom.response.WxMpKfOnlineList;
import com.gs.weixin.mp.model.custom.response.WxMpKfSessionGetResult;
import com.gs.weixin.mp.model.custom.response.WxMpKfSessionList;
import com.gs.weixin.mp.model.custom.response.WxMpKfSessionWaitCaseList;
import com.gs.weixin.mp.service.WxMpCustomService;
import com.gs.weixin.mp.service.WxMpService;

public class WxMpCustomServiceImpl implements WxMpCustomService{

	private WxMpService wxMpService;
	
	public WxMpCustomServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	@Override
	public boolean sendCustomMessage(WxMpKefuMessage message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WxMpKfList kfList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpKfOnlineList kfOnlineList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean kfAccountAdd(WxMpKfAccountRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfAccountUpdate(WxMpKfAccountRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfAccountInviteWorker(WxMpKfAccountRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfAccountUploadHeadImg(String kfAccount, File imgFile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfAccountDel(String kfAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfSessionCreate(String openid, String kfAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kfSessionClose(String openid, String kfAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WxMpKfSessionGetResult kfSessionGet(String openid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpKfSessionList kfSessionList(String kfAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpKfSessionWaitCaseList kfSessionGetWaitCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpKfMsgList kfMsgList(Date startTime, Date endTime, Long msgId, Integer number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpKfMsgList kfMsgList(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
