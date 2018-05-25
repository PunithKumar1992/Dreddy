package com.appfone.dreddy.Daoimpl;

import java.beans.FeatureDescriptor;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.UserfeedbackDao;
import com.appfone.dreddy.pojo.Dreddyfeedback;

@Repository
public class UserfeedbackDaoimpl implements UserfeedbackDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void saveUserfeedback(Dreddyfeedback feedback) {
		Session session = factory.openSession();
		session.save(feedback);
		

	}

	@Override
	public List<Dreddyfeedback> getUserfeedlist() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddyfeedback");
		List<Dreddyfeedback>list =query.list();
	
		return list;
	}

	@Override
	public void deletefeedback(int feed_id) {
		Session session= factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddyfeedback where feed_id =:fid");
		query.setParameter("fid", feed_id);
		int res= query.executeUpdate();
		
	}

	@Override
	public Dreddyfeedback getsinglefeedback(int feed_id) {
		Session session = factory.getCurrentSession();
		Dreddyfeedback feedback = session.get(Dreddyfeedback.class, feed_id);
		return feedback;
	}

	@Override
	public void update_feedback(Dreddyfeedback feedback) {
		Session session = factory.getCurrentSession();
		session.update(feedback);
		
	}

}
