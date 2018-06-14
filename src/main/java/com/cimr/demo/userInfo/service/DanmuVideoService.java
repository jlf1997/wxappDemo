package com.cimr.demo.userInfo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cimr.demo.userInfo.dao.DanmuDao;
import com.cimr.demo.userInfo.dao.VideoDao;
import com.cimr.demo.userInfo.model.VideoModel;


@Service
public class DanmuVideoService {

	@Autowired
	private DanmuDao danmuDao;
	
	@Autowired
	private VideoDao videoDao;

	
	@Transactional
	public VideoModel saveVideo(VideoModel video) {
		return videoDao.save(video);
	}
	
	
}
