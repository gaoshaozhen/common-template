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
public class WxMpXmlOutMusicMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -4159937804975448945L;

  @JacksonXmlProperty(localName ="Music")
  protected final Music music = new Music();

  public WxMpXmlOutMusicMessage() {
    this.msgType = WxMpConstants.XmlMsgType.MUSIC;
  }

  @JacksonXmlRootElement(localName ="Music")
  @Data
  public static class Music implements Serializable {
    private static final long serialVersionUID = -5492592401691895334L;

    @JacksonXmlProperty(localName ="Title")
    private String title;

    @JacksonXmlProperty(localName ="Description")
    private String description;

    @JacksonXmlProperty(localName ="ThumbMediaId")
    private String thumbMediaId;

    @JacksonXmlProperty(localName ="MusicUrl")
    private String musicUrl;

    @JacksonXmlProperty(localName ="HQMusicUrl")
    private String hqMusicUrl;
  }

  public String getTitle() {
    return this.music.title;
  }

  public void setTitle(String title) {
    this.music.title = title;
  }

  public String getDescription() {
    return this.music.description;
  }

  public void setDescription(String description) {
    this.music.description = description;
  }

  public String getThumbMediaId() {
    return this.music.thumbMediaId;
  }

  public void setThumbMediaId(String thumbMediaId) {
    this.music.thumbMediaId = thumbMediaId;
  }

  public String getMusicUrl() {
    return this.music.musicUrl;
  }

  public void setMusicUrl(String musicUrl) {
    this.music.musicUrl = musicUrl;
  }

  public String getHqMusicUrl() {
    return this.music.hqMusicUrl;
  }

  public void setHqMusicUrl(String hqMusicUrl) {
    this.music.hqMusicUrl = hqMusicUrl;
  }

}
