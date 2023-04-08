package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.repository.ProductRepository;

@Controller
@RequestMapping("/homepage")
public class MainController {
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public String getHomepage(ModelMap model)
	{
		model.addAttribute("message", "Welcome to the Homepage");
		return "homepage";
	}
	
}
