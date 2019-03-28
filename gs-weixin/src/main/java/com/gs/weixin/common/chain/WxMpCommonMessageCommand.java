package com.gs.weixin.common.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.gs.weixin.common.WxMpMessageSessionManager;
import com.gs.weixin.common.event.WxMpCommonMessageEvent;
import com.gs.weixin.common.event.publisher.CustomizePublisher;
import com.gs.weixin.mp.model.WxMpCommonMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("wxMpCommonMessageCommand")
public class WxMpCommonMessageCommand implements Command {
	
	@Autowired
	private CustomizePublisher customizePublisher;
	
	@Autowired
	private WxMpMessageSessionManager wxMpMessageSessionManager;
	
	@Override
	public boolean execute(Context context) throws Exception {
		WxMpCommonMessageContextBase base = (WxMpCommonMessageContextBase)context;
		WxMpCommonMessage msg = base.getWxMpCommonMessage();
		
		log.debug("{}", base);
		if(!wxMpMessageSessionManager.isNew(String.format("%d-%s", msg.getFriendUserName(), msg.getCreateTime()))) {
			return true;
		}
		customizePublisher.publish(new WxMpCommonMessageEvent(base.getWxMpCommonMessage()));
		return true;
	}

}
