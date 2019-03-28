package com.gs.weixin.common.chain;

import javax.annotation.PostConstruct;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gs.weixin.mp.model.WxMpCommonMessage;
import lombok.extern.slf4j.Slf4j;  

@Slf4j
@Component
public class WxMpCommonMessageHandleChain extends ChainBase { 
	
	@Autowired()
	private WxMpCommonMessageCommand wxMpCommonMessageCommand;
	
	@PostConstruct
	public void init() {  
        addCommand(wxMpCommonMessageCommand);  
    }  
	
	public static void main(String[] args) throws Exception {  
        Command process = new WxMpCommonMessageHandleChain(); 
        WxMpCommonMessage wxMpCommonMessage = new WxMpCommonMessage();
        wxMpCommonMessage.setToUser("test");
        Context ctx = new WxMpCommonMessageContextBase(wxMpCommonMessage, "sdsd");  
        process.execute(ctx);  
        log.debug("{}", ctx);
    }  
}
