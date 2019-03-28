package com.gs.weixin.open.config;

import com.gs.weixin.mp.config.WxMpConfig;
import com.gs.weixin.open.model.WxOpenComponentAccessToken;

/**
 * @author <a href="https://github.com/007gzs">007</a>
 */
public interface WxOpenConfig {

  String getComponentAppId();

  void setComponentAppId(String componentAppId);

  String getComponentAppSecret();

  void setComponentAppSecret(String componentAppSecret);

  String getComponentToken();

  void setComponentToken(String componentToken);

  String getComponentAesKey();

  void setComponentAesKey(String componentAesKey);

  String getComponentAccessToken();

  boolean isComponentAccessTokenExpired();

  void expireComponentAccessToken();

  void updateComponentAccessTokent(WxOpenComponentAccessToken componentAccessToken);

  WxMpConfig getWxMpConfigStorage(String appId);

  /**
   * 	应该是线程安全的
   *
   * @param componentAccessToken 新的accessToken值
   * @param expiresInSeconds     过期时间，以秒为单位
   */
  void updateComponentAccessTokent(String componentAccessToken, int expiresInSeconds);

  String getAuthorizerRefreshToken(String appId);

  void setAuthorizerRefreshToken(String appId, String authorizerRefreshToken);

  String getAuthorizerAccessToken(String appId);

}
