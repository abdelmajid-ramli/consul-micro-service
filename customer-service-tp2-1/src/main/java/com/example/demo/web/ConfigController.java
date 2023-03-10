package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
	@Value("${customer.param.c1}")
	private String c1;
	
	@GetMapping("/config")
	public String getConfig() {
		return c1;
	}

}
