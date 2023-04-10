package com.example.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.Admin;
import com.example.SportyShoes.repository.AdminRepository;


@Controller
@RequestMapping("/adminlogin")
public class AdminController {

	@Autowired
	AdminRepository repo;
	@GetMapping
	public String getAdminLogin(ModelMap model)
	{
		model.addAttribute("mesaage", model);
		return "adminlogin";
	}
	@PostMapping
	public String verifyAdmin(@ModelAttribute("admin") Admin admin,ModelMap model)
	{
		List<Admin> list=repo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if(list.isEmpty())
		{ 
			model.addAttribute("message", "Admin does not exist Please Signup to continue");
			return "adminlogin";
		}
		else
		{
			return "adminhomepage";
		}
	}
//	@PutMapping
//	public String updatePassword()
//	{
//		
//	}
	
	
}
