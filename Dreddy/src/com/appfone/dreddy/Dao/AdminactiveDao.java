package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyadminregestration;

public interface AdminactiveDao {

	public List<Dreddyadminregestration> getCurrentuser(String username,String password);

	public List<Dreddyadminregestration> getalladmin();
	
	public void deleteSingleAdmin(int id);
	
	public Dreddyadminregestration getSingleadmin(int id);
	
	public void saveAdmin(Dreddyadminregestration newadmin);
	
	public int checkadminNameavailable(String adminname);
	
}
