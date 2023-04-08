package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.User;
import com.example.SportyShoes.repository.UserRepository;

@Controller
@RequestMapping("/signupuser")
public class SignupUserController {
	@Autowired
	UserRepository repo;
	
	@GetMapping
	public String goSignupPage( ModelMap model )
	{
		return "signuppageuser";
	}
	@PostMapping
	public String addAdminPassword( @ModelAttribute("user")User user,  ModelMap model )
	{
		repo.save(user);
		return "userlogin";
	}
}
