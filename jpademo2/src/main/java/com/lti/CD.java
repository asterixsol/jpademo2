package com.lti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CD 
{   
	@Id @GeneratedValue
	Integer id;
	Float totalDuration;
	String musicCompany;
	String genre;
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(Integer id, Float totalDuration, String musicCompany, String genre) {
		super();
		this.id = id;
		this.totalDuration = totalDuration;
		this.musicCompany = musicCompany;
		this.genre = genre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getTotalDuration() {
		return totalDuration;
	}
	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}
	public String getMusicCompany() {
		return musicCompany;
	}
	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
