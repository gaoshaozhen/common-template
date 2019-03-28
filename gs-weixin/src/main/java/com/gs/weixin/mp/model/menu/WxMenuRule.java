package com.gs.weixin.mp.model.menu;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WxMenuRule implements Serializable {
  private static final long serialVersionUID = -4587181819499286670L;

  /**
   * 变态的微信接口，反序列化时这里反人类的使用和序列化时不一样的名字.
   */
  @JsonProperty(value = "tag_id")
  private String tagId;
  private String sex;
  private String country;
  private String province;
  private String city;
  private String clientPlatformType;
  private String language;

}
