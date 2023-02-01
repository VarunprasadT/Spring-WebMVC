package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/eat")
public class FoodItemComponent {
public FoodItemComponent() {
	System.out.println("Creating...FoodItemComponent");
}
@GetMapping
public String toEat(@RequestParam String foodName,String type,Integer range,Double price) {
	System.out.println("Food Item Name : "+foodName);
	System.out.println("Food Type : "+type);
	System.out.println("Quantity of Food : "+range);
	System.out.println("Food Price : "+price);
	return "FoodItem.jsp";
}
}
