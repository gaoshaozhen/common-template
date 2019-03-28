package com.gs.weixin.mp.model.message;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@JacksonXmlRootElement(localName ="xml")
@Data
public abstract class WxMpXmlOutMessage implements Serializable {
  private static final long serialVersionUID = -381382011286216263L;

  @JacksonXmlProperty(localName ="ToUserName")
  protected String toUserName;

  @JacksonXmlProperty(localName ="FromUserName")
  protected String fromUserName;

  @JacksonXmlProperty(localName ="CreateTime")
  protected Long createTime;

  @JacksonXmlProperty(localName ="MsgType")
  protected String msgType;

}
