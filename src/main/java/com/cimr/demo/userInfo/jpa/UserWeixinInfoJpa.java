package com.cimr.demo.userInfo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cimr.demo.userInfo.model.UserWeixinInfo;


public interface UserWeixinInfoJpa extends JpaRepository<UserWeixinInfo, Long>,JpaSpecificationExecutor<UserWeixinInfo>{

}
