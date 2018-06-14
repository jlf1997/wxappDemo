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
import com.cimr.demo.userInfo.jpa.DanmuModelJpa;
import com.cimr.demo.userInfo.model.DanmuModel;

@Repository
public class DanmuDao extends Finder<DanmuModel,Long>{
	
	@Autowired
	private DanmuModelJpa danmuModelJpa;

	@Override
	public JpaSpecificationExecutor<DanmuModel> specjpa() {
		// TODO Auto-generated method stub
		return danmuModelJpa;
	}

	@Override
	public JpaRepository<DanmuModel, Long> jpa() {
		// TODO Auto-generated method stub
		return danmuModelJpa;
	}

	@Override
	public void addWhere(DanmuModel[] t, List<Predicate> predicates, Root<DanmuModel> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelect(DanmuModel t) {
		// TODO Auto-generated method stub
		
	}

	

}
