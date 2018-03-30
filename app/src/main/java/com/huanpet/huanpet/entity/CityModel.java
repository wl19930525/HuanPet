package com.huanpet.huanpet.entity;

public class CityModel {
	private String name;

	public CityModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CityModel [name=" + name + "]";
	}

}
