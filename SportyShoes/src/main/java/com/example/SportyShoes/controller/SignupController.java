package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.Admin;
import com.example.SportyShoes.repository.AdminRepository;

@Controller
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	AdminRepository repo;
	
	@GetMapping
	public String goSignupPage( ModelMap model )
	{
		return "signuppage";
	}
	@PostMapping
	public String addAdminPassword( @ModelAttribute("admin")Admin admin,  ModelMap model )
	{
		repo.save(admin);
		return "adminlogin";
	}
	@PutMapping
	public Admin update(@RequestBody Admin admin) {
		return repo.save(admin);
	}
}
