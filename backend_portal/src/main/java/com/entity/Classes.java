package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Classes {
	@Id

	
	private int cid;
	private int csid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", csid=" + csid + "]";
	}
}