package com.gs.weixin.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
@Setter
@Getter
@ToString
public class WxMpCheckOperator {
	private String action;
	
	@JsonProperty("check_operator")
	private String checkOperator;
}
