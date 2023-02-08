package com.xworkz.bakery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BakeryDTO {
private String name;
private String ownerName;
private String ownerWifeName;
private boolean isMarried;
private String specialFor;
private int since;
}
