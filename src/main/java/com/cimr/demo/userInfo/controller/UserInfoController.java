package com.cimr.demo.userInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cimr.demo.userInfo.model.AppUserInfo;
import com.cimr.demo.userInfo.model.UserWeixinInfo;
import com.cimr.demo.userInfo.service.AppUserInfoService;
import com.cimr.demo.userInfo.service.UserInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="设备相关操作",tags= {"signal"})
@RestController
@RequestMapping("/weixin/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private AppUserInfoService appUserInfoService;
	
	@ApiOperation(value = "保存微信信息", notes = ""			
			)	  
//	@ApiImplicitParams({ 
//		@ApiImplicitParam(paramType = "query", dataType = "String", name = "projectId", value = "信息id", required = true) }
//	) 
	@RequestMapping(value="/normal",method=RequestMethod.POST)
	public String findDevInfoById(@RequestBody UserWeixinInfo userWeixinInfo) {
		
		userInfoService.save(userWeixinInfo);
		return "success";
	}
	
	@ApiOperation(value = "根据openid查询微信信息", notes = ""			
			)	  
//	@ApiImplicitParams({ 
//		@ApiImplicitParam(paramType = "query", dataType = "String", name = "projectId", value = "信息id", required = true) }
//	) 
	@RequestMapping(value="/normal",method=RequestMethod.GET)
	public UserWeixinInfo findByOpenId(@RequestParam String openid) {
		UserWeixinInfo userWeixinInfo = new UserWeixinInfo();
		userWeixinInfo.setOpenid(openid);
		UserWeixinInfo result = userInfoService.find(userWeixinInfo);
		return result;
	}
	
	
	@ApiOperation(value = "关联phone 与 openid", notes = ""			
			)	  
	@RequestMapping(value="/associate",method=RequestMethod.POST)
	public String assocationUser(@RequestParam("phone") String phone,@RequestParam("openid")String openid) {
	
		AppUserInfo t = new AppUserInfo();
		t.setPhone(phone);
		AppUserInfo info = appUserInfoService.find(t);
		if(info==null) {
			return "号码不存在";
		}
		UserWeixinInfo userWeixinInfo = new UserWeixinInfo();
		userWeixinInfo.setOpenid(openid);
		UserWeixinInfo out = userInfoService.find(userWeixinInfo);
		if(out==null) {
			out = new UserWeixinInfo();
			out.setOpenid(openid);
		}
		out.setAppUserInfo(info);
		userInfoService.save(out);
		return "success";
	}
}
