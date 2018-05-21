package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyvideos;

public interface AdminvideoDao {
	
	public List<Dreddyvideos> getallvideos();
	public void deletevideo(int video_id);
	public void saveVideo(Dreddyvideos adminvideoss);

}
