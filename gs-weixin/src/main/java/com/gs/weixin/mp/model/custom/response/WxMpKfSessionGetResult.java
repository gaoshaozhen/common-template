package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfSessionGetResult implements Serializable {
  private static final long serialVersionUID = 8474846575200033152L;

  /**
   * kf_account 正在接待的客服，为空表示没有人在接待
   */
  @JacksonXmlProperty(localName ="kf_account")
  private String kfAccount;

  /**
   * createtime 会话接入的时间 ，UNIX时间戳
   */
  @JacksonXmlProperty(localName ="createtime")
  private long createTime;

}
