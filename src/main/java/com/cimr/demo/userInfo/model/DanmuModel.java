package com.cimr.demo.userInfo.model;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class DanmuModel {
	@Id
	@GeneratedValue
	private Long id;
	
	private Long time;
	
	private String content;
	
	private Integer color;
	
	@ManyToOne
	@JoinColumn(name = "video_id",referencedColumnName = "id",foreignKey = @javax.persistence.ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
	private VideoModel videoModel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public VideoModel getVideoModel() {
		return videoModel;
	}

	public void setVideoModel(VideoModel videoModel) {
		this.videoModel = videoModel;
	}
	
	
	
	
}
