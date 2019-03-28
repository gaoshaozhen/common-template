package com.gs.weixin.mp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.exception.WxErrorException;
import com.gs.weixin.mp.model.menu.WxMenu;
import com.gs.weixin.mp.model.menu.WxMpGetSelfMenuInfoResult;
import com.gs.weixin.mp.model.menu.WxMpMenu;
import com.gs.weixin.mp.service.WxMpMenuService;
import com.gs.weixin.mp.service.WxMpService;

/**
 * Created by Binary Wang on 2016/7/21.
 */
public class WxMpMenuServiceImpl implements WxMpMenuService {
  private static final String API_URL_PREFIX = "https://api.weixin.qq.com/cgi-bin/menu";
  private static Logger log = LoggerFactory.getLogger(WxMpMenuServiceImpl.class);

  private WxMpService wxMpService;

  public WxMpMenuServiceImpl(WxMpService wxMpService) {
    this.wxMpService = wxMpService;
  }

  @Override
  public String menuCreate(WxMenu menu) {
    String menuJson = JsonUtils.toJsonString(menu);
    String url = API_URL_PREFIX + "/create";
    if (menu.getMatchRule() != null) {
      url = API_URL_PREFIX + "/addconditional";
    }

    log.debug("开始创建菜单：{}", menuJson);

    String result = this.wxMpService.getContentByPost(url, menuJson);
    log.debug("创建菜单：{},结果：{}", menuJson, result);

    return result;
  }

  @Override
  public String menuCreate(String json) {
	 Map<String, Object> map = JsonUtils.from(json);
	String url = API_URL_PREFIX + "/create";
    if (map.get("matchrule") != null) {
      url = API_URL_PREFIX + "/addconditional";
    }

    String result = this.wxMpService.getContentByPost(url, json);
    return result;
  }

  @Override
  public void menuDelete() {
    String url = API_URL_PREFIX + "/delete";
    String result = this.wxMpService.getContentByGet(url);
    log.debug("删除菜单结果：{}", result);
  }

  @Override
  public void menuDelete(String menuId) {
    String url = API_URL_PREFIX + "/delconditional";
    Map<String, String> map = new HashMap<>();
    map.put("menuid", menuId);
    String result = this.wxMpService.getContentByPost(url, JsonUtils.toJsonString(map));
    log.debug("根据MeunId({})删除个性化菜单结果：{}", menuId, result);
  }

  @Override
  public WxMpMenu menuGet() {
	 String url = API_URL_PREFIX + "/get";
     String resultContent = this.wxMpService.getContentByGet(url);
     return JsonUtils.from(resultContent, WxMpMenu.class);
  }

  @Override
  public WxMenu menuTryMatch(String userid) {
    String url = API_URL_PREFIX + "/trymatch";
    Map<String, String> map = new HashMap<>();
    map.put("user_id", userid);
    String resultContent = this.wxMpService.getContentByPost(url, JsonUtils.toJsonString(map));
    return JsonUtils.from(resultContent, WxMenu.class);
  }

  @Override
  public WxMpGetSelfMenuInfoResult getSelfMenuInfo() {
    String url = "https://api.weixin.qq.com/cgi-bin/get_current_selfmenu_info";
    String resultContent = this.wxMpService.getContentByGet(url);
    return JsonUtils.from(resultContent, WxMpGetSelfMenuInfoResult.class);
  }
}
