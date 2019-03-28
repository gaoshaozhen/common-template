package com.gs.weixin.mp.model.material;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialNews {
	  private Date createdTime;
	  private Date updatedTime;

	  private List<WxMpMaterialNewsArticle> articles = new ArrayList<>();

}
