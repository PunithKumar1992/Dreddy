package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.AdminquotesDao;
import com.appfone.dreddy.Service.AdminquotesService;
import com.appfone.dreddy.pojo.Dreddyquotes;

@Service
public class AdminquotesServiceimpl implements AdminquotesService {

	@Autowired
	private AdminquotesDao quotedao;
	@Override
	public List<Dreddyquotes> getallQuoteslist() {
		List<Dreddyquotes>list = quotedao.getallQuoteslist();
		return list;
	}
	@Override
	@Transactional
	public void saveQuotes(Dreddyquotes quotes) {
		quotedao.saveQuotes(quotes);
		
	}
	@Override
	@Transactional
	public void deletequotes(int quotes_id) {
		quotedao.deletequotes(quotes_id);
		
	}

}
