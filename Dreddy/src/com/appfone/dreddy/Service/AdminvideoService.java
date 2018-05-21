package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyvideos;

public interface AdminvideoService {

	
	public List<Dreddyvideos> getallvideos();
	public void deletevideo(int video_id);
	public void saveVideo(Dreddyvideos adminvideoss);
}
