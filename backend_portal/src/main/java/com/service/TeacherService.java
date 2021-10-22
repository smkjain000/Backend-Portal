package com.service;

import java.util.List;

import com.dao.Teacherdao;
import com.entity.Teacher;

public class TeacherService {
	
	Teacherdao teacherdao=new Teacherdao();
	
	public String storeTeacherInfo(Teacher teacher) {
		if(teacherdao.storeTeacherRecord(teacher)) {
			return "Teacher Record store successfully";
		}else {
			return "Teacher didn't store";
		}
	}
	
	public List<Teacher> getAllTeacher(){
		return teacherdao.getAllTeacherInfo();
	}
	
	

}