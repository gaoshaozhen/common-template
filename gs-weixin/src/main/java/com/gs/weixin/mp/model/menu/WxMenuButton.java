package com.gs.weixin.mp.model.menu;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gs.weixin.mp.WxMpConstants.MenuButtonType;

import lombok.Data;

@Data
public class WxMenuButton implements Serializable {
    private static final long serialVersionUID = -1070939403109776555L;

    /**
     * <pre>
     * 菜单的响应动作类型.
     * view表示网页类型，
     * click表示点击类型，
     * miniprogram表示小程序类型
     * </pre>
     */
    private String type;

    /**
     * 菜单标题，不超过16个字节，子菜单不超过60个字节.
     */
    private String name;

    /**
     * <pre>
     * 菜单KEY值，用于消息接口推送，不超过128字节.
     * click等点击类型必须
     * </pre>
     */
    private String key;

    /**
     * <pre>
     * 网页链接.
     * 用户点击菜单可打开链接，不超过1024字节。type为miniprogram时，不支持小程序的老版本客户端将打开本url。
     * view、miniprogram类型必须
     * </pre>
     */
    private String url;

    /**
     * <pre>
     * 调用新增永久素材接口返回的合法media_id.
     * media_id类型和view_limited类型必须
     * </pre>
     */
    @JsonProperty("media_id")
    private String mediaId;

    /**
     * <pre>
     * 小程序的appid.
     * miniprogram类型必须
     * </pre>
     */
    @JsonProperty("appid")
    private String appId;

    /**
     * <pre>
     * 小程序的页面路径.
     * miniprogram类型必须
     * </pre>
     */
    @JsonProperty("pagepath")
    private String pagePath;

    @JsonProperty("sub_button")
    private List<WxMenuButton> subButtons = new ArrayList<>();

    public WxMenuButton() {
    }

    public WxMenuButton(String type, String name, String key, String url, String mediaId, String appId, String pagePath) {
        this.type = type;
        this.name = name;
        this.key = key;
        this.url = url;
        this.mediaId = mediaId;
        this.appId = appId;
        this.pagePath = pagePath;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String type;
        private String name;
        private String key;
        private String url;
        private String mediaId;
        private String appId;
        private String pagePath;
        private boolean main;

        Builder() {
            super();
        }

        public Builder setMain(boolean main) {
            this.main = main;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setKey(String key) {
            this.key = StringUtils.isEmpty(key) ? null : key;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setMediaId(String mediaId) {
            this.mediaId = StringUtils.isEmpty(mediaId) ? null : mediaId;
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = StringUtils.isEmpty(appId) ? null : appId;
            return this;
        }

        public Builder setPagePath(String pagePath) {
            this.pagePath = pagePath;
            return this;
        }

        public WxMenuButton build() {
            Assert.isTrue(!StringUtils.isEmpty(name), "菜单名不能为空");
            if (this.main) {
                // 判断一级菜单长度小于等于16（UTF编码，一个汉字占三个字节）
                Assert.isTrue(name.getBytes(StandardCharsets.UTF_8).length <= 16, "菜单名过长，不能超过5个汉字或16个字符");
                return new WxMenuButton(null, name, null, null, null, null, null);
            } else {
                Assert.notNull(type, "菜单必须有类型");
                // 判断二级菜单长度小于等于60
                Assert.isTrue(main || name.getBytes().length <= 60, "菜单名过长，不能超过20个汉字或60个字符");
            }
            switch (type) {
                case MenuButtonType.VIEW: {
                    Assert.isTrue(!StringUtils.isEmpty(url), "请输入页面地址");
                    // view类型key、mediaId、appId、pagePath是无效的
                    return new WxMenuButton(type, name, null, url, null, null, null);
                }
                case MenuButtonType.MEDIA_ID:
                case MenuButtonType.VIEW_LIMITED: {
                    Assert.notNull(mediaId, "请选择素材");
                    // media_id类型和view_limited类型key、url、appId、pagePath是无效的
                    return new WxMenuButton(type, name, null, null, mediaId, null, null);
                }
                case MenuButtonType.MINIPROGRAM: {
                    Assert.isTrue(!StringUtils.isEmpty(appId) && !StringUtils.isEmpty(pagePath) && !StringUtils.isEmpty(this.url),
                            "请输入小程序APPID、路径、备用网页");
                    // miniprogram中，appid, pagepath, url是有效的。
                    return new WxMenuButton(type, name, null, url, null, appId, pagePath);
                }
                case MenuButtonType.CLICK:
                case MenuButtonType.SCANCODE_PUSH:
                case MenuButtonType.SCANCODE_WAITMSG:
                case MenuButtonType.PIC_SYSPHOTO:
                case MenuButtonType.PIC_PHOTO_OR_ALBUM:
                case MenuButtonType.PIC_WEIXIN:
                case MenuButtonType.LOCATION_SELECT:{
                    Assert.isTrue(!StringUtils.isEmpty(key), "click等类型必须有key");
                    Assert.isTrue(key.getBytes().length <= 128, "key过长，不能超过128字节");
                    // 其他类型只有key是有效的
                    return new WxMenuButton(type, name, key, null, null, null, null);
                }

                default: {
                    throw new IllegalArgumentException("菜单按钮类型【"+type+"】不合法");
                }
            }
        }
    }
}
