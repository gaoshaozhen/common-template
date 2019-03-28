package com.gs.weixin.mp.model.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gs.weixin.mp.WxMpConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JacksonXmlRootElement(localName ="xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutNewsMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -4604402850905714772L;

  @JacksonXmlProperty(localName ="Articles")
  protected final List<Item> articles = new ArrayList<>();
  
  @JacksonXmlProperty(localName ="ArticleCount")
  protected int articleCount;

  public WxMpXmlOutNewsMessage() {
    this.msgType = WxMpConstants.XmlMsgType.NEWS;
  }

  public void addArticle(Item item) {
    this.articles.add(item);
    this.articleCount = this.articles.size();
  }

  @JacksonXmlRootElement(localName ="item")
  @Data
  public static class Item implements Serializable {
    private static final long serialVersionUID = -4971456355028904754L;

    @JacksonXmlProperty(localName ="Title")
    private String title;

    @JacksonXmlProperty(localName ="Description")
    private String description;

    @JacksonXmlProperty(localName ="PicUrl")
    private String picUrl;

    @JacksonXmlProperty(localName ="Url")
    private String url;

  }


}
