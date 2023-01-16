package com.codingdojo.dojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos_ninjas.models.Ninja;
import com.codingdojo.dojos_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public Ninja getOne(Long id) {
		Optional<Ninja> optNinja = ninjaRepo.findById(id);
		if(optNinja.isPresent()) {
			return optNinja.get();
		}
		else {
			return null;
		}
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> getAll(){
		return ninjaRepo.findAll();
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public void deleteById(Long id) {
		ninjaRepo.deleteById(id);
		
	}
}
