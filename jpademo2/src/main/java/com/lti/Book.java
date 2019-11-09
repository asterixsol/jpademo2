package com.lti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="PageNoQuery",query="Select b from Book b where nbOfPage>500")
@NamedQuery(name="PageNoQueryWithPosition",query="Select b from Book b where nbOfPage>?1")
public class Book extends Item 
{	
	@Id @GeneratedValue
	Integer id;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(Integer id, String isbn, Integer nbOfPage, LocalDate publicationDate) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNbOfPage() {
		return nbOfPage;
	}
	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	String isbn;
	Integer nbOfPage;
	LocalDate publicationDate;
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", publicationDate=" + publicationDate
				+ ", title=" + title + ", description=" + description + ", unitCost=" + unitCost + "]";
	}


	
	

}
