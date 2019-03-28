package com.gs.weixin.config;

import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import net.sf.ehcache.CacheManager;

@Configuration
public class EcacheConfig {
	
	@Bean("ecache")
	public CacheManager ecache() {
		EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
		bean.setConfigLocation(new ClassPathResource("ecache-set.xml"));
		bean.afterPropertiesSet();
		return bean.getObject();
		
	}
}
