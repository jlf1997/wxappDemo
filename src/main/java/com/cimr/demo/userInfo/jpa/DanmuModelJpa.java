package com.cimr.demo.userInfo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cimr.demo.userInfo.model.DanmuModel;

public interface DanmuModelJpa extends JpaRepository<DanmuModel, Long>,JpaSpecificationExecutor<DanmuModel>{

}
