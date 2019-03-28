package com.gs.weixin.mp.model.message;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gs.weixin.mp.WxMpConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JacksonXmlRootElement(localName ="xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutVoiceMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = 240367390249860551L;

  @JacksonXmlProperty(localName ="Voice")
  private String mediaId;

  public WxMpXmlOutVoiceMessage() {
    this.msgType = WxMpConstants.XmlMsgType.VOICE;
  }

}
