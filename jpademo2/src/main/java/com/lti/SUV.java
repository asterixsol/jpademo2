package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("My SUV")
public class SUV extends Car
{

	Integer towingCapacity;
	Boolean thirdRowSeating;
	public SUV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SUV(Integer towingCapacity, Boolean thirdRowSeating) {
		super();
		this.towingCapacity = towingCapacity;
		this.thirdRowSeating = thirdRowSeating;
	}
	public Integer getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(Integer towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	public Boolean getThirdRowSeating() {
		return thirdRowSeating;
	}
	public void setThirdRowSeating(Boolean thirdRowSeating) {
		this.thirdRowSeating = thirdRowSeating;
	}
	
	
}
