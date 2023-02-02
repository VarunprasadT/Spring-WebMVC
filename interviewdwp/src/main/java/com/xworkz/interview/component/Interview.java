package com.xworkz.interview.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/Offered")
public class Interview {
	
	public Interview() {
		System.out.println("Careating..."+this.getClass().getSimpleName());
	}
	@GetMapping
	public String cleared(InterviewDTO dto) {
		System.out.println(dto);
		return "cleared.jsp";
	}
}
