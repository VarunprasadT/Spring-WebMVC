package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repo.RepoIMPL;
@Service
public class ServiceIMPL implements service{
	@Autowired
	RepoIMPL repoIMPL;

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave....");
		boolean saved=this.repoIMPL.save(dto);
		System.out.println("Saved..."+saved);
		return false;
	}

}
