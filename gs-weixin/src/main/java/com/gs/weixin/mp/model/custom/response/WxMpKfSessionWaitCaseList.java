package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfSessionWaitCaseList implements Serializable {
  private static final long serialVersionUID = 2432132626631361922L;

  /**
   * count 未接入会话数量
   */
  @JacksonXmlProperty(localName ="count")
  private Long count;

  /**
   * waitcaselist 未接入会话列表，最多返回100条数据
   */
  @JacksonXmlProperty(localName ="waitcaselist")
  private List<WxMpKfSession> kfSessionWaitCaseList;

}
