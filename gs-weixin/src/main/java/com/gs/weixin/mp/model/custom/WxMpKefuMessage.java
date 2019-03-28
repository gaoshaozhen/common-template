package com.gs.weixin.mp.model.custom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 客服消息
 *
 * @author chanjarster
 */
@Data
public class WxMpKefuMessage implements Serializable {
  private static final long serialVersionUID = -9196732086954365246L;

  private String toUser;
  private String msgType;
  private String content;
  private String mediaId;
  private String thumbMediaId;
  private String title;
  private String description;
  private String musicUrl;
  private String hqMusicUrl;
  private String kfAccount;
  private String cardId;
  private String mpNewsMediaId;
  private String miniProgramAppId;
  private String miniProgramPagePath;
  private List<WxArticle> articles = new ArrayList<>();

  @Data
  public static class WxArticle implements Serializable {
    private static final long serialVersionUID = 5145137235440507379L;

    private String title;
    private String description;
    private String url;
    private String picUrl;
  }
}
