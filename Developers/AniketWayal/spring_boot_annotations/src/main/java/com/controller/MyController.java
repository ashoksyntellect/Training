 package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.Student;

@RestController
public class MyController {
	
	private Student student;
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	@ResponseBody
	public Student home() {
		System.out.println("this is home method ");
		this.student.setName("Aniket");
		return this.student;
	}

}
