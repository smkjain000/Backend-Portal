package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;

public class Teacherdao {
	SessionFactory sf;
	
	public Teacherdao() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sf=con.buildSessionFactory();
	}
	
	public boolean storeTeacherRecord(Teacher tt) {
		try {
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(tt);
			tran.commit();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
	public List<Teacher> getAllTeacherInfo(){
		Session sesion=sf.openSession();
		Query<Teacher> qry=sesion.createQuery("select s from Teacher s");
		List<Teacher>listOfTeacher=qry.list();
		return listOfTeacher;
	}

}
