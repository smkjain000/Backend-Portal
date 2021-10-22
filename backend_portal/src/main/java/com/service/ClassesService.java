package com.service;

import java.util.List;

import com.dao.Classesdao;
import com.entity.Classes;

public class ClassesService {
	
Classesdao classesdao=new Classesdao();
	
	public String storeClassesInfo(Classes classes) {
		if(classesdao.storeClassesRecord(classes)) {
			return "Class Record store successfully";
		}else {
			return "Class didn't store";
		}
	}
	
	public List<Classes> getAllClasses(){
		return classesdao.getAllClassesInfo();
	}

}
