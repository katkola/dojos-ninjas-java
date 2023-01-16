package com.codingdojo.dojos_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojos_ninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	public List<Ninja> findAll();
}
