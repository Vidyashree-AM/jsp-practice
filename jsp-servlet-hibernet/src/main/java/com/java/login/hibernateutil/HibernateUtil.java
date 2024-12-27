package com.java.login.hibernateutil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.java.login.Model.User;

public class HibernateUtil {
	private static SessionFactory sessionfactory = null;
	
	public static SessionFactory getSessionfactory()
	{
	try
	{
		if(sessionfactory == null)
		{
			Configuration config = new Configuration();
			
			Properties prop = new Properties();
			prop.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			prop.put(Environment.URL, "jdbc:mysql://localhost:3306/jsp_schema");
			prop.put(Environment.USER, "root");
			prop.put(Environment.PASS, "vidya123");
			
			prop.put(Environment.SHOW_SQL, "true");
			prop.put(Environment.HBM2DDL_AUTO, "update");
			prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			
			config.setProperties(prop);
			config.addAnnotatedClass(User.class);
			
			ServiceRegistry servicereg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionfactory = config.buildSessionFactory(servicereg);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	 return sessionfactory;
	}
	
}
