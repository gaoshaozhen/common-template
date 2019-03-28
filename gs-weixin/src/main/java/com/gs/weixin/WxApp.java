package com.gs.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableAutoConfiguration
//@EnableScheduling
@ComponentScan(basePackages={"com.gs", "com.twikkercn"})
@SpringBootApplication(scanBasePackages={"com.gs", "com.twikkercn"})
//@SpringBootApplication
@EnableRetry
public class WxApp {
	
	public static void main(String[] args) {
		SpringApplication.run(WxApp.class, args);
	}
}
