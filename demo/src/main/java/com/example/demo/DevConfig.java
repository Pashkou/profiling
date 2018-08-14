package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevConfig implements Config{

	@Override
	public String getValueAccordingToConfig() {
		return "getter from DevConfig";
	}

}
