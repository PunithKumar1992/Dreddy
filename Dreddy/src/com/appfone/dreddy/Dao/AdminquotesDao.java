package com.appfone.dreddy.Dao;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyquotes;

public interface AdminquotesDao {
	
	public List<Dreddyquotes> getallQuoteslist();
	public void saveQuotes(Dreddyquotes quotes);
	public void deletequotes(int quotes_id);
}
