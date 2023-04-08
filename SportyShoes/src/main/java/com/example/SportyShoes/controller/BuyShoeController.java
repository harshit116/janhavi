package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SportyShoes.repository.ProductRepository;

@Controller
@RequestMapping("/buyshoe")
public class BuyShoeController {
	@Autowired
	private ProductRepository repo;

	
	@RequestMapping(value = "/buyshoe", method = RequestMethod.GET)
	public String listNotes(@RequestParam("id")Integer id, Model model) {
		
		model.addAttribute("p",id);
		
		return "purchase";
	}
}
