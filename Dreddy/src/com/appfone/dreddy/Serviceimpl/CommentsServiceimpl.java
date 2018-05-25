package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.CommentsDao;
import com.appfone.dreddy.Service.CommentsService;
import com.appfone.dreddy.pojo.Dreddycomments;

@Service
public class CommentsServiceimpl implements CommentsService {

	@Autowired
	private CommentsDao commentsdao;
	
	
	@Override
	@Transactional
	public void saveComment(Dreddycomments comment) {
	commentsdao.saveComment(comment);

	}


	@Override
	@Transactional
	public List<Dreddycomments> getcommentlist(int article_id) {
	List<Dreddycomments>list = commentsdao.getcommentlist(article_id);
		return list;
	}


	@Override
	@Transactional
	public List<Dreddycomments> getallcomments() {
	List<Dreddycomments> list = commentsdao.getallcomments();
		return list;
	}


	@Override
	@Transactional
	public void deletecomment(int cmt_id) {
		commentsdao.deletecomment(cmt_id);
	
		
	}

}
