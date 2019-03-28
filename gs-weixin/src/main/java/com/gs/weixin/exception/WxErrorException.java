package com.gs.weixin.exception;


public class WxErrorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public WxErrorException(String error) {
	    super(error.toString());
	  }

	  public WxErrorException(String error, Throwable cause) {
	    super(error, cause);
	  }
}
