package com.gs.weixin.mp.model.menu;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 * Created by Binary Wang on 2016-11-25.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public class WxMpGetSelfMenuInfoResult implements Serializable {
  private static final long serialVersionUID = -5612495636936835166L;

  @JsonProperty("selfmenu_info")
  private WxMpSelfMenuInfo selfMenuInfo;

  @JsonProperty("is_menu_open")
  private Integer isMenuOpen;

}
