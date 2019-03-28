package com.gs.weixin.common.service;

import java.util.concurrent.TimeUnit;

public interface CacheService {
	void set(String key, Object value, int timeout, TimeUnit unit);
	
	void set(String key, Object value);
	boolean setIfNull(String key, Object value, int timeout, TimeUnit unit);
	

	Object get(String key);
}
