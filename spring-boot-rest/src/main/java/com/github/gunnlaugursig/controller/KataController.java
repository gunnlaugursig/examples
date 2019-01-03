package com.github.gunnlaugursig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.gunnlaugursig.entity.Kata;
import com.github.gunnlaugursig.repository.KataRepository;

@RestController
public class KataController {
	
	@Autowired
	KataRepository repository;
	
	@RequestMapping("/katas")
	public List<Kata> findAll() {
		return repository.findAll();
	}

	@RequestMapping("/kata/name")
	public Kata findByName(@RequestParam(value = "name") String name) {
		return repository.findByName(name);
	}
	
	@RequestMapping("/kata/style")
	public List<Kata> findByStyle(@RequestParam(value = "style") String style) {
		return repository.findByStyle(style);
	}

}
