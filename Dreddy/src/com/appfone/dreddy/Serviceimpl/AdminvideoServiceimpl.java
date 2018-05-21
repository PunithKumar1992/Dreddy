package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminvideoDao;
import com.appfone.dreddy.Service.AdminvideoService;
import com.appfone.dreddy.pojo.Dreddyvideos;

@Service
public class AdminvideoServiceimpl implements AdminvideoService {

	@Autowired
	private AdminvideoDao adminvideo;
	@Override
	public List<Dreddyvideos> getallvideos() {
		
		List<Dreddyvideos>list= adminvideo.getallvideos();
		return list;
	}
	@Override
	@Transactional
	public void deletevideo(int video_id) {
		
		adminvideo.deletevideo(video_id);
		
	}
	@Override
	@Transactional
	public void saveVideo(Dreddyvideos adminvideoss) {
		adminvideo.saveVideo(adminvideoss);
	}
	
	
	

}
