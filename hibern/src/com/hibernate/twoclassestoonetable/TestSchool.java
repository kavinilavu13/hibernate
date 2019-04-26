package com.hibernate.twoclassestoonetable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestSchool {
	public static void main(String args[])
	{
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure();
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		
		SchoolDetails schdetails=new SchoolDetails();
        schdetails.setSchoolAddress("101 Nadupaaty,Salem");
        schdetails.setStudentCount(100);
        schdetails.setPublicSchool(true);
	
		School sch=new  School();
		sch.setSchoolName("Goverment Higer Secondary School");
		sch.setSchoolDetails(schdetails);//here pass the value schooldetails 
        
	   session.save(sch);
	
	   
	   session.getTransaction().commit();
	}

}
