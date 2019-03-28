package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfList implements Serializable {
  private static final long serialVersionUID = -8194193505173564894L;

  @JacksonXmlProperty(localName ="kf_list")
  private List<WxMpKfInfo> kfList;


}
