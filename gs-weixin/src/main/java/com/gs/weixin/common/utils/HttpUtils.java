package com.gs.weixin.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class HttpUtils {

	private static RestTemplate rest = new RestTemplate();
	
	private static HttpEntity<String> createJsonHttpEntity(String json){
		if(StringUtils.isBlank(json)) {
			return null;
		}
		HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        return new HttpEntity<String>(json, headers);
	}
	
	public static String postJson(String uri, Object data) {
		HttpEntity<String> entity = null;
		if(data instanceof String) {
			entity = createJsonHttpEntity((String)data);
		}else if(data != null){
			entity = createJsonHttpEntity(JsonUtils.toJsonString(data));			
		}
		return rest.exchange(uri, HttpMethod.POST, entity, String.class).getBody();
	}

	public static String get(String uri) {
		return rest.exchange(uri, HttpMethod.GET, null, String.class).getBody();
	}

	public static String postJsonAndParam(String uri, Object data, Object...params) {
		return rest.exchange(uri, HttpMethod.POST, createJsonHttpEntity(JsonUtils.toJsonString(data)), String.class, params).getBody();		
	}
}
