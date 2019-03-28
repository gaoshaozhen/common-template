package com.gs.weixin.mp.model.template;


import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@JacksonXmlRootElement(localName ="xml")
@Data
public class WxMpTemplateIndustry implements Serializable {
  private static final long serialVersionUID = -7700398224795914722L;

  @JacksonXmlProperty(localName ="primary_industry")
  private Industry primaryIndustry;

  @JacksonXmlProperty(localName ="second_industry")
  private Industry secondIndustry;

  public WxMpTemplateIndustry() {
  }

  public WxMpTemplateIndustry(Industry primaryIndustry, Industry secondIndustry) {
    this.primaryIndustry = primaryIndustry;
    this.secondIndustry = secondIndustry;
  }

  @Data
  public static class Industry implements Serializable {
    private static final long serialVersionUID = -1707184885588012142L;
    private String id;
    private String firstClass;
    private String secondClass;

    public Industry() {
    }

    public Industry(String id) {
      this.id = id;
    }

    public Industry(String id, String firstClass, String secondClass) {
      this.id = id;
      this.firstClass = firstClass;
      this.secondClass = secondClass;
    }
  }
}
