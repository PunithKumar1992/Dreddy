package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyreply;

public interface ReplyDao {
	
	public void saveReply(Dreddyreply reply);
	public List<Dreddyreply> getallreplylist();
	public void deletereply(int reply_id);

}
