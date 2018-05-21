package com.appfone.dreddy.Serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminRecoveryDao;
import com.appfone.dreddy.Service.AdminRecoveryService;

@Service
public class AdminRecoveryServiceimpl implements AdminRecoveryService {

@Autowired
private AdminRecoveryDao adminrecovery;
	@Override
	@Transactional
	public int checkMailidtosend(String email) {
	int res= adminrecovery.checkMailidtosend(email);
		return res;
	}

	@Override
	@Transactional
	public String getusername(String email) {
		String username=adminrecovery.getusername(email);
		return username;
	}

	@Override
	@Transactional
	public String getpassword(String email) {
		String password = adminrecovery.getpassword(email);
		return password;
	}

}
