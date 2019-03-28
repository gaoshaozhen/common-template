package com.gs.weixin.mp.model.material;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialArticleUpdate {
	  private String mediaId;
	  private int index;
	  private WxMpMaterialNewsArticle articles;

}
