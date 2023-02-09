package com.xworkz.snake.snakeDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="snake_details")
public class SnakeDTO {
	@Id
	@Column(name="siNo")
private String siNo;
	@Column(name="snakeName")
private String snakeName;
	@Column(name="snakeGender")
private String snakeGender;
	@Column(name="isSnakeMarried")
private boolean isSnakeMarried;
	@Column(name="numberOfKids")
private int numberOfKids;
	@Column(name="location")
private String location;
}
