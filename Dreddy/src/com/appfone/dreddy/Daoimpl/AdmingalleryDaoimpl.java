package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdmingalleryDao;
import com.appfone.dreddy.pojo.Dreddygalareyimg;

@Repository
public class AdmingalleryDaoimpl implements AdmingalleryDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public void savegalleryImg(Dreddygalareyimg galleryimg) {
		Session session = factory.openSession();
		session.save(galleryimg);
	}
	@Override
	public List<Dreddygalareyimg> allimglist() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Dreddygalareyimg");
		List<Dreddygalareyimg>list = query.list();
		return list;
	}
	@Override
	public void deletegalleryImg(int gallery_id) {
		Session session= factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddygalareyimg where gallery_id =:gid");
		query.setParameter("gid", gallery_id);
		int res= query.executeUpdate();
		
		
	}

}
