package com.appfone.dreddy.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminLoginDao;
import com.appfone.dreddy.Service.AdminLoginService;

@Service
public class AdminLoginServiceimpl implements AdminLoginService {

	@Autowired
	private AdminLoginDao adminlogin;
	@Override
	public int checkAdmin(String username, String pass) {
		int res= adminlogin.checkAdmin(username, pass);		
		return res;
				
	}

}
