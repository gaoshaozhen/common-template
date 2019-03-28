package com.gs.weixin.common.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@Component
@ConfigurationProperties("wx.common")
public class CommonConfig {
	private String cacheType;
	private Boolean deployByInline;
	private String deployType;
	private String mpAppid;
	private String mpSecret;
	private String mpAesKey;
	private String mpToken;
	private String mpTokenAutoRefresh;
	
	private String componentAppid;
	private String componentSecret;
	private String componentToken;
	
	
}
