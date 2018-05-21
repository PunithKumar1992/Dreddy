
package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminvideoDao;
import com.appfone.dreddy.pojo.Dreddyvideos;

@Repository
public class AdminvideoDaoimpl implements AdminvideoDao {

	
	
@Autowired
private SessionFactory factory;
	@Override
	public List<Dreddyvideos> getallvideos() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Dreddyvideos");
		List<Dreddyvideos>list = query.list();
		return list;
	}
	@Override
	public void deletevideo(int video_id) {
	Session session = factory.getCurrentSession();
	Query query = session.createQuery("delete from Dreddyvideos where video_id =:vid");
	query.setParameter("vid", video_id);
	int res= query.executeUpdate();
	
		
	}
	@Override
	public void saveVideo(Dreddyvideos adminvideoss) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(adminvideoss);
		
	}

}
