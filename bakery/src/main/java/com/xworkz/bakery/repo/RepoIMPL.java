package com.xworkz.bakery.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class RepoIMPL implements Repo {

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running save....");
		return true;
	}

}
