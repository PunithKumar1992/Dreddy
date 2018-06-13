package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.CommentsDao;
import com.appfone.dreddy.pojo.Dreddycomments;

@Repository
public class CommentsDaoimpl implements CommentsDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public void saveComment(Dreddycomments comment) {
		Session session = factory.openSession();
		session.save(comment);		
	}
	@Override
	public List<Dreddycomments> getcommentlist(int article_id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddycomments where article_id =: aid");
		query.setParameter("aid", article_id);
		List<Dreddycomments>list = query.list();
		return list;
	}
	@Override
	public List<Dreddycomments> getallcomments() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddycomments");
		List<Dreddycomments> list = query.list();
		return list;
	}
	@Override
	public void deletecomment(int cmt_id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddycomments where commenter_id = : cid");
		query.setParameter("cid", cmt_id);
		int res= query.executeUpdate();
	}

}
