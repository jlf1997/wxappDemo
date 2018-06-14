package com.cimr.demo.response;

public class ResponseObject {

	private Object data;
	
	private String msg;
	
	private Integer code;
	
	private Boolean success;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	



	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
		if(success) {
			this.msg = "success";
		}else {
			this.msg = "faild";
		}
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
