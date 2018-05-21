package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminLoginDao;
@Repository
public class AdminLoginDaoimpl implements AdminLoginDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public int checkAdmin(String username, String pass) {
		Session session=factory.openSession();
		Query query=session.createQuery("from Dreddyadminregestration where admin_name = :uname and admin_password = :upass");
		query.setParameter("uname", username);
		query.setParameter("upass", pass);
		List list=query.list();
		int flag=0;
		if ((list != null) && (list.size() > 0)) {
			flag=1;
		}
		return flag;
	
	}

}
