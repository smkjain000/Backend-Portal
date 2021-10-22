package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Classes;


public class Classesdao {
SessionFactory sf;
	
	public Classesdao() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sf=con.buildSessionFactory();
	}
	
	public boolean storeClassesRecord(Classes cc) {
		try {
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(cc);
			tran.commit();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
	public List<Classes> getAllClassesInfo(){
		Session sesion=sf.openSession();
		Query<Classes> qry=sesion.createQuery("select s from Classes s");
		List<Classes>listOfStd=qry.list();
		return listOfStd;
	}


}
