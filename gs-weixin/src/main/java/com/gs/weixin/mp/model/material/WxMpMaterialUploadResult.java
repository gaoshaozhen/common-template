package com.gs.weixin.mp.model.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialUploadResult {
	 @JsonProperty("media_id")
	 private String mediaId;
	  
	 private String url;
	 
	 @JsonProperty("err_code")
	 private Integer errCode;
	  
	 @JsonProperty("err_msg")
	 private String errMsg;
}
