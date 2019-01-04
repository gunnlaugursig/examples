package com.github.gunnlaugursig;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BeanConfiguration {
	private int minimum;
	private int maximum;
	private String value;
	private String function;
	
	public BeanConfiguration(int minimum, int maximum, String value, String function) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.value = value;
		this.function = function;
	}
}
