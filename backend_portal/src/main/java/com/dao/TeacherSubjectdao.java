package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.TeacherSubject;

public class TeacherSubjectdao {
	
SessionFactory sf;
	
	public TeacherSubjectdao() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sf=con.buildSessionFactory();
	}
	
	public boolean storeTeacherSubjectRecord(TeacherSubject ts) {
		try {
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(ts);
			tran.commit();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
//	public List<TeacherSubject> getAllClassesInfo(){
//		Session sesion=sf.openSession();
//		Query<TeacherSubject> qry=sesion.createQuery("select s from TeacherSubject s");
//		List<TeacherSubject>listOfStd=qry.list();
//		return listOfStd;
//	}


}


