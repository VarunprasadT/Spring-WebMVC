package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.service.EggServiceIMPL;

@Controller
@RequestMapping("/egg")
public class EggController {
	@Autowired
	private EggServiceIMPL egg;
	
public EggController() {
	System.out.println("Running EggController.....");
}
@PostMapping
public String onEgg(EggDTO dto,Model model) {
	System.out.println(this.egg.validateAndSave(dto));
	System.out.println(dto);
	model.addAttribute("egg", dto);
	System.out.println("Validated And Saved :"+this.egg.validateAndSave(dto));
	return "sucess.jsp";
	
}
}
