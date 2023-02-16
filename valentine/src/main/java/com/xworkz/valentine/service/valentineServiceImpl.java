package com.xworkz.valentine.service;


import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.dto.entity.EntityValentineDTO;
import com.xworkz.valentine.repo.RepoImpl;
@Service
public class valentineServiceImpl implements ValintineService{
	@Autowired
	private RepoImpl repoIMPL;

	public valentineServiceImpl() {
		System.out.println("Running.....valentineServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("Running....validateAndSave method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = validator.validate(dto);
		
		if (constraintViolations != null && !constraintViolations.isEmpty())
		{
			System.err.println("Vaiolation exist, return vaiolation "+dto);
		
		
		return constraintViolations;
		}
		else {
			System.out.println("Vaiolation does not exsist, Data is Success....");
			EntityValentineDTO dto2 = new EntityValentineDTO();
			dto2.setName(dto.getName());
			dto2.setValentineName(dto.getValentineName());
			dto2.setPlace(dto.getPlace());
			dto2.setGift(dto.getGift());
			
			boolean saved = this.repoIMPL.save(dto2);
			System.out.println("Created Save : "+saved);
			return Collections.emptySet();
		}
	}

}
