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
public class WxMpXmlOutVideoMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = 1745902309380113978L;

  @JacksonXmlProperty(localName ="Video")
  protected final Video video = new Video();

  public WxMpXmlOutVideoMessage() {
    this.msgType = WxMpConstants.XmlMsgType.VIDEO;
  }

  @JacksonXmlRootElement(localName ="Video")
  @Data
  public static class Video implements Serializable {
    private static final long serialVersionUID = -6445448977569651183L;

    @JacksonXmlProperty(localName ="MediaId")
    private String mediaId;

    @JacksonXmlProperty(localName ="Title")
    private String title;

    @JacksonXmlProperty(localName ="Description")
    private String description;

  }

  public String getMediaId() {
    return this.video.mediaId;
  }

  public void setMediaId(String mediaId) {
    this.video.mediaId = mediaId;
  }

  public String getTitle() {
    return this.video.title;
  }

  public void setTitle(String title) {
    this.video.title = title;
  }

  public String getDescription() {
    return this.video.description;
  }

  public void setDescription(String description) {
    this.video.description = description;
  }
}
