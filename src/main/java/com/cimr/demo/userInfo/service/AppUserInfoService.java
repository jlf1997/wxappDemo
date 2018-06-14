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
import com.cimr.demo.userInfo.jpa.AppUserInfoJpa;
import com.cimr.demo.userInfo.model.AppUserInfo;
@Service
public class AppUserInfoService extends Finder<AppUserInfo,Long>{
	
	@Autowired
	private AppUserInfoJpa appUserInfoJpa;

	@Override
	public JpaSpecificationExecutor<AppUserInfo> specjpa() {
		// TODO Auto-generated method stub
		return appUserInfoJpa;
	}

	@Override
	public JpaRepository<AppUserInfo, Long> jpa() {
		// TODO Auto-generated method stub
		return appUserInfoJpa;
	}

	@Override
	public void addWhere(AppUserInfo[] t, List<Predicate> predicates, Root<AppUserInfo> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelect(AppUserInfo t) {
		// TODO Auto-generated method stub
		
	}

}
