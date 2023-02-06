package com.xworkx.varun.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class BeverageDTO {
private String nameofMostDrinkedBeverage;
private String mostLikedBreverage;
private int numberofTimesBreverageHadinDay;
private double price;
private LocalDate expireDate;
}
