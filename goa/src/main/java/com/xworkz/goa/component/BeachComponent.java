package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.Dto.BeachDTO;

@Component
@RequestMapping("/swim")
public class BeachComponent {
public BeachComponent() {
	System.out.println("Creating..."+this.getClass().getName());
}
@PostMapping
public String toBook(BeachDTO dto, Model model) {
	System.out.println("Inside toBook Method..");
	System.out.println(dto);
	model.addAttribute("name",dto.getName());
	model.addAttribute("location", dto.getLocation());
	model.addAttribute("game", dto.getGame());
	return "registrationSB.jsp";
}
}
