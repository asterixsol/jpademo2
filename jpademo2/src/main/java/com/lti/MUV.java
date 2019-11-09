package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("My MUV")
public class MUV extends Car
{

	Integer horsePowerMUV;
	
	String buildModel;

	public MUV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MUV(Integer horsePowerMUV, String buildModel) {
		super();
		this.horsePowerMUV = horsePowerMUV;
		this.buildModel = buildModel;
	}

	public Integer getHorsePowerMUV() {
		return horsePowerMUV;
	}

	public void setHorsePowerMUV(Integer horsePowerMUV) {
		this.horsePowerMUV = horsePowerMUV;
	}

	public String getBuildModel() {
		return buildModel;
	}

	public void setBuildModel(String buildModel) {
		this.buildModel = buildModel;
	}
	
	
}
