package com.gs.weixin.mp.model.media;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMediaUploadResult {
	  private String type;
	  
	  @JsonProperty("media_id")
	  private String mediaId;
	  
	  @JsonProperty("thumb_media_id")
	  private String thumbMediaId;
	  
	  private long createdAt;
}
