package com.slothius.web.slothiusdev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/")
    public String index(Model model) {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/app-ads.txt", produces = MediaType.TEXT_PLAIN_VALUE)
    public String appads() {
	    return "google.com, pub-5648900092474807, DIRECT, f08c47fec0942fa0";
	}
	
}
