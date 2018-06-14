package com.cimr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cimr.boot.convert.EnableHttpConvert;
import com.cimr.boot.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableSwagger2Doc
@EnableHttpConvert
public class CimrWeixinAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CimrWeixinAppDemoApplication.class, args);
	}
}
