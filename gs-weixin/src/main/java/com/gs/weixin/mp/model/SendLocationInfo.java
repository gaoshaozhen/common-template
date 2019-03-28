package com.gs.weixin.mp.model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@JacksonXmlRootElement(localName="SendLocationInfo")
@Data
public class SendLocationInfo implements Serializable {
  private static final long serialVersionUID = 6633214140499161130L;

  @JacksonXmlProperty(localName ="Location_X")
  private String locationX;

  @JacksonXmlProperty(localName ="Location_Y")
  private String locationY;

  @JacksonXmlProperty(localName ="Scale")
  private String scale;

  @JacksonXmlProperty(localName ="Label")
  private String label;

  @JacksonXmlProperty(localName ="Poiname")
  private String poiName;
}