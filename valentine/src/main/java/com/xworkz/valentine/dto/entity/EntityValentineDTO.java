package com.xworkz.valentine.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="love")
public class EntityValentineDTO {
	@Id
	@Column(name="v_name")
private String name;
	@Column(name="v_valentineName")
private String valentineName;
	@Column(name="v_place")
private String place;
	@Column(name="gift")
private String gift;
}
