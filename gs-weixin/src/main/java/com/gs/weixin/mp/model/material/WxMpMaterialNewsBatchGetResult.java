package com.gs.weixin.mp.model.material;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpMaterialNewsBatchGetResult {
	  private int totalCount;
	  private int itemCount;
	  private List<WxMaterialNewsBatchGetNewsItem> items;
	  
	  @Setter
	  @Getter
	  @ToString
	  public static class WxMaterialNewsBatchGetNewsItem {
	    private String mediaId;
	    private Date updateTime;
	    private WxMpMaterialNews content;
	  }
}
