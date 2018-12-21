package com.github.gunnlaugursig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.gunnlaugursig.entity.Kata;

@RestController
public class KataController {
	
	@RequestMapping("/kata")
	public Kata getKataByName(@RequestParam(value = "name") String name) {
		return null;
	}

}
