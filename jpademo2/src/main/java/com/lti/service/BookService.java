package com.lti.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.Book;
import com.lti.util.EntityState;

public class BookService 
{

	EntityManager em;

	public BookService(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	public Book createBook(Book b)
	{
		System.out.println("Detached state for Book before persist:"+EntityState.isDetached((Entity) b));
		em.persist(b);
		System.out.println("Detached state for Book after persist:"+EntityState.isDetached((Entity) b));
		return b;
	}
	
	public void queryBooks()
	{
		String q="Select b from Book b";
		Query query=em.createQuery(q);
		List l=query.getResultList();
		
		for(Object o:l)
		{
			Book b=(Book)o;
			System.out.println("===============================\n"+b);
		}
		
	}
	
	public void queryTypedBooks()
	{
		String q="Select b from Book b";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
		
	}
	
	public void queryTypedWithWhereClause()
	{
		System.out.println("=======================Query with where clause==========================\n");
		
		String q="Select b from Book b where b.unitCost>500 AND b.nbOfPage>600";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
	
	}
	
	public void queryBooksPosition(Float unitCost,Integer nbOfPage)
	{
		System.out.println("=======================Query with where clause with parameters==========================\n");
		
		String q="Select b from Book b where b.unitCost> ?1 AND b.nbOfPage> ?2";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		
		query.setParameter(1,unitCost);
		query.setParameter(2, nbOfPage);
		
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
	
	}
	
	public void queryBooksName(Float unitCost,Integer nbOfPage)
	{
		System.out.println("----------------------------Query with where clause with Named parameters--------------------\n");
		
		String q="Select b from Book b where b.unitCost> :cost AND b.nbOfPage> :pages";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		
		query.setParameter("cost",unitCost);
		query.setParameter("pages", nbOfPage);
		
		
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
	
	}
	
	public void queryBooksPositionWithDate(Float unitCost,Integer nbOfPage,LocalDate publishDate)
	{
		System.out.println("=======================Query with where clause with parameters Date Test==========================\n");
		
		String q="Select b from Book b where b.unitCost> :cost AND b.nbOfPage> :pages AND b.publicationDate > :date";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		
		query.setParameter("cost",unitCost);
		query.setParameter("pages", nbOfPage);
		query.setParameter("date", publishDate);
		
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
	
	}
	
	public void queryBooksWithPagination(int noOfRecords)
	{
		System.out.println("=======================Query with Pagination==========================\n");
		
		String q="Select b from Book b";
		TypedQuery<Book> query=em.createQuery(q,Book.class);
		query.setMaxResults(noOfRecords);
		
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
		
			System.out.println("===============================\n"+b);
		}
	
	}
	
	public void namedQueryBooks()
	{
		System.out.println("\n\n\n----------------------Named Query without Parameters---------------------------\n\n");
		TypedQuery<Book> query=em.createNamedQuery("PageNoQuery", Book.class);
		List<Book> list=query.getResultList();
		for (Book b:list)
		{
			System.out.println(b);
		}
	}
	
	public void namedQueryBooksWithPostion(Integer noOfPages)
	{
		System.out.println("\n\n\n----------------------Named Query with Position Parameters---------------------------\n\n");
		TypedQuery<Book> query=em.createNamedQuery("PageNoQueryWithPosition", Book.class);
		query.setParameter(1,noOfPages);
		List<Book> list=query.getResultList();
		for (Book b:list)
		{
			System.out.println(b);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
