package com.xworkz.bakery.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.ServiceIMPL;

@Component
@RequestMapping("/call")
public class BakeryController {
	
	ServiceIMPL serviceIMPL;
	
	public BakeryController() {
		System.out.println("Created...."+this.getClass().getSimpleName());	}

	@PostMapping
	public String onMake(BakeryDTO dto,Model model) {
		System.out.println("Running....onMake");
		model.addAttribute("bakery", dto);
		System.out.println(dto.getName());
		System.out.println(serviceIMPL.validateAndSave(dto));
		return "index.jsp";
	}
	}