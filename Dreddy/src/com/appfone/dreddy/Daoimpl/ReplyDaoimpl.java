package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.ReplyDao;
import com.appfone.dreddy.pojo.Dreddyreply;
@Repository
public class ReplyDaoimpl implements ReplyDao {

	@Autowired
	private SessionFactory factory;
	
	
	@Override
	public void saveReply(Dreddyreply reply) {
		Session session=factory.openSession();
		session.save(reply);
	}


	@Override
	@SuppressWarnings("deprecation")
	public List<Dreddyreply> getallreplylist() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddyreply");
		List<Dreddyreply>list = query.list();
		return list;
	}


	@Override
	public void deletereply(int reply_id) {
	Session session = factory.getCurrentSession();
	Query query = session.createQuery("delete from Dreddyreply where reply_id = :rid");
	query.setParameter("rid", reply_id);
	int res= query.executeUpdate();	
	}

}
