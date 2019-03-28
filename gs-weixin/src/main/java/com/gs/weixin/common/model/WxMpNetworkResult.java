package com.gs.weixin.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
import lombok.*;

@Setter
@Getter
@ToString
public class WxMpNetworkResult {
	
	private List<Dns> dns;
	private List<Ping> ping;
	

	@Setter
	@Getter
	@ToString
	public static class Dns{
		private String ip;
		
		@JsonProperty("real_operator")
		private String realOperator;
	}

	@Setter
	@Getter
	@ToString
	public static class Ping{
		private String ip;
		@JsonProperty("from_operator")
		private String fromOperator;
	}

}
