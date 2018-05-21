package com.appfone.dreddy.Service;

public interface AdminRecoveryService {
	public int checkMailidtosend(String email);
	public String getusername(String email);
	public String getpassword(String email);

}
