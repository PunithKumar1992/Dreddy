package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyreply;

public interface ReplyService {
	
	public void saveReply(Dreddyreply reply);
	public List<Dreddyreply> getallreplylist();
	public void deletereply(int reply_id);
	
}
