package com.gs.weixin.example;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private RetryService retryService;
	
	@GetMapping("/y")
	public Object yes(String ca, HttpServletResponse res) {
		retryService.test(ca);
		res.setHeader("Authorization", "vsdfvsdffffffffffffffffffffffffffffffffffffffff");
		return "secc";
	}
	
	@GetMapping("/n")
	public Object no() {
		
		return "no";
	}
	
}
