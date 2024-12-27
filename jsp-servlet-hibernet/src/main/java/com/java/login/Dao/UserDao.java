package com.java.login.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.login.Model.User;
import com.java.login.hibernateutil.HibernateUtil;

public class UserDao {

	public void SaveUser(User u)
	{
		Transaction trans = null;
		
		try(Session Session = HibernateUtil.getSessionfactory().openSession())
		{
			trans = Session.beginTransaction();
			Session.save(u);
			trans.commit();
		}catch(Exception e) {
			if(trans != null)
				trans.rollback();
			
			e.printStackTrace();
		}
		
	}
}
