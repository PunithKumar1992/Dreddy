package com.appfone.dreddy.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dreddyreplay")
public class Dreddyreply {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reply_id")
	private int reply_id;
	
	@Column(name="replyer_name")
	private String replyer_name;
	
	@Column(name="replyer_email")
	private String replyer_email;
	
	public String getReplyer_email() {
		return replyer_email;
	}
	public void setReplyer_email(String replyer_email) {
		this.replyer_email = replyer_email;
	}
	@Column(name="replyer_msg")
	private String replyer_msg;
	
	@Column(name="article_id")
	private int article_id;
	@Column(name="comment_id")
	private int comment_id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="comment_id",insertable=false, updatable=false)
	private Dreddycomments comment;
	
	public int getReply_id() {
		return reply_id;
	}
	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}
	public String getReplyer_name() {
		return replyer_name;
	}
	public void setReplyer_name(String replyer_name) {
		this.replyer_name = replyer_name;
	}
	public String getReplyer_msg() {
		return replyer_msg;
	}
	public void setReplyer_msg(String replyer_msg) {
		this.replyer_msg = replyer_msg;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public Dreddycomments getComment() {
		return comment;
	}
	public void setComment(Dreddycomments comment) {
		this.comment = comment;
	}
	
	

}
