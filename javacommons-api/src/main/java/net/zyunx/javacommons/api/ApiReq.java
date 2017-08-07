/* 
 * ApiReq.java
 * javacommmons-api  Copyright (C) 2017  张云
 * This program comes with ABSOLUTELY NO WARRANTY.
 * This is free software, and you are welcome to redistribute it
 * under certain conditions; see LICENCE for details.
 */
package net.zyunx.javacommons.api;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * API request object
 * @author zyunx 201700801
 *
 */
public class ApiReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
