package com.murali.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class utility {

	public static EntityManager createEmanager() {
		
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Employee-Department");
		EntityManager em = emf.createEntityManager();
		return em;
		
	}
	
}
