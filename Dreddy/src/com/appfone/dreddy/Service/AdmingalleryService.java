package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddygalareyimg;

public interface AdmingalleryService {
	public void savegalleryImg(Dreddygalareyimg galleryimg);
	public List<Dreddygalareyimg> allimglist();
	public void deletegalleryImg(int gallery_id);
	
}
