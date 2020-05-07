package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastname;
	private String address;
	private String email;
	private String number;
	
	
	
	public Person() {
	
	}
	public Person(String firstName, String lastname, String address, String email, String number) {
		
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastname=" + lastname + ", address=" + address + ", email=" + email
				+ ", number=" + number + "]";
	}
	
	
	
}
