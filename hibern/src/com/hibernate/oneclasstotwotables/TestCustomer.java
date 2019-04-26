package com.hibernate.oneclasstotwotables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.chapter1.Employee;

public class TestCustomer {
	public static void main(String args[])
	{
	AnnotationConfiguration config=new AnnotationConfiguration();
	config.addAnnotatedClass(Customer.class);
	config.configure();
	//new SchemaExport(config).create(true, true);
	
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.getCurrentSession();
	session.beginTransaction();
	
	
	Customer cus=new Customer();
	//no need to set customer id it is auto generator 
	cus.setCustomerName("kavi");
	cus.setCreditScore(100);
	cus.setRewardPonits(100000);
	cus.setCustomerAddress("kavi@gmail.com");
	
	session.save(cus);
	session.getTransaction().commit();
	
	
	}
}
