package com.gs.weixin.example;

import java.util.Date;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RetryService {
	@Retryable(RuntimeException.class)
	public void test(String ca) {
		log.info("accs");
		if("y".equals(ca)) {
			log.debug(new Date().toString());
		}else {
			throw new RuntimeException("test");
		}
	}
	
	@Recover
	public void recover(Exception e) {
		log.error(e.getMessage());
	}
	
}
