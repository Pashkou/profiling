package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@Autowired
	private BasicConfiguration configuration;
	
	@Autowired
	private Config config;

	@Value("${welcome.message}")
	private String welcomeMessage;

	@GetMapping("/welcome")
	public String retrieveWelcomeMessage() {
		return config.getValueAccordingToConfig();
	}
	

	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration() {
	    // Not the best practice to use a map to store differnt types!
	    Map map = new HashMap();
	    map.put("message", configuration.getMessage());
	    map.put("number", configuration.getNumber());
	    map.put("key", configuration.isValue());
	    return map;
	}

}
