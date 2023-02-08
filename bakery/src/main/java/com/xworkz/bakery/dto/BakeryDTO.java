package com.xworkz.bakery.dto;


import lombok.Data;



@Data

public class BakeryDTO {
private String name;
private String ownerName;
private String ownerWifeName;
private boolean isMarried;
private String specialFor;
private int since;

@Override
public String toString() {
	return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", ownerWifeName=" + ownerWifeName + ", isMarried="
			+ isMarried + ", specialFor=" + specialFor + ", since=" + since + "]";
}

}

