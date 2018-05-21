package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminactiveDao;
import com.appfone.dreddy.Service.AdminactiveService;
import com.appfone.dreddy.pojo.Dreddyadminregestration;

@Service
public class AdminactiveServiceimpl implements AdminactiveService {

	@Autowired
	private AdminactiveDao adminactiv;
	@Override
	public List<Dreddyadminregestration> getCurrentuser(String username, String password) {
	
		List<Dreddyadminregestration> list = adminactiv.getCurrentuser(username, password);
		
		return list;
	}
	@Override
	@Transactional
	public List<Dreddyadminregestration> getalladmin() {
		List<Dreddyadminregestration> list =adminactiv.getalladmin();
		return list;
	}
	@Override
	@Transactional
	public void deleteSingleAdmin(int id) {
		adminactiv.deleteSingleAdmin(id);
		
		
	}
	@Override
	@Transactional
	public Dreddyadminregestration getSingleadmin(int id) {
		Dreddyadminregestration singleadmin = adminactiv.getSingleadmin(id);
		return singleadmin;
	}
	@Override
	@Transactional
	public void saveAdmin(Dreddyadminregestration newadmin) {
	
		adminactiv.saveAdmin(newadmin);
	}
	@Override
	@Transactional
	public int checkadminNameavailable(String adminname) {
		int res = adminactiv.checkadminNameavailable(adminname);
		return res;
	}

}
