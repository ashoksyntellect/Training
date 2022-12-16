package com.relation.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="userdetails")
@Entity
public class User {

	@Id
	private int id;
	
	@Column(length = 20, nullable = false)
	private String firstName;

	@Column(length = 20, nullable = false)
	private String lastName;
	
	@Column(length = 20, nullable = false)
	private String email;
	
	@Column(length = 11, nullable = false,unique = true)
	private long phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public User(int id, String firstName, String lastName, String email, long phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Orders> orderlist=new ArrayList<>();
}
