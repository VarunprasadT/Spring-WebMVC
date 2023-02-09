package com.xworkz.snake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.snake.service.ServiceIMPL;
import com.xworkz.snake.snakeDTO.SnakeDTO;
@Component
@RequestMapping("/Buss")
public class SnakeController {
	@Autowired
	public ServiceIMPL service;
	
public SnakeController() {
	System.out.println("Creating.....SnakeController");
}
@PostMapping
public String onBuss(SnakeDTO dto,Model model) {
	System.out.println("Running...onBuss");
	System.out.println(dto);
	model.addAttribute("buss", dto);
	System.out.println(service.validateAndSave(dto));
	return "sucess.jsp";

}
}
