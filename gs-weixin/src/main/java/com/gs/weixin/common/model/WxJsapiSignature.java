package com.gs.weixin.common.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * jspai signature.
 */
@Setter
@Getter
@ToString
public class WxJsapiSignature implements Serializable {
  private static final long serialVersionUID = -1116808193154384804L;

  private String appId;

  private String nonceStr;

  private long timestamp;

  private String url;

  private String signature;

}
