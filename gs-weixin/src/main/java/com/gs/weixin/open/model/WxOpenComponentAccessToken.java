package com.gs.weixin.open.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxOpenComponentAccessToken implements Serializable {
  private static final long serialVersionUID = 2134550135400443725L;

  @JsonProperty("component_access_token")
  private String componentAccessToken;

  @JsonProperty("expire_in")
  private int expiresIn = -1;
}
