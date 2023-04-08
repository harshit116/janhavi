package com.example.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.Shoes;
import com.example.SportyShoes.repository.ProductRepository;

import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/listproduct")
public class ListProduct {
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public String goList(ModelMap model)
	{
		model.addAttribute("shoes",  repo.findAll());
		return "listproduct";
	}
}
