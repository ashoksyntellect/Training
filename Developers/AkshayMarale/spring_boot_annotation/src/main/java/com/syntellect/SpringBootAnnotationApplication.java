package com.syntellect;


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
	
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
		
}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();	
		this.emp.whatsYourName();
		this.dog.eating();
	}


