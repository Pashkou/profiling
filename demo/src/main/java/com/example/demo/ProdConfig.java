package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdConfig implements Config{

	@Override
	public String getValueAccordingToConfig() {
		return "getter from ProdConfig";
	}

}
