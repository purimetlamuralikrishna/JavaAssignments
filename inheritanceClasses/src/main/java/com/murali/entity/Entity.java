package com.murali.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entity {

	public static EntityManager createEntityManager() {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersonEmployeeAddress");
		
		EntityManager em = emf.createEntityManager();
		
		return em;
		
	}
}
