package com.xworkz.valentine.repo;

import com.xworkz.valentine.dto.entity.EntityValentineDTO;

public interface Repo {

	public boolean save(EntityValentineDTO dto);
	
	public EntityValentineDTO findById(int id);
		
	
}
