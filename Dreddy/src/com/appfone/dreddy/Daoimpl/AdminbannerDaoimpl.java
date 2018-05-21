package com.appfone.dreddy.Daoimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminbannerDao;
import com.appfone.dreddy.pojo.Dreddybanner;


@Repository
public class AdminbannerDaoimpl implements AdminbannerDao {

@Autowired
SessionFactory factory;
	
	@Override
	public List<Dreddybanner> getallbannerlist() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Dreddybanner");
		List<Dreddybanner>list = query.list();
		
		
		return list;
	}

	@Override
	public void deletebanner(int banner_id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddybanner where banner_id = :bid");
		query.setParameter("bid", banner_id);
		int res= query.executeUpdate();
		
		
	}

	@Override
	public void saveBanner(Dreddybanner banner) {
	Session session= factory.getCurrentSession();
	session.saveOrUpdate(banner);
	}

	@Override
	public int getbannersize() {
		int size=0;
		Session session=factory.openSession();
		
		Query query=session.createQuery("select count(*) from Dreddybanner");
		List list=query.list();
		Iterator itr=list.iterator();
		size=Integer.parseInt(itr.next().toString());
		return size;
		
	}

	@Override
	public Dreddybanner getSinglebanner(int banner_id) {
		Session session =factory.getCurrentSession();
		Dreddybanner editbanner = session.get(Dreddybanner.class, banner_id);
		
		return editbanner;
	}

}
