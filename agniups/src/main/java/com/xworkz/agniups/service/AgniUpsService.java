package com.xworkz.agniups.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.agniups.dto.AgniUpsDTO;


public interface AgniUpsService {

	Set<ConstraintViolation<AgniUpsDTO>>validateAndSave(AgniUpsDTO dto);
}
