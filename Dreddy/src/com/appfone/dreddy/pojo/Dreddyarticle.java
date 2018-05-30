package com.appfone.dreddy.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="dreddyarticle")
public class Dreddyarticle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="article_id")
	private int article_id;
	
	@Column(name="article_caption")
	private String article_caption;
	
	@Column(name="article_brief")
	private String article_brief;
	
	@Column(name="article_image")
	private String article_image;
	
	@Column(name="article_gridimage")
	private String article_gridimage;
	
	@Column(name="article_detail")
	private String article_detail;
	
	@Column(name="article_by")
	private String article_by;
	
	@Column(name="article_date")
	private String article_date;
	
	@Transient
	MultipartFile articlefile ;
	
	@Transient
	MultipartFile articlegridfile;
	
	@Column(name="article_comments")
	private int article_comments;
	
	@OneToMany(mappedBy="article")
	 List<Dreddycomments>comments=new ArrayList<Dreddycomments>();
	

	public int getArticle_comments() {
		return article_comments;
	}

	public void setArticle_comments(int article_comments) {
		this.article_comments = article_comments;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public String getArticle_caption() {
		return article_caption;
	}

	public void setArticle_caption(String article_caption) {
		this.article_caption = article_caption;
	}

	public String getArticle_brief() {
		return article_brief;
	}

	public void setArticle_brief(String article_brief) {
		this.article_brief = article_brief;
	}

	public String getArticle_image() {
		return article_image;
	}

	public void setArticle_image(String article_image) {
		this.article_image = article_image;
	}

	public String getArticle_detail() {
		return article_detail;
	}

	public void setArticle_detail(String article_detail) {
		this.article_detail = article_detail;
	}

	public String getArticle_by() {
		return article_by;
	}

	public void setArticle_by(String article_by) {
		this.article_by = article_by;
	}

	public String getArticle_date() {
		return article_date;
	}

	public void setArticle_date(String article_date) {
		this.article_date = article_date;
	}

	public MultipartFile getArticlefile() {
		return articlefile;
	}

	public void setArticlefile(MultipartFile articlefile) {
		this.articlefile = articlefile;
	}

	public MultipartFile getArticlegridfile() {
		return articlegridfile;
	}

	public void setArticlegridfile(MultipartFile articlegridfile) {
		this.articlegridfile = articlegridfile;
	}

	public String getArticle_gridimage() {
		return article_gridimage;
	}

	public void setArticle_gridimage(String article_gridimage) {
		this.article_gridimage = article_gridimage;
	}

	public List<Dreddycomments> getComments() {
		return comments;
	}

	public void setComments(List<Dreddycomments> comments) {
		this.comments = comments;
	}
	
	
	
	
}
