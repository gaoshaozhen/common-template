package com.gs.weixin.mp.model.custom.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Binary Wang
 */
@Data
public class WxMpKfOnlineList implements Serializable {
  private static final long serialVersionUID = -6154705288500854617L;

  @JacksonXmlProperty(localName ="kf_online_list")
  private List<WxMpKfInfo> kfOnlineList;
}
