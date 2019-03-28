package com.gs.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
	private Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping
	public Object test(HttpServletRequest request) throws IOException {
		log.debug(request.getParameter("test"));
		log.debug(IOUtils.toString(request.getInputStream(), "utf-8"));
		return "success";
	}
}
