package com.syntellect;

public class Student {
    
    public String name;
    
    
    public Student(String name) {
        this.name = name;
    }



    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void studying() {
        System.out.println(this.name + "am studying");
    }



}
