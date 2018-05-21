package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddygalareyimg;

public interface AdmingalleryDao {
	
	public void savegalleryImg(Dreddygalareyimg galleryimg);
	public List<Dreddygalareyimg> allimglist();
	public void deletegalleryImg(int gallery_id);

}
