package com.appfone.dreddy.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dreddyfeedback")
public class Dreddyfeedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feed_id")
	private int feed_id;
	@Column(name="feedperson_name")
	private String feedperson_name;
	
	@Column(name="feedperson_email")
	private String feedperson_email;
	@Column(name="feedperson_phone")
	private String feedperson_phone;
	
	@Column(name="feedperson_msg")
	private String feedperson_msg;
	
	@Column(name="feeddisplay_status")
	private int feeddisplay_status;
	
	public int getFeed_id() {
		return feed_id;
	}

	public void setFeed_id(int feed_id) {
		this.feed_id = feed_id;
	}

	public String getFeedperson_name() {
		return feedperson_name;
	}

	public void setFeedperson_name(String feedperson_name) {
		this.feedperson_name = feedperson_name;
	}

	public String getFeedperson_phone() {
		return feedperson_phone;
	}

	public void setFeedperson_phone(String feedperson_phone) {
		this.feedperson_phone = feedperson_phone;
	}

	public String getFeedperson_msg() {
		return feedperson_msg;
	}

	public void setFeedperson_msg(String feedperson_msg) {
		this.feedperson_msg = feedperson_msg;
	}

	public String getFeedperson_email() {
		return feedperson_email;
	}

	public void setFeedperson_email(String feedperson_email) {
		this.feedperson_email = feedperson_email;
	}

	public int getFeeddisplay_status() {
		return feeddisplay_status;
	}

	public void setFeeddisplay_status(int feeddisplay_status) {
		this.feeddisplay_status = feeddisplay_status;
	}
	
	

}
