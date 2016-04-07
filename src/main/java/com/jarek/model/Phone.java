package com.jarek.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private int phone_id;
	
	@Column(name="number")
	private String number;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")    	
	private Person person;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	
	public Phone(String number, Person person) {
		super();
		this.number = number;
		this.person = person;
	}

	
	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
