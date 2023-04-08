package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.repository.UserRepository;

@Controller
@RequestMapping("/listuser")
public class ListOFUser {
	@Autowired
	private UserRepository repo;
	 
	@GetMapping
	public String goListOfUser(ModelMap model)
	{
		model.addAttribute("user", repo.findAll());
		return "listofuser";
	}
	 
}
