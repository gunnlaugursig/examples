package com.github.gunnlaugursig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Configuration configuration;
	
	@Value("${values.value}")
	String value;
	
	@Value("${values.function}")
	String function;
	
	@GetMapping("/foo")
	public BeanConfiguration getConfiguration() {
		return new BeanConfiguration(configuration.getMinimum(), configuration.getMaximum(), value, function);
	}

	@GetMapping("/refresh")
	public BeanConfiguration getConfigurationRefresh(@Value("${values.function}") String function) {
		return new BeanConfiguration(configuration.getMinimum(), configuration.getMaximum(), value, function);
	}
}
