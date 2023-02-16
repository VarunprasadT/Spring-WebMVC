package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	@Size(min=3, max=20 ,message="Name must contain minimum 3 to 20 letters")
private String name;
	@Size(min=3, max=20 , message="Valentine Name must be 3 to 20 letters")
private String valentineName;
	@NotBlank
private String place;
	@NotBlank
private String gift;
	
}
