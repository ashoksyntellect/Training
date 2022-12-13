package com.annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"package com.annotations.component"})
public class MyConfig {

	@Bean ("student1")//this bean annotation tell us that one bean being return or the object is getting return
	@Lazy
	public Student getStudent() {
		System.out.println("creating first student object");
		return new Student("Student1");
	}
	@Bean("student2")
	public Student createstudent() {
		System.out.println("Creating second student");
		return new Student("student2");
	}
}
