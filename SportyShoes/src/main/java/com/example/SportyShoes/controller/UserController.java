package com.example.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.entity.Admin;
import com.example.SportyShoes.entity.User;
import com.example.SportyShoes.repository.ProductRepository;
import com.example.SportyShoes.repository.UserRepository;

@Controller
@RequestMapping("/userlogin")
public class UserController {
	@Autowired
	private UserRepository repo;
	@Autowired
	private ProductRepository repository;


	@GetMapping
	public String getUserLogin(ModelMap model) {
		model.addAttribute("message", model);
		return "userlogin";
	}

	@PostMapping
	public String verifyUser(@ModelAttribute("user") User user, ModelMap model) {
		List<User> list = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if (list.isEmpty()) {
			model.addAttribute("message", "User does not exist Please Signup to continue");
			return "userlogin";
		} else {
			model.addAttribute("shoes", repository.findAll());
			return "userhomepage";
		}
	}
}
