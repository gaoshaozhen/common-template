package com.gs.weixin.common.utils;

import java.text.MessageFormat;

public class StringFormatUtils {
	public static String format(String content, Object...params) {
		return MessageFormat.format(content, params);
	}
}
