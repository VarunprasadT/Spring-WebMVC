package com.xworkz.valentine.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.dto.entity.EntityValentineDTO;
@Repository
public class RepoImpl implements Repo{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(EntityValentineDTO dto) {
		System.out.println("Running....save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return true;
		
	}

}
