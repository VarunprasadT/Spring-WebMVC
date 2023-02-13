package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.repo.EggRepoIMPL;
@Service
public class EggServiceIMPL implements EggService{
	@Autowired
	private EggRepoIMPL egg;

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("Running.....ValidateAndSave");
		boolean saved=this.egg.save(dto);
		System.out.println("Data is Saved : ");
		return saved;
	}

}
