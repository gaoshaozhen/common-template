package com.gs.weixin.common.utils;

import java.text.SimpleDateFormat;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtils {
	private static final ObjectMapper mapper = initCommonDefaultFeatures(new ObjectMapper());

	private static ObjectMapper initCommonDefaultFeatures(ObjectMapper mapper) {
		// 通过该方法对mapper对象进行设置，所有序列化的对象都将按改规则进行序列化
		// Include.Include.ALWAYS 默认
		// Include.NON_DEFAULT 属性为默认值不序列化
		// Include.NON_EMPTY 属性为 空（“”） 或者为 NULL 都不序列化
		// Include.NON_NULL 属性为NULL 不序列化
		mapper.setSerializationInclusion(Include.NON_NULL);// 对map不起作用

		// JSON 字符串转成Java Bean时，没有对应的属性时，不抛出异常
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

//	    mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);

		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

		return mapper;
	}

	public static String toJsonString(Object data) {
		try {
			return mapper.writeValueAsString(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String toJsonStringAndFormat(Object data) {
		try {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T from(String json, Class<T> clazz) {
		try {
			return mapper.readValue(json, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Map<String, Object> from(String json) {
		try {
			return from(json, new TypeReference<Map<String, Object>>() {
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T from(String json, TypeReference<T> target) {
		try {
			return mapper.readValue(json, target);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static ObjectNode createObjectNode() {
		return mapper.createObjectNode();
	}

	public static String writeValueAsString(Object data) {
		try {
			return mapper.writeValueAsString(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
