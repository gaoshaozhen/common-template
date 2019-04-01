package com.gs.web.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	private Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping
	public Object test(HttpServletRequest request) throws IOException {
		
		return "index";
	}
}
