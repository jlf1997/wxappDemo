package com.cimr.demo.userInfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/weixin")
public class DemoController {

	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public void getSessionId(HttpServletRequest request1){
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
	    ServletRequestAttributes sra = (ServletRequestAttributes) ra;
	    HttpServletRequest request = sra.getRequest();
		HttpSession session = request.getSession();  
		String sessionId = session.getId(); 
		System.out.println(sessionId);
		
//		System.out.println(request1.getSession());
	}
}
