package com.gs.weixin.mp.model.message;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gs.weixin.mp.WxMpConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JacksonXmlRootElement(localName ="xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutTransferKefuMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = 1850903037285841322L;

  @JacksonXmlProperty(localName ="TransInfo")
  protected TransInfo transInfo;

  public WxMpXmlOutTransferKefuMessage() {
    this.msgType = WxMpConstants.KefuMsgType.TRANSFER_CUSTOMER_SERVICE;
  }

  @JacksonXmlRootElement(localName ="TransInfo")
  @Data
  public static class TransInfo implements Serializable {
    private static final long serialVersionUID = -6317885617135706056L;

    @JacksonXmlProperty(localName ="KfAccount")
    private String kfAccount;

  }
}
