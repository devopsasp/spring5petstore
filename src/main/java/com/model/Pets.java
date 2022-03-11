package com.model;

public class Pets {
	
	 private String petName;
	 private String type;
	 private int age;
	 
	 
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pets(String petName, String type, int age) {
		super();
		this.petName = petName;
		this.type = type;
		this.age = age;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 

}
