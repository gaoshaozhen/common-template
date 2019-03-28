package com.gs.weixin.common.event;

import org.springframework.context.ApplicationEvent;

import com.gs.weixin.mp.model.WxMpCommonMessage;

public class WxMpCommonMessageEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public WxMpCommonMessageEvent(WxMpCommonMessage source) {
		super(source);
	}

}
