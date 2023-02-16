package com.xworkz.valentine.service;



import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.dto.ValentineDTO;

public interface ValintineService {

	Set<ConstraintViolation<ValentineDTO>>validateAndSave(ValentineDTO dto);
	
}
