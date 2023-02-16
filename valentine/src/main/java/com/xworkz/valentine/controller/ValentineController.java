package com.xworkz.valentine.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValintineService;

@Controller
@RequestMapping("/love")
public class ValentineController {
	
	@Autowired
	private ValintineService valintineService;
	
public ValentineController() {
	System.out.println("Running.......ValentineController");
}

private List<String> palce = Arrays.asList("X-workz Raj","X-workz BTM","Bhasham Cirle","Rajajinagar");
private List<String>gift = Arrays.asList("Chco","Cake","Dress","Jewellary");

@GetMapping
public String toLove(Model model) {
	System.out.println("Running toLove Get method..");
	model.addAttribute("gift", gift);
	model.addAttribute("place",  palce);
	return "commited.jsp";
}

@PostMapping
public String toLove(ValentineDTO dto,Model model) {
	System.out.println("Running toLove...");
	System.out.println(dto);
	model.addAttribute("gift", gift);
	model.addAttribute("place",  palce);
	model.addAttribute("love", dto);
	System.out.println("Data validated and Saved : "+this.valintineService.validateAndSave(dto));
	return "success.jsp";
}

}
