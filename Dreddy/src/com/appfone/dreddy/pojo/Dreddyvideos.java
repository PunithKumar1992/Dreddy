package com.appfone.dreddy.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dreddyvideos")
public class Dreddyvideos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="video_id")
	private int video_id;
	
	@Column(name="video_path")
	private String video_path;

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public String getVideo_path() {
		return video_path;
	}

	public void setVideo_path(String video_path) {
		this.video_path = video_path;
	}
	
	
	
}
