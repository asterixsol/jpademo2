package com.lti.runner;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.lti.Book;
import com.lti.db.DatabaseConnector;
import com.lti.service.BookService;
import com.lti.util.DateWorker;

public class BookRunner
{
	public static void main(String[] args)
	{
		DatabaseConnector db=new DatabaseConnector();
		EntityManager em=db.getEntityManager();
		BookService bs=new BookService(em);
		EntityTransaction tx=em.getTransaction();
		System.out.println("\n\n\n-------------Dynamic Queries Output Here-----------\n\n");
		bs.queryBooks();
		bs.queryTypedWithWhereClause();
		bs.queryBooksPosition(200.0F, 100);
		bs.queryBooksName(100.0F,300);
		LocalDate dt=DateWorker.formatDate("01-01-2013");
		bs.queryBooksPositionWithDate(100.0F,300,dt);
		bs.queryBooksWithPagination(2);
		
		System.out.println("\n\n\n-------------Named Queries Output Here-----------\n\n");
		
		bs.namedQueryBooks();
		bs.namedQueryBooksWithPostion(200);
		
		Book b5=new Book();
		b5.setTitle("React JS");
		b5.setUnitCost(2313.35F);
		b5.setDescription("React Training");
		b5.setNbOfPage(340);
		b5.setPublicationDate(DateWorker.formatDate("10-01-2019"));
		b5.setIsbn("ISBN-00005");
		
		tx.begin();
		bs.createBook(b5);
		tx.commit();
		
		
		
		
	}

}
