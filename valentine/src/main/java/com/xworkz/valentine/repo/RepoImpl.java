package com.xworkz.valentine.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.valentine.dto.entity.EntityValentineDTO;
@Repository
public class RepoImpl implements Repo{

	@Override
	public boolean save(EntityValentineDTO dto) {
		System.out.println("Running....save");
		
		return false;
	}

}
