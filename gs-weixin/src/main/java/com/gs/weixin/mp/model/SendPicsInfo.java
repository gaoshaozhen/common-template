package com.gs.weixin.mp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@JacksonXmlRootElement(localName ="SendPicsInfo")
@Data
public class SendPicsInfo implements Serializable {
  private static final long serialVersionUID = -4572837013294199227L;

  @JacksonXmlProperty(localName ="PicList")
  protected final List<Item> picList = new ArrayList<>();

  @JacksonXmlProperty(localName ="Count")
  private Long count;


  @JacksonXmlRootElement(localName ="item")
  @Data
  public static class Item implements Serializable {
    private static final long serialVersionUID = 7706235740094081194L;

    @JacksonXmlProperty(localName ="PicMd5Sum")
    private String picMd5Sum;

  }
}
