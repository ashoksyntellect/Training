package com.hibrelation;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	private String lname;
	
	@ManyToOne
	private Student1 student1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Student1 getStudent1() {
		return student1;
	}
	public void setStudent1(Student1 student1) {
		this.student1 = student1;
	}
	 
	
}
