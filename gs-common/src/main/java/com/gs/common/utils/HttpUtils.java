package com.gs.common.utils;

import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author gaosz
 *
 */
public class HttpUtils {
	
	private static RestTemplate rest = new RestTemplate();
	
	public static String get(String url) {
		return rest.getForObject(url, String.class);
	}
}
