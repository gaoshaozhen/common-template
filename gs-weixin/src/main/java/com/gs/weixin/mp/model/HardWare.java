package com.gs.weixin.mp.model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@JacksonXmlRootElement(localName ="HardWare")
@Data
public class HardWare implements Serializable{
 private static final long serialVersionUID = -1295785297354896461L;

 /**
  * 消息展示，目前支持myrank(排行榜)
  */
 @JacksonXmlProperty(localName ="MessageView")
 private String messageView;
 /**
  * 消息点击动作，目前支持ranklist(点击跳转排行榜)
  */
 @JacksonXmlProperty(localName ="MessageAction")
 private String messageAction;

}
