package com.syntellect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syntellect.Student;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("Student1")
	private Student student;
	
	
	@RequestMapping(value = "/home" ,method = RequestMethod.GET)
	@ResponseBody
	public Student home(@RequestBody Student st){
		System.out.println("This is home method");
		this.student.setName("Akshay");
		return this.student;
	}
}
