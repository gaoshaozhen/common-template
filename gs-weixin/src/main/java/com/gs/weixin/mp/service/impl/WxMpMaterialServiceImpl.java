package com.gs.weixin.mp.service.impl;

import java.io.File;
import java.io.InputStream;

import com.gs.weixin.mp.WxMpConstants;
import com.gs.weixin.mp.model.material.WxMpMaterial;
import com.gs.weixin.mp.model.material.WxMpMaterialArticleUpdate;
import com.gs.weixin.mp.model.material.WxMpMaterialCountResult;
import com.gs.weixin.mp.model.material.WxMpMaterialFileBatchGetResult;
import com.gs.weixin.mp.model.material.WxMpMaterialNews;
import com.gs.weixin.mp.model.material.WxMpMaterialNewsBatchGetResult;
import com.gs.weixin.mp.model.material.WxMpMaterialUploadResult;
import com.gs.weixin.mp.model.material.WxMpMaterialVideoInfoResult;
import com.gs.weixin.mp.model.media.WxMediaImgUploadResult;
import com.gs.weixin.mp.model.media.WxMediaUploadResult;
import com.gs.weixin.mp.service.WxMpMaterialService;
import com.gs.weixin.mp.service.WxMpService;

public class WxMpMaterialServiceImpl implements WxMpMaterialService{

	private WxMpService wxMpService;
	
	public WxMpMaterialServiceImpl(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}
	
	@Override
	public WxMediaUploadResult mediaUpload(String mediaType, File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMediaUploadResult mediaUpload(String mediaType, String fileType, InputStream inputStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File mediaDownload(String mediaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMediaImgUploadResult mediaImgUpload(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpMaterialUploadResult materialFileUpload(String mediaType, WxMpMaterial material) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpMaterialUploadResult materialNewsUpload(WxMpMaterialNews news) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream materialImageOrVoiceDownload(String mediaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpMaterialVideoInfoResult materialVideoInfo(String mediaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpMaterialNews materialNewsInfo(String mediaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean materialNewsUpdate(WxMpMaterialArticleUpdate wxMpMaterialArticleUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean materialDelete(String mediaId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WxMpMaterialCountResult materialCount() {
		
		return this.wxMpService.executeByPost(WxMpConstants.MATERIAL_GET_COUNT_URL, WxMpMaterialCountResult.class, null);
	}

	@Override
	public WxMpMaterialNewsBatchGetResult materialNewsBatchGet(int offset, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxMpMaterialFileBatchGetResult materialFileBatchGet(String type, int offset, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
