package com.example.SportyShoes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.SportyShoes.entity.Purchase;
import com.example.SportyShoes.entity.Shoes;
import com.example.SportyShoes.repository.PurchaseRepository;
import com.example.SportyShoes.repository.ShoesRepository;

@Controller
@RequestMapping("/buyshoe")
public class BuyShoeController {
	@Autowired
	private ShoesRepository repo;
	@Autowired
	private PurchaseRepository repository;
	private Shoes shoes=null;
	int id1=0;
	@GetMapping
	public String buyshoe(@RequestParam("id") int id, ModelMap model) {
	    id1=id;
		Optional<Shoes> findById = repo.findById(id);
		if (findById.isPresent()) 
			{
				
				shoes = findById.get(); 
				model.addAttribute("shoe", shoes );
			}
		
		
		return "purchase";
	}
	@PostMapping
	public String generatePurchase(@ModelAttribute("purchase") Purchase purchase,ModelMap model)
	{
		repository.save(purchase);
		return "thanku";

	}

}