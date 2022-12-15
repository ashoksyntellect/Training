package com.syntellect;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages= {"mypack"})
public class MyConfig {

	@Bean ("Student1")
	//@Bean it will create a object and autowire it
	@Lazy 
	//its use to not creating object of this method
	public Student getStudnet()
	{
		System.out.println("Creating Object of Student class");
		return new Student("student1");
	}
	
	  @Bean ("Student2") 
	  public Student createStudent() {
	  System.out.println("Creating Second Studnet Object"); 
	  return new Student("studnt2"); 
	  }
	 
	
	  @Bean public Date getDate() {
	  System.out.println("Creating Object of Date class"); 
	  return new Date(); 
	  }
	 

}
