package com.xworkz.kindergarten.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.kindergarten.dto.KinderGartenDTO;

@Controller
@RequestMapping("/kid")
public class kiderGartenController {
public kiderGartenController() {
	System.out.println("Created.."+this.getClass().getName());
}
@PostMapping
public String toLearn(KinderGartenDTO dto,Model model) {
	System.out.println("Running...toLearn");
	System.out.println(dto);
	model.addAttribute("learn", dto);
	return "index.jsp";
}
}
