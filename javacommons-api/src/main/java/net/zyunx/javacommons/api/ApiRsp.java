/* 
 * ApiRsp.java
 * javacommmons-api  Copyright (C) 2017  张云
 * This program comes with ABSOLUTELY NO WARRANTY.
 * This is free software, and you are welcome to redistribute it
 * under certain conditions; see LICENCE for details.
 */
package net.zyunx.javacommons.api;

/**
 * API response object
 * @author zyunx 201700801
 *
 */
public class ApiRsp<T> {
	
	private String code;
	
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
