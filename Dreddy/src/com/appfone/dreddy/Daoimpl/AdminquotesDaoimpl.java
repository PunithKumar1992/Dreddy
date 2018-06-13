package com.appfone.dreddy.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.dreddy.Dao.AdminquotesDao;
import com.appfone.dreddy.pojo.Dreddyquotes;

@Repository
public class AdminquotesDaoimpl implements AdminquotesDao{

	@Autowired
	private SessionFactory factory ;
	@Override
	public List<Dreddyquotes> getallQuoteslist() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Dreddyquotes");
		List<Dreddyquotes>list = query.list();
	
		return list;
	}
	@Override
	public void saveQuotes(Dreddyquotes quotes) {
		Session session = factory.openSession();
		session.saveOrUpdate(quotes);
		
		
	}
	@Override
	public void deletequotes(int quotes_id) {
		Session session=factory.getCurrentSession();
		Query query = session.createQuery("delete from Dreddyquotes where  quotes_id =:qid");
		query.setParameter("qid", quotes_id);
		int res =query.executeUpdate();

	}

}
