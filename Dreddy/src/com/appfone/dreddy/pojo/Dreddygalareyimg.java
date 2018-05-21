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
@Table(name="dreddygalareyimg")
public class Dreddygalareyimg {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gallery_id")
	private int gallery_id;
	
	@Column(name="gallery_img")
	private String gallery_img;
	
	@Column(name="galleryimg_type")
	private String galleryimg_type;
	
	@Transient
	private MultipartFile galleryfile;

	public int getGallery_id() {
		return gallery_id;
	}

	public void setGallery_id(int gallery_id) {
		this.gallery_id = gallery_id;
	}

	public String getGallery_img() {
		return gallery_img;
	}

	public void setGallery_img(String gallery_img) {
		this.gallery_img = gallery_img;
	}

	public String getGalleryimg_type() {
		return galleryimg_type;
	}

	public void setGalleryimg_type(String galleryimg_type) {
		this.galleryimg_type = galleryimg_type;
	}

	public MultipartFile getGalleryfile() {
		return galleryfile;
	}

	public void setGalleryfile(MultipartFile galleryfile) {
		this.galleryfile = galleryfile;
	}
	
	
}
