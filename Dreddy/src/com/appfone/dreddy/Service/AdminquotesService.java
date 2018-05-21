package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyquotes;

public interface AdminquotesService {
	
	public List<Dreddyquotes> getallQuoteslist();
	public void saveQuotes(Dreddyquotes quotes);
	public void deletequotes(int quotes_id);

}
