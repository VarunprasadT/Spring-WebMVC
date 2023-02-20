package com.xworkz.kindergarten.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class KinderGartenDTO {
	@Size(min=3, max=20, message="Invalid Name")
private String name;
	@Size(min=4, max=25, message="Name is Invalid")
private String ownerName;
	@Size(min=5, max=30, message="Invalid Location")
private String location;
	@Size(min=3, max=30, message="Name is Invalid")
private String kidName;
	@Size(min=3, max=35, message="Name is invaliid")
private String gardenName;
	@NotNull
private String kidRollnumber;
	@NotBlank
private Integer age;
	@NotNull
private String gender;
	@NotBlank
private boolean freeFood;
	@NotBlank
private boolean freeClothes;
	@NotBlank
private boolean feePaid;

}
