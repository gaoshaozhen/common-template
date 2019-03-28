package com.gs.weixin.common.service.impl;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import com.gs.weixin.common.service.CacheService;

//@Service("redisCacheServiceImpl")
public class RedisCacheServiceImpl implements CacheService {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Override
	public void set(String key, Object value, int timeout, TimeUnit unit) {
		redisTemplate.opsForValue().set(key, value, timeout, unit);
	}

	@Override
	public Object get(String key) {
		return  redisTemplate.opsForValue().get(key);
	}

	@Override
	public void set(String key, Object value) {
		redisTemplate.opsForValue().set(key, value);
	}

	@Override
	public synchronized boolean setIfNull(String key, Object value, int timeout, TimeUnit unit) {
		if (!redisTemplate.hasKey(key)) {
			redisTemplate.opsForValue().set(key, value, timeout, unit);
			return true;
		}
		return false;
	}
}
