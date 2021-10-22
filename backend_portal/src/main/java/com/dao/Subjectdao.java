package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Subject;

public class Subjectdao {
	SessionFactory sf;
	
	public Subjectdao() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sf=con.buildSessionFactory();
	}
	
	public boolean storeSubjectRecord(Subject ss) {
		try {
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(ss);
			tran.commit();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
	public List<Subject> getAllSubjectInfo(){
		Session sesion=sf.openSession();
		Query<Subject> qry=sesion.createQuery("select s from Subject s");
		List<Subject>listOfStd=qry.list();
		return listOfStd;
	}

}

