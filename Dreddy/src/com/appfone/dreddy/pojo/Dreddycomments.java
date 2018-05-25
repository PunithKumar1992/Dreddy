package com.appfone.dreddy.pojo;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dreddycomments")
public class Dreddycomments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commenter_id")
	private int commenter_id;
	@Column(name="commenter_name")
	private String commenter_name;
	@Column(name="commenter_email")
	private String commenter_email;
	@Column(name="commenter_msg")
	private String commenter_msg;
	
	@Column(name="article_id")
	private int article_id;
	
	@ManyToOne
	@JoinColumn(name="article_id",insertable=false, updatable=false)
	private Dreddyarticle article;
	
	@OneToMany(mappedBy="comment",cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
	private List<Dreddyreply>replay=new ArrayList<Dreddyreply>();

	public int getCommenter_id() {
		return commenter_id;
	}

	public void setCommenter_id(int commenter_id) {
		this.commenter_id = commenter_id;
	}

	public String getCommenter_name() {
		return commenter_name;
	}

	public void setCommenter_name(String commenter_name) {
		this.commenter_name = commenter_name;
	}

	public String getCommenter_email() {
		return commenter_email;
	}

	public void setCommenter_email(String commenter_email) {
		this.commenter_email = commenter_email;
	}

	public String getCommenter_msg() {
		return commenter_msg;
	}

	public void setCommenter_msg(String commenter_msg) {
		this.commenter_msg = commenter_msg;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public Dreddyarticle getArticle() {
		return article;
	}

	public void setArticle(Dreddyarticle article) {
		this.article = article;
	}

	public List<Dreddyreply> getReplay() {
		return replay;
	}

	public void setReplay(List<Dreddyreply> replay) {
		this.replay = replay;
	}
	
	

	
	
}
