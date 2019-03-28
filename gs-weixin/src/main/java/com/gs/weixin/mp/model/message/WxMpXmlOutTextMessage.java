package com.gs.weixin.mp.model.message;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gs.weixin.mp.WxMpConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JacksonXmlRootElement(localName ="xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutTextMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -3972786455288763361L;

  @JacksonXmlProperty(localName ="Content")
  private String content;

  public WxMpXmlOutTextMessage() {
    this.msgType = WxMpConstants.XmlMsgType.TEXT;
  }

}
