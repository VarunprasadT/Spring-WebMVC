package com.xworkz.agniups.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.agniups.dto.AgniUpsDTO;

@Controller
@RequestMapping("/complaints")
public class AgniUpsController {
public AgniUpsController() {
	System.out.println("Created....AgniUpsController");
}
@PostMapping
public String toService(AgniUpsDTO dto,Model model) {
	System.out.println("Running....toService");
	System.out.println(dto);
	model.addAttribute("complaint", dto);
	return "successfull.jsp";
	
}
}
