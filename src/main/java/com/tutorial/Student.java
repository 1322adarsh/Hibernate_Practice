package com.tutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

// It is a PERSISTENT CLASS :- to map fields/entity with the database

@Entity  //@Entity(name = "student_details"):= name is optional it provide name to the entity if we don't use it class name will be the entity name.
//@Table (name = "myStudent")  //:= It is used to provide or change the table name.
public class Student {
	@Id // :- This annotation provides PRIMARY KEY to this field OR to add PRIMARY KEY @Id is used.
	private int id;
	private String name;
	private String city;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Student() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id+ " : "+this.name+" : "+this.city;
	}
	
	
}
