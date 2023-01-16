package com.codingdojo.dojos_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojos_ninjas.models.Dojo;
import com.codingdojo.dojos_ninjas.models.Ninja;
import com.codingdojo.dojos_ninjas.services.DojoService;
import com.codingdojo.dojos_ninjas.services.NinjaService;

@Controller
public class HomeController {
	
	@Autowired
	private DojoService dojoServ;
	
	@Autowired
	private NinjaService ninjaServ;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(Model model) {
		Dojo dojo = new Dojo();
		model.addAttribute("dojo", dojo);
		
		return "createDojo.jsp";
	}
	
	@PostMapping("/create/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
            return "redirect:/dojos/new";
        }
		else {
			dojoServ.createDojo(dojo);
			return ("redirect:/");
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(Model model) {
		model.addAttribute("dojos", dojoServ.getAll());
		Ninja ninja = new Ninja();
		model.addAttribute("ninja", ninja);
		
		return "createNinja.jsp";
	}
	
	@PostMapping("/create/ninja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
            return "redirect:/ninjas/new";
        }
		else {
			ninjaServ.createNinja(ninja);
			return ("redirect:/");
		}
	}
	
	
	@GetMapping("/{id}")
	public String viewDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoServ.getOne(id);
		
		model.addAttribute("allNinjas", dojo.getNinjas());
		
		return "dojoRoster.jsp";
	}
	
	
	
}
