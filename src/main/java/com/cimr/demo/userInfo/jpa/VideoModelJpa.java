package com.cimr.demo.userInfo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cimr.demo.userInfo.model.VideoModel;

public interface VideoModelJpa extends JpaRepository<VideoModel, Long>,JpaSpecificationExecutor<VideoModel>{

}
