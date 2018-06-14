package com.cimr.demo.userInfo.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import com.cimr.boot.jpafinder.Finder;
import com.cimr.demo.userInfo.jpa.UserWeixinInfoJpa;
import com.cimr.demo.userInfo.model.UserWeixinInfo;

@Service
public class UserInfoService extends Finder<UserWeixinInfo,Long>{
	
	
	@Autowired
	private UserWeixinInfoJpa userWeixinInfoJpa;

	@Override
	public JpaSpecificationExecutor<UserWeixinInfo> specjpa() {
		// TODO Auto-generated method stub
		return userWeixinInfoJpa;
	}

	@Override
	public JpaRepository<UserWeixinInfo, Long> jpa() {
		// TODO Auto-generated method stub
		return userWeixinInfoJpa;
	}

	@Override
	public void addWhere(UserWeixinInfo[] t, List<Predicate> predicates, Root<UserWeixinInfo> root,
			CriteriaQuery<?> query, CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelect(UserWeixinInfo t) {
		// TODO Auto-generated method stub
		
	}

}
