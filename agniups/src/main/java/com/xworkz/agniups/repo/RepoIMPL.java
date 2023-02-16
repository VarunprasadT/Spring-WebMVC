package com.xworkz.agniups.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;


import com.xworkz.agniups.dto.entity.AgniUpsEntityDTO;

public class RepoIMPL implements Repo{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public RepoIMPL() {
		System.out.println("Created....RepoIMPL");
	}

	@Override
	public boolean save(AgniUpsEntityDTO dto) {
		System.out.println("Running...Save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return true;
	}
	
	
}
