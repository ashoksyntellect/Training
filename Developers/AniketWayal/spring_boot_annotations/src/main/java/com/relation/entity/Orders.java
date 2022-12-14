package com.relation.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="ordersdetails")
@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	
	private String pname;
	
	private double price;
	
	private int quantity;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders(int oid, String pname, double price, int quantity) {
		super();
		this.oid = oid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	@ManyToOne(fetch =FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name="uid", referencedColumnName = "id")
	@JsonBackReference
	private User user;
}
