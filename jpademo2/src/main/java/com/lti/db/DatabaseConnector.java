package com.lti.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConnector 
{
	static EntityManagerFactory factory=null;
	
	static
	{
		factory=Persistence.createEntityManagerFactory("ltiPU");
	}
	
	
	
	public EntityManager getEntityManager()
	{
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	
}
