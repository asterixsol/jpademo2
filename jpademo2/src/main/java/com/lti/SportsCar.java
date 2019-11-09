package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("My SportsCar")
public class SportsCar extends Car
{
	
	Integer topSpeed;
	Double zeroToSixty;
	public SportsCar(Integer topSpeed, Double zeroToSixty) {
		super();
		this.topSpeed = topSpeed;
		this.zeroToSixty = zeroToSixty;
	}
	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	public Double getZeroToSixty() {
		return zeroToSixty;
	}
	public void setZeroToSixty(Double zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
	}
	
	
	
}
