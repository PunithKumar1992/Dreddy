package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddycomments;

public interface CommentsService {
	public void saveComment(Dreddycomments comment);
	public List<Dreddycomments>getcommentlist(int article_id);
	public List<Dreddycomments>getallcomments();
	public void deletecomment(int cmt_id);


}
