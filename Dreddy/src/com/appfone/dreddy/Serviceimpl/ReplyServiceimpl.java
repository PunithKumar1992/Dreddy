package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.ReplyDao;
import com.appfone.dreddy.Service.ReplyService;
import com.appfone.dreddy.pojo.Dreddyreply;
import com.opensymphony.module.sitemesh.Factory;
@Service
public class ReplyServiceimpl implements ReplyService {

	@Autowired
	private ReplyDao replydao;
	
	@Override
	@Transactional
	public void saveReply(Dreddyreply reply) {
		
		replydao.saveReply(reply);
		

	}

	@Override
	@Transactional
	public List<Dreddyreply> getallreplylist() {
		List<Dreddyreply>list = replydao.getallreplylist();
		return list;
	}

	@Override
	@Transactional
	public void deletereply(int reply_id) {
		replydao.deletereply(reply_id);
	
	}

}
