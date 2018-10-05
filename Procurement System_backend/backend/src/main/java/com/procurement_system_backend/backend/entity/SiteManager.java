/**
 * Oct 7, 2018
 * 
 */
package com.procurement_system_backend.backend.entity;

/**
 * @author windula
 *
 */
public class SiteManager extends AuthorisedEmployee{
	
	private int managerID;

	/**
	 * @return the managerID
	 */
	public int getManagerID() {
		return managerID;
	}

	/**
	 * @param managerID the managerID to set
	 */
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	/**
	 * 
	 * 
	 */
	@Override
	public void addComment() {
	}

}
