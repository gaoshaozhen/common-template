package com.gs.weixin.open.config;

import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.open.model.WxOpenComponentAccessToken;

/**
 * @author <a href="https://github.com/007gzs">007</a>
 */
public class WxOpenConfigStorage implements WxOpenConfig{

	@Override
	public String getComponentAppId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setComponentAppId(String componentAppId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComponentAppSecret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setComponentAppSecret(String componentAppSecret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComponentToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setComponentToken(String componentToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComponentAesKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setComponentAesKey(String componentAesKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComponentAccessToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isComponentAccessTokenExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void expireComponentAccessToken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComponentAccessTokent(WxOpenComponentAccessToken componentAccessToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WxMpConfig getWxMpConfigStorage(String appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateComponentAccessTokent(String componentAccessToken, int expiresInSeconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAuthorizerRefreshToken(String appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorizerRefreshToken(String appId, String authorizerRefreshToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAuthorizerAccessToken(String appId) {
		// TODO Auto-generated method stub
		return null;
	}
}
