package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 *
 * @author Binary Wang
 * @date 2016/7/15
 */
@Data
public class WxMpKfMsgList implements Serializable {
  private static final long serialVersionUID = 4524296707435188202L;

  @JacksonXmlProperty(localName ="recordlist")
  private List<WxMpKfMsgRecord> records;

  @JacksonXmlProperty(localName ="number")
  private Integer number;

  @JacksonXmlProperty(localName ="msgid")
  private Long msgId;

}
