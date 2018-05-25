package com.appfone.dreddy.Service;

import java.util.List;

import com.appfone.dreddy.pojo.Dreddyfeedback;

public interface UserfeedbackService {
	public void saveUserfeedback(Dreddyfeedback feedback);
	public List<Dreddyfeedback> getUserfeedlist();
	public void deletefeedback(int feed_id);
	public Dreddyfeedback getsinglefeedback(int feed_id);
	public void update_feedback(Dreddyfeedback feedback);


}
