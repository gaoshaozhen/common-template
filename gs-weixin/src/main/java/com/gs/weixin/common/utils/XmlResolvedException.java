package com.gs.weixin.common.utils;

/**
 * 
 * @author gaosz
 *
 */
public class XmlResolvedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public XmlResolvedException(String message) {
		super(message);
	}
	
	public XmlResolvedException(Throwable t) {
		super(t);
	}
}
