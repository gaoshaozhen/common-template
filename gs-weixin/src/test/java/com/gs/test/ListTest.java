package com.gs.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.common.utils.JsonUtils;
import com.gs.weixin.mp.model.datacube.WxDataCubeArticleResultList;

import lombok.extern.slf4j.Slf4j;

public class ListTest {
	
	private RedisTemplate<String, Object> redis;

	@Test
	public void test() {
//        Collection<String> books=new HashSet<String>();
//        books.add("PHP");
//        books.add("C++");
//        books.add("C");
//        books.add("Java");
//        books.add("Python");
//        System.out.println(books);
//        books.removeIf(ele->((String)ele).length()<=3);
//        System.out.println(books);
		
		String str = "{\"list\":[]}";
		JsonUtils.from(str, new TypeReference<WxDataCubeArticleResultList>() {});
		
	}
}

@Slf4j
class DayInterval{
	private int count;
	private LocalDate date;
	public DayInterval() {
		date = LocalDate.now();
		count = 0;
	}
	
	public synchronized int increase() {
		LocalDate now = LocalDate.now();
		if(now.isEqual(date)) {
			return ++count;			
		}else {
			log.info("DayInterval区间数据归零");
			return count = 0;
		}
	}
}
