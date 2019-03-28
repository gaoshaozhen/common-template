package com.gs.weixin.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.common.model.WxError;
import com.gs.weixin.common.utils.HttpUtils;
import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.exception.WxErrorException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WxApiClient {
	public static <T> T executeByPost(String uri, Class<T> resClass, Object data) {
		
		return JsonUtils.from(getContentByPost(uri, data), resClass);
	}

	public static <T> T executeByPost(String uri, TypeReference<T> res, Object data) {
		
		return JsonUtils.from(getContentByPost(uri, data), res);
	}

	public static String getContentByPost(String uri, Object data) {
		String res = HttpUtils.postJson(uri, data);
		log.debug("http-out:{}", res);
		
		WxError err = JsonUtils.from(res, WxError.class);
		if(!"0".equals(err.getErrcode())) {
			throw new WxErrorException(res);
		}
		
		return res;
	}

	public static <T> T executeByPost(String uri, Class<T> resClass) {
		return executeByPost(uri, resClass, null);
	}

	public static String getContentByGet(String uri) {
		String res = HttpUtils.get(uri);
		log.debug("http-out:{}", res);
		
		WxError err = JsonUtils.from(res, WxError.class);
		if(!"0".equals(err.getErrcode())) {
			throw new WxErrorException(res);
		}
		
		return res;
	}
}
