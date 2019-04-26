package com.hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestInheritance {
	public static void main(String args[]) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Module.class);
		config.addAnnotatedClass(Task.class);
		config.configure();
		new SchemaExport(config).create(true,true);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		Project proj=new Project();
		proj.setProjectName("Hibernate Lesson");
		
		Module mod=new Module();
		mod.setProjectName("Spring Lesson");
		mod.setModuleName("AOP");
		
		Task tas=new Task();
		tas.setProjectName("Java Colection");
		tas.setModuleName("Collection");
		tas.setTaskName("ArrayList");

		session.save(proj);
		session.save(mod);
		session.save(tas);
		
		session.getTransaction().commit();
	}

}
