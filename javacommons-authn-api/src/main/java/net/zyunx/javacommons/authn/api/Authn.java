/* 
 * Authn.java
 * javacommmons-authn  Copyright (C) 2017  张云
 * This program comes with ABSOLUTELY NO WARRANTY.
 * This is free software, and you are welcome to redistribute it
 * under certain conditions; see LICENCE for details.
 */
package net.zyunx.javacommons.authn.api;

import net.zyunx.javacommons.api.ApiReq;
import net.zyunx.javacommons.api.ApiRsp;

/**
 * 认证服务
 * 
 * @author zyunx 20170801
 *
 */
public interface Authn {

	public class AuthnReq extends ApiReq {
		private static final long serialVersionUID = 1L;
		
		private String userId;
		private String password;
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
	ApiRsp<Void> authn(AuthnReq authReq);
	
	
	public class CreateReq extends ApiReq {
		private static final long serialVersionUID = 1L;
		
		public String userId;
		public String password;
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
	ApiRsp<Void> create(CreateReq createReq);
	
	ApiRsp<Void> delete(String userId);
	ApiRsp<Void> lock(String userId);
	ApiRsp<Void> unlock(String userId);
}