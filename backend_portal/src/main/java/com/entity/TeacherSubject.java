package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeacherSubject {
	
	@Id
	
	private int sid;
	private int stid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	@Override
	public String toString() {
		return "TeacherSubject [sid=" + sid + ", stid=" + stid + "]";
	}
	
	

}
