package com.gs.weixin.mp.model.menu;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 菜单（公众号和企业号共用的）.
 *
 * @author Daniel Qian
 */
@Data
public class WxMenu implements Serializable {
  private static final long serialVersionUID = -7083914585539687746L;

  @JsonProperty("button")
  private List<WxMenuButton> buttons = new ArrayList<>();

  private WxMenuRule matchRule;

}
