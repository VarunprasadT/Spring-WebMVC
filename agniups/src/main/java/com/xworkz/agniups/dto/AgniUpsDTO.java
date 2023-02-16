package com.xworkz.agniups.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AgniUpsDTO {
	@Size(min=3,max=25,message="Customer Name must contain 3 to 20 letters ")
	private String customerName;
	@Size(min=3,max=30,message="Model Name must contain 3 to 10 letters")
	private String modelName;
	@NotBlank
	private int quantity;
	@NotBlank
	private double cost;
	@NotBlank
	private LocalDate dateOfPurchase;
	@Size(min=10, max=1000, message="The Complaints must contain 2 senetnces(atleast 30 letters) words")
	private String complaints;

}
