package com.procurement_system_backend.backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SiteManager")
public class SiteManager {
	
	private String employeeID;
	private String employeeName;
	private String siteName;
	private String address;
	private String email;
	private String phone;

	public SiteManager(String employeeID, String employeeName, String siteName, String address, String email, String phone) 
	{
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.siteName = siteName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getSiteName() {
		return siteName;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
}
