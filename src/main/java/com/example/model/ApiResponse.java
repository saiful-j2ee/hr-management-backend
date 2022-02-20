package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class ApiResponse {
	String msg = "empty msg";
	Map<String, Object> data = new HashMap<String,Object>();
	Status status = Status.failed;
	public String getMsg() {
		return msg;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public Status getStatus() {
		return status;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	public ApiResponse() {
		
	}
	public ApiResponse(String msg, Map<String, Object> data, Status status) {
		super();
		this.msg = msg;
		this.data = data;
		this.status = status;
	}
	
	
	
	
}
