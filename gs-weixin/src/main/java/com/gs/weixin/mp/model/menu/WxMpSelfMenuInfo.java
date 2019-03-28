package com.gs.weixin.mp.model.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class WxMpSelfMenuInfo implements Serializable {
  private static final long serialVersionUID = -81203094124202901L;

  /**
   * 菜单按钮
   */
  @JsonProperty("button")
  private List<WxMpSelfMenuButton> buttons;

  @Data
  public static class WxMpSelfMenuButton implements Serializable {
    private static final long serialVersionUID = -4426602953309048341L;

    /**
     * <pre>
     * 菜单的类型，公众平台官网上能够设置的菜单类型有view（跳转网页）、text（返回文本，下同）、img、photo、video、voice。
     * 使用API设置的则有8种，详见<a href="http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013&token=&lang=zh_CN">《自定义菜单创建接口》</a>
     * </pre>
     */
    @JsonProperty("type")
    private String type;
    /**
     * 菜单名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * <pre>
     * 对于不同的菜单类型，value的值意义不同。
     * 官网上设置的自定义菜单：
     *  <li>Text:保存文字到value；
     *  <li>Img、voice：保存mediaID到value；
     *  <li>Video：保存视频下载链接到value；
     *  <li>News：保存图文消息到news_info，同时保存mediaID到value；
     *  <li>View：保存链接到url。</li>
     *
     * 使用API设置的自定义菜单：
     *  <li>click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、	pic_weixin、location_select：保存值到key；
     *  <li>view：保存链接到url
     *  </pre>
     */
    @JsonProperty("key")
    private String key;
    /**
     * @see #key
     */
    @JsonProperty("url")
    private String url;
    /**
     * @see #key
     */
    @JsonProperty("value")
    private String value;
    /**
     * 子菜单信息
     */
    @JsonProperty("sub_button")
    private SubButtons subButtons;
    /**
     * 图文消息的信息
     */
    @JsonProperty("news_info")
    private NewsInfo newsInfo;

    @Data
    public static class SubButtons implements Serializable {
      private static final long serialVersionUID = 1763350658575521079L;

      @JsonProperty("list")
      private List<WxMpSelfMenuButton> subButtons = new ArrayList<>();

    }
    @Data
    public static class NewsInfo implements Serializable {
      private static final long serialVersionUID = 3449813746347818457L;

      @JsonProperty("list")
      private List<NewsInButton> news = new ArrayList<>();

      @Data
      public static class NewsInButton  implements Serializable {
        private static final long serialVersionUID = 8701455967664912972L;

        /**
         * 图文消息的标题
         */
        @JsonProperty("title")
        private String title;
        /**
         * 摘要
         */
        @JsonProperty("digest")
        private String digest;
        /**
         * 作者
         */
        @JsonProperty("author")
        private String author;
        /**
         * show_cover
         * 是否显示封面，0为不显示，1为显示
         */
        @JsonProperty("show_cover")
        private Integer showCover;
        /**
         * 封面图片的URL
         */
        @JsonProperty("cover_url")
        private String coverUrl;
        /**
         * 正文的URL
         */
        @JsonProperty("content_url")
        private String contentUrl;
        /**
         * 原文的URL，若置空则无查看原文入口
         */
        @JsonProperty("source_url")
        private String sourceUrl;

      }
    }
  }
}
