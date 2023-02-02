package com.xworkz.interview.component;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class InterviewDTO {
private String name;
private String Company;
private String role;



@Override
public String toString() {
	return "InterviweDTO [name = " + name + ", Company name = " + Company + ", Job Role = " + role + "]";
}




}
