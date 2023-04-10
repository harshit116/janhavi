package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/changepassword")
public class ChangePassword {
	@Autowired
	private AdminRepository repo;
	
	@GetMapping
	public String goChangePassword(ModelMap model)
	{
		return "changepassword";
	}
	@PostMapping
	public Admin update(@ModelAttribute("admin") Admin admin, ModelMap model) {
		Admin oldAdmin = repo.findByUsername(admin.getUsername());
		oldAdmin.setPassword(admin.getPassword());
		model.addAttribute("message","Password updated Successfully");
		return repo.save(oldAdmin);
	}
}
