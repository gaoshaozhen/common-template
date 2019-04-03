package com.gs.common.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResult<T> {
	private Integer code;
	private String message;
	private T data;
	
	public static final int SUCCESS_CODE = 0;
	public static final int FAIL_CODE = 1;
	
	public BaseResult(int code, String message, T data){
		this.code = code;
		this.message = message;
		this.data = data;
	}
	public static BaseResult<Object> success(Object data){
		return new BaseResult<Object>(SUCCESS_CODE, "", data);
	}
	
	public static BaseResult<Object> fail(Object data){
		return new BaseResult<Object>(FAIL_CODE, "", data);
	}
}
