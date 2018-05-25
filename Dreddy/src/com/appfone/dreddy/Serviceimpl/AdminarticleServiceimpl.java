package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminarticleDao;
import com.appfone.dreddy.Service.AdminarticleService;
import com.appfone.dreddy.pojo.Dreddyarticle;

@Service
public class AdminarticleServiceimpl implements AdminarticleService {

	@Autowired
	private AdminarticleDao articledao;
	
	@Override
	@Transactional
	public void saveArticle(Dreddyarticle article) {
	
		articledao.saveArticle(article);
	}

	@Override
	@Transactional
	public List<Dreddyarticle> getallarticle() {
		List<Dreddyarticle> list = articledao.getallarticle();
		return list;
	}

	@Override
	@Transactional
	public Dreddyarticle getsinglearticle(int articleid) {
		Dreddyarticle article = articledao.getsinglearticle(articleid);
		return article;
	}

	@Override
	@Transactional
	public int articlecount() {
		int size = articledao.articlecount();
		return size;
	}

	@Override
	@Transactional
	public void deletearticle(int article_id) {
		articledao.deletearticle(article_id);
		
	}

	@Override
	@Transactional
	public void updatearticle(Dreddyarticle article) {
		articledao.updatearticle(article);
	}

}
