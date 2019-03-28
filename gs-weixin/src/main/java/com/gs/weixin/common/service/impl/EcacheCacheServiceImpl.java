package com.gs.weixin.common.service.impl;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.gs.weixin.common.service.CacheService;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

@Service("ecacheCacheServiceImpl")
public class EcacheCacheServiceImpl implements CacheService {

	@Resource(name="ecache")
	private CacheManager ecacheManager;
	
	private Cache cache;
	
	@PostConstruct
	public void init() {
		cache = this.ecacheManager.getCache("defaultEcache");
	}

	@Override
	public void set(String key, Object value, int timeout, TimeUnit unit) {
		Element element = new Element(key, value);
		element.setTimeToLive((int)unit.toSeconds(timeout));
		cache.put(element);
	}

	@Override
	public Object get(String key) {
		Element e = cache.get(key);
		return e != null ? e.getObjectValue() : null;
	}

	@Override
	public void set(String key, Object value) {
		Element element = new Element(key, value);
		element.setEternal(true);
		cache.put(element);
	}

	@Override
	public synchronized boolean setIfNull(String key, Object value, int timeout, TimeUnit unit) {
		if (cache.get(key) == null) {
			this.set(key, value, timeout, unit);
			return true;
		}
		return false;
	}
}
