package com.syntellect;


import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibrelation.Laptop;
import com.hibrelation.Student1;

import mypack.Dog;

@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Student2")
	private Student student;
	
	  @Autowired 
	  private Date date;
	 
	@Autowired
	private Emp emp;
	@Autowired
	private Dog dog;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
		
		Laptop laptop =new Laptop();
		laptop.setId(101);
		laptop.setLname("Dell");
		
		Student1 s = new Student1();
		s.setRollno(1);
		s.setName("a");
		s.setMarks(90);
		s.getLaptop().add(laptop);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student1.class).addAnnotatedClass(Laptop.class);
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf=con.buildSessionFactory(registry);
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(s);
		
		session.getTransaction().commit();
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();	
		this.emp.whatsYourName();
		this.dog.eating();
	}

}
