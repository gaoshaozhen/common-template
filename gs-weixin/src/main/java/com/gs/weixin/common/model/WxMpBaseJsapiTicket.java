package com.gs.weixin.common.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpBaseJsapiTicket implements Serializable {
  private static final long serialVersionUID = 1L;

  private String ticket;

  @JsonProperty("expires_in")
  private Integer expiresIn = -1;
}
