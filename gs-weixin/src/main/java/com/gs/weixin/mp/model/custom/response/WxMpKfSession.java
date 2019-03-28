package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfSession implements Serializable {
  private static final long serialVersionUID = 7804332813164994062L;

  /**
   * kf_account 正在接待的客服，为空表示没有人在接待
   */
  @JacksonXmlProperty(localName ="kf_account")
  private String kfAccount;

  /**
   * createtime 会话接入的时间，UNIX时间戳
   * 该返回值 存在于 获取客服会话列表接口
   */
  @JacksonXmlProperty(localName ="createtime")
  private long createTime;

  /**
   * latest_time 粉丝的最后一条消息的时间，UNIX时间戳
   * 该返回值 存在于 获取未接入会话列表接口
   */
  @JacksonXmlProperty(localName ="latest_time")
  private long latestTime;

  /**
   * openid 客户openid
   */
  @JacksonXmlProperty(localName ="openid")
  private String openid;

}
