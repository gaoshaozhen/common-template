package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 *
 * @author Binary Wang
 * @date 2016/7/18
 */
@Data
public class WxMpKfMsgRecord implements Serializable {
  private static final long serialVersionUID = -280692188908528688L;

  /**
   * worker	完整客服帐号，格式为：帐号前缀@公众号微信号
   */
  @JacksonXmlProperty(localName ="worker")
  private String worker;

  /**
   * openid	用户标识
   */
  @JacksonXmlProperty(localName ="openid")
  private String openid;

  /**
   * opercode	操作码，2002（客服发送信息），2003（客服接收消息）
   */
  @JacksonXmlProperty(localName ="opercode")
  private Integer operateCode;

  /**
   * text	聊天记录
   */
  @JacksonXmlProperty(localName ="text")
  private String text;

  /**
   * time	操作时间，unix时间戳
   */
  @JacksonXmlProperty(localName ="time")
  private Long time;

  public String getWorker() {
    return this.worker;
  }

  public void setWorker(String worker) {
    this.worker = worker;
  }

  public String getOpenid() {
    return this.openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Long getTime() {
    return this.time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public Integer getOperateCode() {
    return this.operateCode;
  }

  public void setOperateCode(Integer operateCode) {
    this.operateCode = operateCode;
  }
}
