package com.serilization;

import java .io.Serializable;

import org.springframework.context.support.StaticApplicationContext;
public class Book implements Serializable {

	private static final long serialVersionUID=1l;
	
	int bcode;
	String bname;
	public Book(int bcode, String bname) {
		super();
		this.bcode = bcode;
		this.bname = bname;
	}
	
}
