package com.cimr.demo.userInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cimr.demo.response.ResponseObject;
import com.cimr.demo.userInfo.model.VideoModel;
import com.cimr.demo.userInfo.service.DanmuVideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="视频相关操作",tags= {"视频"})
@RestController
@RequestMapping("/weixin/video")
public class DanmuVideoController {

	@Autowired
	private DanmuVideoService danmuVideoService;
	
	
	@ApiOperation(value = "保存视频信息", notes = ""			
			)	  
//	@ApiImplicitParams({ 
//		@ApiImplicitParam(paramType = "query", dataType = "String", name = "projectId", value = "信息id", required = true) }
//	) 
	@RequestMapping(value="/normal",method=RequestMethod.POST)
	public ResponseObject saveVideo(@RequestBody VideoModel video) {
		ResponseObject rb = new ResponseObject();
		
		VideoModel v = danmuVideoService.saveVideo(video);
		if(v!=null) {
//			rb.setData(v);
			rb.setCode(0);
			rb.setSuccess(true);
		}else {
			rb.setCode(-1);
			rb.setSuccess(false);
		}
		return rb;
	}
}
