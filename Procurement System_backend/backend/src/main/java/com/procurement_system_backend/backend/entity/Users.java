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
@Document(collection="User")
public class Users extends AuthorisedEmployeeFactory{
	
	@Id
	private String _id;
	private String username;
	private String password;
	private String role;
	
	
	
	
	public Users() {
		
	}
	
	/**
	 * @param username
	 * @param password
	 * @param role
	 */
	public Users(String username, String password, String role) {
		//super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
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
	
	/**
	 * @param type
	 * @return
	 * 
	 */
	@Override
	public AuthorisedEmployee getAuthorisedEmployee() {
		
		AuthorisedEmployee employee;
		
		String type=this.role;
		if(type.equalsIgnoreCase("SiteManager")) {
			
			employee=new SiteManager();
			return employee;
		}
		
		if(type.equalsIgnoreCase("Management")) {
			employee=new Management();
			return employee;
		}
		
		if(type.equalsIgnoreCase("SeniorMember")) {
			employee=new SeniorMember();
			return employee;
		}
		
		if(type.equalsIgnoreCase("ProcStaff")) {
			employee=new ProcurementDepartmentStaff();
			return employee;
		}
		
		return null;
		
	}
	
	

}
