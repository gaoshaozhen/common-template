package com.gs.weixin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Configuration
public class CacheConfig {
	
	 @Bean
	    public StringRedisSerializer getStringRedisSerializer() {
	        return new StringRedisSerializer();
	    }
	    
	    @Bean 
	    @Primary
	    public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory connectionFactory) {
	        RedisTemplate<String, Object> template = new RedisTemplate<>();
	        template.setConnectionFactory(connectionFactory);
	        template.setKeySerializer(getStringRedisSerializer());
	        template.setHashKeySerializer(getStringRedisSerializer());
	        template.setValueSerializer(getDefaultSerializer());
	        template.setHashValueSerializer(getDefaultSerializer());
	        template.setEnableDefaultSerializer(false);
	        template.setDefaultSerializer(getDefaultSerializer());
	        log.debug("redis1:{}", template.toString());
	        return template;

	    }

	    @Bean("jackson2JsonRedisSerializer")
	    public Jackson2JsonRedisSerializer<Object>  getDefaultSerializer(){
	        
	        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);  
	        ObjectMapper om = new ObjectMapper();  
	        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);  
	        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);  
	        jackson2JsonRedisSerializer.setObjectMapper(om);  
	        
	        return jackson2JsonRedisSerializer;
	    }
}
