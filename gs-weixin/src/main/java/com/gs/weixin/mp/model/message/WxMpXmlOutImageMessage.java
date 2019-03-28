package com.gs.weixin.mp.model.message;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gs.weixin.mp.WxMpConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JacksonXmlRootElement(localName ="xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutImageMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -2684778597067990723L;

  @JacksonXmlProperty(localName ="Image")
  private String mediaId;

  public WxMpXmlOutImageMessage() {
    this.msgType = WxMpConstants.XmlMsgType.IMAGE;
  }

}
