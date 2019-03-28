package com.gs.weixin.mp.model.material;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialCountResult {
	  private int voiceCount;
	  private int videoCount;
	  private int imageCount;
	  private int newsCount;

}
