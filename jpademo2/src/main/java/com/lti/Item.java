package com.lti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="item")
@Inheritance(strategy=InheritanceType.JOINED)
public class Item
{
	@Id @GeneratedValue
	Integer id;
	String title;
	String description;
	Float unitCost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer id, String title, String description, Float unitCost) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}
	
	
	
	
}
