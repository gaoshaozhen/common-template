package com.gs.weixin.mp.model.datacube;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WxDataCubeParam {
	
	
	@JsonProperty("begin_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date beginDate;

	@JsonProperty("end_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;

	public WxDataCubeParam(Date beginDate, Date endDate) {
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
}
