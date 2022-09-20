package com.jpa.Emutill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emtill {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("Employee_HasA");
	}
	
	public static EntityManager createEmanager() {
		
		EntityManager em = emf.createEntityManager();
		return em;
		
	}

}
