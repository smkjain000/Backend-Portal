package com.service;

import java.util.List;

import com.dao.TeacherSubjectdao;
import com.entity.TeacherSubject;

public class TeacherSubjectService {
	
TeacherSubjectdao tsdao=new TeacherSubjectdao();
	
	public String storeTeacherSubjectInfo(TeacherSubject ts) {
		if(tsdao.storeTeacherSubjectRecord(ts)) {
			return "Assign successfully";
		}else {
			return "Not Assigned, Please Enter Correct Id's";
		}
	}
	
//	public List<Classes> getAllClasses(){
//		return classesdao.getAllClassesInfo();
//	}

}

