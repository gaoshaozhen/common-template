package com.gs.weixin.common.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpBaseAccessToken implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn = -1;
}
