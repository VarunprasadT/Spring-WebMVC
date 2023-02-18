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
public class ValentineServiceImpl implements ValintineService{
	@Autowired
	private RepoImpl repoIMPL;

	public ValentineServiceImpl() {
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

	@Override
	public ValentineDTO findById(int id) {
		
		if(id>0) {
			EntityValentineDTO dto2 = new EntityValentineDTO();
			if(dto2 != null) {
				System.out.println("entity is found in service for id: "+id);
				ValentineDTO dto = new ValentineDTO();
				dto.setGift(dto2.getGift());
				dto.setName(dto2.getName());
				dto.setPlace(dto2.getPlace());
				dto.setValentineName(dto2.getValentineName());
				dto.setId(dto2.getId());
				return dto;
			}
		}
		return ValintineService.super.findById(id);
		}

}
