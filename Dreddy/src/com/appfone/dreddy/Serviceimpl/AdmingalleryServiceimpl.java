package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdmingalleryDao;
import com.appfone.dreddy.Service.AdmingalleryService;
import com.appfone.dreddy.pojo.Dreddygalareyimg;

@Service
public class AdmingalleryServiceimpl implements AdmingalleryService {

	@Autowired
	private AdmingalleryDao admingallery;
	
	@Override
	@Transactional
	public void savegalleryImg(Dreddygalareyimg galleryimg) {
		
		admingallery.savegalleryImg(galleryimg);
	}

	@Override
	@Transactional
	public List<Dreddygalareyimg> allimglist() {
		List<Dreddygalareyimg>list = admingallery.allimglist();
		return list;
	}

	@Override
	@Transactional
	public void deletegalleryImg(int gallery_id) {
	
		admingallery.deletegalleryImg(gallery_id);
	}

}
