package com.gs.weixin.common.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxCardApiSignature implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appId;

  private String cardId;

  private String cardType;

  private String locationId;

  private String code;

  private String openId;

  private Long timestamp;

  private String nonceStr;

  private String signature;

}
