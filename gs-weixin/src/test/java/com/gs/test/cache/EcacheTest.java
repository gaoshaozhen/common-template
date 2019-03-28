package com.gs.test.cache;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.common.model.WxMpBaseAccessToken;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class EcacheTest {

	@Resource(name="ecache")
	private CacheManager cacheManager;
	
	@Test
	public void testManager() {
		net.sf.ehcache.Cache cache = cacheManager.getCache("defaultEcache");
		WxMpBaseAccessToken token = new WxMpBaseAccessToken();
		token.setAccessToken("sdfv");
			Element element = new Element("test", token);
			/*element.setTimeToLive(timeToLiveSeconds);*/
			cache.put(element);	
			Object t = cache.get("test").getObjectValue();
			log.debug(t.toString());
	}
}
