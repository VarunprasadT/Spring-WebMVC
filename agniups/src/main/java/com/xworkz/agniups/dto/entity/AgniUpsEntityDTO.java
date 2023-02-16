package com.xworkz.agniups.dto.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ups")
public class AgniUpsEntityDTO {
	@Id
	@Column(name="ups_customerName")
	private String customerName;
	@Column(name="ups_modelName")
	private String modelName;
	@Column(name="ups_quantity")
	private int quantity;
	@Column(name="ups_cost")
	private double cost;
	@Column(name="ups_dateOfPurchase")
	private LocalDate dateOfPurchase;
	@Column(name="ups_complaints")
	private String complaints;
}
