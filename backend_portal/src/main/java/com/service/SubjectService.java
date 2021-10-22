package com.service;

import java.util.List;

import com.dao.Subjectdao;
import com.entity.Subject;

public class SubjectService {
	
	Subjectdao subjectdao=new Subjectdao();
	
	public String storeSubjectInfo(Subject subject) {
		if(subjectdao.storeSubjectRecord(subject)) {
			return "Student Record store successfully";
		}else {
			return "Student didn't store";
		}
	}
	
	public List<Subject> getAllSubject(){
		return subjectdao.getAllSubjectInfo();
	}
	
	

}