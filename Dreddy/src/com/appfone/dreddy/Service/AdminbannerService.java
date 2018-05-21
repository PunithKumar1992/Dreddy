package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddybanner;

public interface AdminbannerService {
	
	public List<Dreddybanner> getallbannerlist();
	public void deletebanner(int banner_id);
	public void saveBanner(Dreddybanner banner);
	public int getbannersize();
	public Dreddybanner getSinglebanner(int banner_id);

}
