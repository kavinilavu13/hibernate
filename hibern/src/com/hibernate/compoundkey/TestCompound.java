package com.hibernate.compoundkey;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCompound {

	public static void main(String args[])
	{
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(Accounts.class);
		config.configure();
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		CompoundKey comkey=new CompoundKey(103,987489);
		
		Accounts acc=new Accounts();
		acc.setCompoundkey(comkey);
		acc.setAccountBalance(10000);
		
		
       CompoundKey comkey1=new CompoundKey(101,987451);
		
		Accounts acc1=new Accounts();
		acc1.setCompoundkey(comkey1);
		acc1.setAccountBalance(10000);
		
		session.save(acc);
		session.save(acc1); 
		
		session.getTransaction().commit();
		
	}
}
