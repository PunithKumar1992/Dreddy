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
@Table(name="dreddybanner")
public class Dreddybanner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="banner_id")
	private int banner_id;
	
	@Column(name="banner_image")
	private String banner_image;
	
	@Transient
	private MultipartFile bannerfile;

	public int getBanner_id() {
		return banner_id;
	}

	public void setBanner_id(int banner_id) {
		this.banner_id = banner_id;
	}

	public String getBanner_image() {
		return banner_image;
	}

	public void setBanner_image(String banner_image) {
		this.banner_image = banner_image;
	}

	public MultipartFile getBannerfile() {
		return bannerfile;
	}

	public void setBannerfile(MultipartFile bannerfile) {
		this.bannerfile = bannerfile;
	}
	
	
	
	

}
