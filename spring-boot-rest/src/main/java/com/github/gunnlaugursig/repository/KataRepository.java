package com.github.gunnlaugursig.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.github.gunnlaugursig.entity.Kata;

public interface KataRepository extends Repository<Kata, Long> {
	Kata findByName(@Param("name") String name);
}
