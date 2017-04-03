package com.vt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vt.model.Registrationmodel;
import com.vt.sql.Registrationentity;

public class AccessDaoImpl implements AccessDao {
	Configuration conf=new Configuration();
    
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	

	@Override
	public void register(Registrationentity registrationmodetoentity) {
		session.save(registrationmodetoentity );
	}
}
	
