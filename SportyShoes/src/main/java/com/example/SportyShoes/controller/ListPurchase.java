package com.example.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportyShoes.repository.PurchaseRepository;

@Controller
@RequestMapping("/listpurchase")
public class ListPurchase {

	@Autowired
	private PurchaseRepository repo;
	@GetMapping
	public String getPurchase(ModelMap model)
	{
		model.addAttribute("purchase",repo.findAll() );
		return "listpurchase";
	}
}
