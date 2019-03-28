package com.gs.weixin.mp.model.menu;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 *   公众号专用的菜单类，可能包含个性化菜单
 * Created by Binary Wang on 2017-1-17.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public class WxMpMenu implements Serializable {
  private static final long serialVersionUID = -5794350513426702252L;

  @JsonProperty("menu")
  private WxMpConditionalMenu menu;

  @JsonProperty("conditionalmenu")
  private List<WxMpConditionalMenu> conditionalMenu;
  
//  @Data
  public static class WxMpConditionalMenu implements Serializable {
    private static final long serialVersionUID = -1L;

    @JsonProperty("button")
    private List<WxMenuButton> buttons;
    
    @JsonProperty("matchrule")
    private WxMenuRule rule;
    
    @JsonProperty("menuid")
    private String menuId;
  }



}
