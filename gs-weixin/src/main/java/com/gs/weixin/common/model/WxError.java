package com.gs.weixin.common.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WxError {	
	private String errcode = "0";
	private String errmsg;
}
