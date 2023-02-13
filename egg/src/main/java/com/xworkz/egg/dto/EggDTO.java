package com.xworkz.egg.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="foodorder")
public class EggDTO {
	@Id
	@Column(name="Restorant_Name")
	private String restorantName;
	@Column(name="Egg_Type")
	private String eggType;
	@Column(name="Egg_Item")
	private String eggItem;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private double price;
	
}
