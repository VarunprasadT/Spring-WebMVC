package com.xworkz.egg.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;

@Repository
public class EggRepoIMPL implements EggRepo{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(EggDTO dto) {
		System.out.println("Running...save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return true;
	}

	
	
}
