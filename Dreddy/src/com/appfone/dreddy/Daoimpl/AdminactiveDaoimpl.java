package com.appfone.dreddy.Daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.appfone.dreddy.Dao.AdminactiveDao;
import com.appfone.dreddy.pojo.Dreddyadminregestration;

@Repository
public class AdminactiveDaoimpl implements AdminactiveDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Dreddyadminregestration> getCurrentuser(String username, String password) {
	
		Session session = factory.openSession();
		Query query = session.createQuery("from Dreddyadminregestration where admin_name =:uname and admin_password = :upwd");
		query.setParameter("uname", username);
		query.setParameter("upwd", password);
		List<Dreddyadminregestration> list = query.list();
		
		return list;
	}

	@Override
	public List<Dreddyadminregestration> getalladmin() {
		Session session = factory.getCurrentSession();
		Query query= session.createQuery("from Dreddyadminregestration");
		List<Dreddyadminregestration>list = query.list();
		
		return list;
	}

	@Override
	public void deleteSingleAdmin(int id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddyadminregestration where admin_id =: aid");
		query.setParameter("aid", id);
		int res= query.executeUpdate();
		

		
	}

	@Override
	public Dreddyadminregestration getSingleadmin(int id) {
		Session session=factory.getCurrentSession();
		Dreddyadminregestration singleadmin = session.get(Dreddyadminregestration.class, id);
		return singleadmin;
		
	}

	@Override
	public void saveAdmin(Dreddyadminregestration newadmin) {
		
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(newadmin);
		
	}

	@Override
	public int checkadminNameavailable(String adminname) {
	Session session = factory.getCurrentSession();
	Query query = session.createQuery("from Dreddyadminregestration where admin_name = :adname");
	query.setParameter("adname", adminname);
	List list = query.list();
	int flag=0;
	 if(list.size()>0)
	 {
		 flag=1;
	 }
		return flag;
	}

	

}
