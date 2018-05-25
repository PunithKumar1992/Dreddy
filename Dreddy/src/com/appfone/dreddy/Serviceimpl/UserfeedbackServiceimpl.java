package com.appfone.dreddy.Serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.dreddy.Dao.UserfeedbackDao;
import com.appfone.dreddy.Service.UserfeedbackService;
import com.appfone.dreddy.pojo.Dreddyfeedback;

@Service
public class UserfeedbackServiceimpl implements UserfeedbackService {

	@Autowired
	private UserfeedbackDao feedbackdao;
	@Override
	@Transactional
	public void saveUserfeedback(Dreddyfeedback feedback) {
		feedbackdao.saveUserfeedback(feedback);
		

	}
	@Override
	@Transactional
	public List<Dreddyfeedback> getUserfeedlist() {
		List<Dreddyfeedback>list = feedbackdao.getUserfeedlist();
		return list;
	}
	@Override
	@Transactional
	public void deletefeedback(int feed_id) {
		feedbackdao.deletefeedback(feed_id);
		
		
	}
	@Override
	@Transactional
	public Dreddyfeedback getsinglefeedback(int feed_id) {
		Dreddyfeedback feedback = feedbackdao.getsinglefeedback(feed_id);
		return feedback;
	}
	@Override
	@Transactional
	public void update_feedback(Dreddyfeedback feedback) {
		feedbackdao.update_feedback(feedback);
		
	}

}
