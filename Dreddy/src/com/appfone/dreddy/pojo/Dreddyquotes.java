package com.appfone.dreddy.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="dreddyquotes")
public class Dreddyquotes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="quotes_id")
	private int quotes_id;
	
	@Column(name="quotes_image")
	private String quotes_image;
	@Column(name="quotes_msg")
	private String quotes_msg;
	
	@Transient
	private MultipartFile quotesfile;

	public int getQuotes_id() {
		return quotes_id;
	}

	public void setQuotes_id(int quotes_id) {
		this.quotes_id = quotes_id;
	}

	public String getQuotes_image() {
		return quotes_image;
	}

	public void setQuotes_image(String quotes_image) {
		this.quotes_image = quotes_image;
	}

	public String getQuotes_msg() {
		return quotes_msg;
	}

	public void setQuotes_msg(String quotes_msg) {
		this.quotes_msg = quotes_msg;
	}

	public MultipartFile getQuotesfile() {
		return quotesfile;
	}

	public void setQuotesfile(MultipartFile quotesfile) {
		this.quotesfile = quotesfile;
	}

	@Override
	public String toString() {
		return "Dreddyquotes [quotes_id=" + quotes_id + ", quotes_image=" + quotes_image + ", quotes_msg=" + quotes_msg
				+ ", quotesfile=" + quotesfile + "]";
	}
	
	

}
