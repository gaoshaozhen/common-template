package com.gs.weixin.mp.model.message;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName ="xml")
public class WxMpOutMessage {
 	@JacksonXmlProperty(localName ="ToUserName")
	  protected String toUserName;

	  @JacksonXmlProperty(localName ="FromUserName")
	  protected String fromUserName;

	  @JacksonXmlProperty(localName ="CreateTime")
	  protected Long createTime;

	  @JacksonXmlProperty(localName ="MsgType")
	  protected String msgType;
}
