package com.procurement_system_backend.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Policy")
public class Policy {

	@Id
	private String policyID;
	private String description;
	
	public String getPolicyID()
	{
		return policyID;
	}
	public void setPolicyID(String policyID) 
	{
		this.policyID = policyID;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public Policy(String policyID, String description) {
		super();
		this.policyID = policyID;
		this.description = description;
	}
	public Policy() {
		super();
	}
	
	
	
	
	
}
