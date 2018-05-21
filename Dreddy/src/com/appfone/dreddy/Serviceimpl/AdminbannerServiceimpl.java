package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminbannerDao;
import com.appfone.dreddy.Service.AdminbannerService;
import com.appfone.dreddy.pojo.Dreddybanner;

@Service
public class AdminbannerServiceimpl implements AdminbannerService {

	@Autowired
	private AdminbannerDao adminbannerdao;
	@Override
	public List<Dreddybanner> getallbannerlist() {
		List<Dreddybanner> list = adminbannerdao.getallbannerlist();
		return list;
	}
	@Override
	@Transactional
	public void deletebanner(int banner_id) {
		
		adminbannerdao.deletebanner(banner_id);
		
	}
	@Override
	@Transactional
	public void saveBanner(Dreddybanner banner) {
		
		adminbannerdao.saveBanner(banner);
	}
	@Override
	@Transactional
	public int getbannersize() {
		int size = adminbannerdao.getbannersize();
		return size;
	}
	@Override
	@Transactional
	public Dreddybanner getSinglebanner(int banner_id) {
		Dreddybanner editbanner = adminbannerdao.getSinglebanner(banner_id);
		
		return editbanner;
	}

}
