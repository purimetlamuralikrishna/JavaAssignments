package com.library.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emanager {

	public static EntityManager createEmanager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Library");
		EntityManager em =  emf.createEntityManager();
		return em;
	}
}
