package com.sampath.api;

public class Response {
	
	private String user;
	private double payment;
	private boolean status;
	private String messaage;
	
	
	public Response(String user, double payment, boolean status, String messaage) {
		super();
		this.user = user;
		this.payment = payment;
		this.status = status;
		this.messaage = messaage;
	}
	
	public Response(boolean status, String messaage) {
		super();
		this.status = status;
		this.messaage = messaage;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessaage() {
		return messaage;
	}

	public void setMessaage(String messaage) {
		this.messaage = messaage;
	}
	
	
	
}
