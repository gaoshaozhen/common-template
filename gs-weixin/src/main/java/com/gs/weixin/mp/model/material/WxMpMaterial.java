package com.gs.weixin.mp.model.material;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterial {
	 private String name;
	 private File file;
	 
	 @JsonProperty("video_title")
	 private String videoTitle;
	 
	 @JsonProperty("video_introduction")
	 private String videoIntroduction;
}
