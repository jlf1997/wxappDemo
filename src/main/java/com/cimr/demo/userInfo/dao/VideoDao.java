package com.cimr.demo.userInfo.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.cimr.boot.jpafinder.Finder;
import com.cimr.demo.userInfo.jpa.VideoModelJpa;
import com.cimr.demo.userInfo.model.VideoModel;

@Repository
public class VideoDao extends Finder<VideoModel,Long>{
	
	@Autowired
	private VideoModelJpa videoModelJpa;

	@Override
	public JpaSpecificationExecutor<VideoModel> specjpa() {
		// TODO Auto-generated method stub
		return videoModelJpa;
	}

	@Override
	public JpaRepository<VideoModel, Long> jpa() {
		// TODO Auto-generated method stub
		return videoModelJpa;
	}

	@Override
	public void addWhere(VideoModel[] t, List<Predicate> predicates, Root<VideoModel> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelect(VideoModel t) {
		// TODO Auto-generated method stub
		
	}

}
