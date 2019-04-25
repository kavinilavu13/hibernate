package com.hibernate.chapter1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {

	public static void main(String args[])
	{

		System.out.println("Main class Starting to run");
		AnnotationConfiguration config=new AnnotationConfiguration();

		//AnnotationConfiguration is the class which creates the session factory in Hibernate. AnnotationConfiguration is used when we are using annotated POJO instead of hbm files. AnnotationConfiguration can configure database configuration and can register all the classes which are acting as POJO

		config.addAnnotatedClass(Employee.class);
		config.configure();//reads the particular  cofiguration file.if it hibernate.cfg.xml no required
     new SchemaExport(config).create(true,true);//boolean script statement what ever sql hibernate  go create,let it write log file,	boolean export-what ever sql statement that u create execute the database 
		//write into log file.only once use then comment in program otherwise loose the data.
		//script: This boolean argument tells SchemaExport to print DDL scripts to the console. If it is false, then DDL scripts will not be printed to the console.
		//export: This boolean argument tells SchemaExport to create the database schema. If this value is set to false, then nothing will happen in your database. I missed this and wasted couple of hours.
		
		SessionFactory factory= config.buildSessionFactory(); //begin the transaction
		Session session=factory.getCurrentSession();//create the session 
		
		session.beginTransaction();// begin the transaction
		
		//this is transisent object not associate with session(which our we want to save we create the object)
		
		Employee emp=new Employee();
		//emp.setEmpId(100);
		emp.setEmpName("kavi");
		emp.setEmpEmailAddress("kavi@gmail.com");	
		session.save(emp);//this is persistent object	
		
		Employee emp1=new Employee();
			//emp1.setEmpId(200);why because its going to be auto genarate
			emp1.setEmpName("nilavu");
			emp1.setEmpEmailAddress("nilavu@gmail.com");	
			session.save(emp1);//this is persistent object	
		
			Employee emp3=new Employee();
			//emp3.setEmpId(200);why because its going to be auto genarate
			emp3.setEmpName("vineela");
			emp3.setEmpEmailAddress("vineela@gmail.com");	
			session.save(emp3);//this is persistent object	
		

			Employee emp4=new Employee();
			//emp3.setEmpId(200);why because its going to be auto genarate
			emp4.setEmpName("vineela");
			emp4.setEmpEmailAddress("vineela@gmail.com");	
			session.save(emp4);//this is persistent object	
		
			
			Employee emp5=new Employee();
			//emp3.setEmpId(200);why because its going to be auto genarate
			emp5.setEmpName("vineela");
			emp5.setEmpEmailAddress("vineela@gmail.com");	
			session.save(emp5);//this is persistent object	
		
		

			Employee emp6=new Employee();
			//emp3.setEmpId(200);why because its going to be auto genarate
			emp6.setEmpName("vineela");
			emp6.setEmpEmailAddress("vineela@gmail.com");	
			session.save(emp6);//this is persistent object	
		
	
		
		session.getTransaction().commit();//execute the insert the database     
	
	}
}
