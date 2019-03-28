package com.gs.weixin.common.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * 
 * @author gaosz
 *
 */
public class XmlUtils {

	public static XmlMapper getXmlMapper() {

		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		
		 //JSON 字符串转成Java Bean时，没有对应的属性时，不抛出异常
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
//        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		xmlMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		xmlMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		xmlMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		return xmlMapper;
	}

	/**
	 * 
	 * @param xml
	 * @param target
	 * @return
	 */
	public static <T> T readValue(String xml, Class<T> target) {
		XmlMapper xmlMapper = getXmlMapper();
		T value;
		try {
			value = xmlMapper.readValue(xml, target);
		} catch (IOException e) {
			throw new XmlResolvedException(e);
		}
		return value;
	}

	/**
	 * 
	 * @param bean
	 * @return
	 */
	public static String writeValueAsString(Object bean) {
		XmlMapper xmlMapper = getXmlMapper();
		try {
			return xmlMapper.writeValueAsString(bean);
		} catch (JsonProcessingException e) {
			throw new XmlResolvedException(e);
		}
	}
}
