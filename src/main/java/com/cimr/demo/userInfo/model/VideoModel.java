package com.cimr.demo.userInfo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class VideoModel {

	@Id
	@GeneratedValue
	private Long id;
	
	private String url;
	
	private String name;
	
	@OneToMany(mappedBy="videoModel")
	@org.hibernate.annotations.ForeignKey(name = "none")
	private List<DanmuModel> danmus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
