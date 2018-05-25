package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyarticle;

public interface AdminarticleDao {

	public void saveArticle(Dreddyarticle article);
	public List<Dreddyarticle> getallarticle();
	public Dreddyarticle getsinglearticle(int articleid);
	public int articlecount();
	public void deletearticle(int article_id);
	public void updatearticle(Dreddyarticle article);
	
}
