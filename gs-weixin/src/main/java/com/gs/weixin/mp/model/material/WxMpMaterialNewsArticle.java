package com.gs.weixin.mp.model.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialNewsArticle {
	/**
     * (必填) 图文消息缩略图的media_id，可以在基础支持-上传多媒体文件接口中获得
     */
	@JsonProperty("thumb_media_id")
    private String thumbMediaId;
    /**
     * 	图文消息的封面url
     */
	@JsonProperty("thumb_url")
    private String thumbUrl;
    /**
     *	 图文消息的作者
     */
    private String author;
    /**
     * (必填) 图文消息的标题
     */
    private String title;
    /**
     * 	在图文消息页面点击“阅读原文”后的页面链接
     */
    @JsonProperty("content_source_url")
    private String contentSourceUrl;
    /**
     * (必填) 图文消息页面的内容，支持HTML标签
     */
    private String content;
    /**
     * 	图文消息的描述
     */
    private String digest;
    /**
     * 	是否显示封面，true为显示，false为不显示
     */
    @JsonProperty("show_cover_pic")
    private boolean showCoverPic;

    /**
     * 	点击图文消息跳转链接
     */
    private String url;

    /**
     * need_open_comment
     * 	是否打开评论，0不打开，1打开
     */
    @JsonProperty("need_open_comment")
    private Boolean needOpenComment;

    /**
     * only_fans_can_comment
     * 	是否粉丝才可评论，0所有人可评论，1粉丝才可评论
     */
    @JsonProperty("only_fans_can_comment")
    private Boolean onlyFansCanComment;

}
