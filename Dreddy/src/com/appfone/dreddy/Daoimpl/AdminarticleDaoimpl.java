package com.appfone.dreddy.Daoimpl;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminarticleDao;
import com.appfone.dreddy.pojo.Dreddyarticle;

@Repository
public class AdminarticleDaoimpl implements AdminarticleDao {

@Autowired
private SessionFactory factory;
	
	@Override
	public void saveArticle(Dreddyarticle article) {
		Session session = factory.openSession();
		session.save(article);
		
		
	}

	@Override
	public List<Dreddyarticle> getallarticle() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddyarticle");
		List<Dreddyarticle>list = query.list();
		return list;
	}

	@Override
	public Dreddyarticle getsinglearticle(int articleid) {
		Session session = factory.getCurrentSession();
		Dreddyarticle article= session.get(Dreddyarticle.class, articleid);
		return article;
	}

	@Override
	public int articlecount() {
		int size=0;
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("select count(*) from  Dreddyarticle");
	
		List list=query.list();
		Iterator itr=list.iterator();
		size=Integer.parseInt(itr.next().toString());
		return size;
	}

	@Override
	public void deletearticle(int article_id) {
		Session session= factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddyarticle where article_id =: artid");
		query.setParameter("artid", article_id);
		int res = query.executeUpdate();
		
	}

	@Override
	public void updatearticle(Dreddyarticle article) {
		Session session = factory.getCurrentSession();
		session.update(article);
	}

	

}
