package com.gs.weixin.mp.model.custom.request;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class WxMpKfAccountRequest implements Serializable {
  private static final long serialVersionUID = -5451863610674856927L;

  /**
   * kf_account.
   * 完整客服账号，格式为：账号前缀@公众号微信号
   */
  @JacksonXmlProperty(localName ="kf_account")
  private String kfAccount;

  /**
   * nickname.
   * 客服昵称，最长6个汉字或12个英文字符
   */
  @JacksonXmlProperty(localName ="nickname")
  private String nickName;

  /**
   * invite_wx.
   * 接收绑定邀请的客服微信号
   */
  @JacksonXmlProperty(localName ="invite_wx")
  private String inviteWx;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
