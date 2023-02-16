package com.xworkz.agniups.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.agniups.dto.AgniUpsDTO;
import com.xworkz.agniups.dto.entity.AgniUpsEntityDTO;
import com.xworkz.agniups.repo.RepoIMPL;

public class AgniUpsServiceIMPL implements AgniUpsService{
	@Autowired
	private RepoIMPL repoImpl;

	@Override
	public Set<ConstraintViolation<AgniUpsDTO>> validateAndSave(AgniUpsDTO dto) {
		System.out.println("Running validateAndSave method");
		ValidatorFactory factory =	Validation.buildDefaultValidatorFactory();
		Validator	validator = 	factory.getValidator();
		
		Set<ConstraintViolation<AgniUpsDTO>>  constraintVoilutions =	validator.validate(dto);
		
		if(!constraintVoilutions.isEmpty() && constraintVoilutions!=null) {
		System.out.println("Voilutions Exists "+dto);
		return constraintVoilutions;
	}
		else {
			System.out.println("Voilutions does not exists ");
			AgniUpsEntityDTO dto2 = new AgniUpsEntityDTO();
			dto2.setCustomerName(dto.getCustomerName());
			dto2.setModelName(dto.getModelName());
			dto2.setQuantity(dto.getQuantity());
			dto2.setCost(dto.getCost());
			dto2.setDateOfPurchase(dto.getDateOfPurchase());
			dto2.setComplaints(dto.getComplaints());
			
			boolean saved = this.repoImpl.save(dto2);
			System.out.println("Data Saved : "+saved);
			return Collections.emptySet();
		}
		
	}
}
