package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.Shoes;
import com.example.SportyShoes.repository.ProductRepository;

@Controller
@RequestMapping("/addproduct")
public class AddProduct {
	
	@Autowired
	private ProductRepository repo;
	@GetMapping
	public String goAddProduct(ModelMap model)
	{
		return "addproduct";
	}
	
	@PostMapping
	public String addProduct(@ModelAttribute("shoes") Shoes shoes ,ModelMap model)
	{
		repo.save(shoes);
		
		model.addAttribute("message", "your product is succesfully added" );
		return "addproduct";
	}
}
