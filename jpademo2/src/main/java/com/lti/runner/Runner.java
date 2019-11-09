package com.lti.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.MUV;
import com.lti.SUV;
import com.lti.SportsCar;

public class Runner {

	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("myPu");
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		
		SUV suv=new SUV(1000, false);
		suv.setName("Creta");
		suv.setCompany("Hyundai");
		
		tx.begin();
		em.persist(suv);
		tx.commit();
		
		System.out.println("SUV Persisted");
		
		SportsCar sc=new SportsCar();
		sc.setTopSpeed(300);
		sc.setZeroToSixty(5.0);
		sc.setName("Aventador");
		sc.setCompany("Lamboghini");
		
		tx.begin();
		em.persist(sc);
		tx.commit();
		
		System.out.println("SPorts Car Persisted");
		
		MUV muv=new MUV(1520,"Heavy Build");
		muv.setName("Ertiga");
		muv.setCompany("Maurti Suzuki");
		
		tx.begin();
		em.persist(muv);
		tx.commit();
		
		System.out.println("MUV Persisted");
		
	}
}
