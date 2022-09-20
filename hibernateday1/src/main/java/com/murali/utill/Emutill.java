package com.murali.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutill {

	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeeUnit");
	}
	
	public static EntityManager createEntity() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
}
