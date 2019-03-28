package com.gs.weixin.mp.model.custom.request;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class WxMpKfSessionRequest implements Serializable {
  private static final long serialVersionUID = -5451863610674856927L;

  /**
   * kf_account 完整客服账号，格式为：账号前缀@公众号微信号
   */
  @JacksonXmlProperty(localName ="kf_account")
  private String kfAccount;

  /**
   * openid 客户openid
   */
  @JacksonXmlProperty(localName ="openid")
  private String openid;

  public WxMpKfSessionRequest(String kfAccount, String openid) {
    this.kfAccount = kfAccount;
    this.openid = openid;
  }
}
