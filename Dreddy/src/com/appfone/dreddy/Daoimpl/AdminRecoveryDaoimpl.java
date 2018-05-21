package com.appfone.dreddy.Daoimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminRecoveryDao;
import com.appfone.dreddy.pojo.Dreddyadminregestration;

@Repository
public class AdminRecoveryDaoimpl implements AdminRecoveryDao {

	@Autowired
	private SessionFactory factory;         
	@Override
	@SuppressWarnings("deprecation")
	public int checkMailidtosend(String email) {
		Session session=factory.openSession();
		int flag=0;
		Query query =session.createQuery("from Dreddyadminregestration where admin_email=:mail");
		query.setParameter("mail", email);
		List list = query.list();
		if(list!=null && list.size()>0)
		{
			flag=1;
			return flag;
		}
		
		
		return flag;
	}

	@Override
	@SuppressWarnings("deprecation")             
	public String getusername(String email) {
Session session =factory.getCurrentSession();
		
		String result = (String)session.createCriteria(Dreddyadminregestration.class)
			    .add(Restrictions.eq("admin_email",email))
			    .setProjection(Property.forName("admin_name"))
			    .uniqueResult();
		return result;
	}

	@Override
	@SuppressWarnings("deprecation")
	public String getpassword(String email) {
Session session =factory.getCurrentSession();
		
		
		String result = (String)session.createCriteria(Dreddyadminregestration.class)
			    .add(Restrictions.eq("admin_email",email))
			    .setProjection(Property.forName("admin_password"))
			    .uniqueResult();
		return result;
	}

}
