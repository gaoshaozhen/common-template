package com.gs.weixin.common.chain;

import org.apache.commons.chain.impl.ContextBase;
import com.gs.weixin.mp.model.WxMpCommonMessage;
import com.gs.weixin.mp.model.message.WxMpOutMessage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class WxMpCommonMessageContextBase extends ContextBase {
	private static final long serialVersionUID = 1L;  
	
	@Getter
	private final WxMpCommonMessage wxMpCommonMessage;
	
	@Setter
	@Getter
	private WxMpOutMessage WxMpOutMessage;
	
	private final String appid;
	
	public WxMpCommonMessageContextBase(WxMpCommonMessage wxMpCommonMessage, String appid) {
		this.wxMpCommonMessage = wxMpCommonMessage;
		this.appid = appid;
	}

}
