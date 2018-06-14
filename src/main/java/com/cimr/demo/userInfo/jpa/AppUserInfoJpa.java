package com.cimr.demo.userInfo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cimr.demo.userInfo.model.AppUserInfo;

public interface AppUserInfoJpa extends JpaRepository<AppUserInfo, Long>,JpaSpecificationExecutor<AppUserInfo>{

}
