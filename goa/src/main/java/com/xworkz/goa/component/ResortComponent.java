package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.Dto.ResortDTO;

@Component
@RequestMapping("/eat")
public class ResortComponent {
public ResortComponent() {
	System.out.println("Creating..."+this.getClass().getSimpleName());
}

@PostMapping
public String toBook(ResortDTO dto , Model model) {
	System.out.println("Running toBook Method..");
	System.out.println(dto);
	model.addAttribute("name",dto.getName());
	model.addAttribute("location", dto.getLocation());
	model.addAttribute("price", dto.getPrice());
	model.addAttribute("freeFood", dto.isFreeFood());
	return "registrationSR.jsp";
}
}
