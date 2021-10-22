package com.service;

import com.dao.LoginDao;
import com.entity.Login;

public class LoginService {
	
	LoginDao loginDao=new LoginDao();
	public String signIn(Login ll) {
		if(loginDao.signIn(ll)==null) {
			return "failure";
		}else {
			if(loginDao.signIn(ll).getTypeofuser().equals("user")) {
				return "user";
			}else {
				return "admin";
			}
		}
	}
	
	public String signUp(Login ll) {
		ll.setTypeofuser("user");
		if(loginDao.signUp(ll)) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}

}

