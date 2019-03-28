package com.gs.weixin.open.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxOpenAuthorizerAccessToken implements Serializable {
  private static final long serialVersionUID = -4069745419280727420L;

  @JsonProperty("component_access_token")
  private String authorizerAccessToken;

  @JsonProperty("expires_in")
  private int expiresIn = -1;
}
