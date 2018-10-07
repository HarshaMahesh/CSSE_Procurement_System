/**
 * Oct 5, 2018
 * 
 */
package com.procurement_system_backend.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author windula
 *
 */
@Document
public class Users {
	
	@Id
	private String _id;
	public String username;
	public String password;
	
	
	
	
	
	/**
	 * @param username
	 * @param password
	 */
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
