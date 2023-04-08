package com.example.SportyShoes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.repository.ShoesRepository;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private ShoesRepository repo;

	@GetMapping
	public String filter(ModelMap model ) {
			
		
		model.addAttribute("shoes", repo.findByCategory());
		return "category";
	}
}
