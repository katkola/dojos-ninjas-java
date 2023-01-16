package com.codingdojo.dojos_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojos_ninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	
	public List<Dojo> findAll();
}
