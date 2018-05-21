package com.appfone.dreddy.Dao;

public interface AdminRecoveryDao {
	public int checkMailidtosend(String email);
	public String getusername(String email);
	public String getpassword(String email);

}
