package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddycomments;

public interface CommentsDao {
	public void saveComment(Dreddycomments comment);
	public List<Dreddycomments>getcommentlist(int article_id);
	public List<Dreddycomments>getallcomments();
	public void deletecomment(int cmt_id);

				
}
