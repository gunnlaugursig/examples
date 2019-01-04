package com.github.gunnlaugursig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@ConfigurationProperties("foo")
public class Configuration {
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return this.minimum;
	}

	public int getMaximum() {
		return this.maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
}
