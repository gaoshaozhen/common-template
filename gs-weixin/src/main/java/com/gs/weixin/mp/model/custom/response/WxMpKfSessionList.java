package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfSessionList implements Serializable {
  private static final long serialVersionUID = -7680371346226640206L;

  /**
   * 会话列表
   */
  @JacksonXmlProperty(localName ="sessionlist")
  private List<WxMpKfSession> kfSessionList;

}
