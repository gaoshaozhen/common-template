package com.gs.weixin.mp.model.material;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class WxMpMaterialFileBatchGetResult {

	  private int totalCount;
	  private int itemCount;
	  private List<WxMaterialFileBatchGetNewsItem> items;


		@Setter
		@Getter
		@ToString
	  public static class WxMaterialFileBatchGetNewsItem {
	    private String mediaId;
	    private Date updateTime;
	    private String name;
	    private String url;
	  }
}
