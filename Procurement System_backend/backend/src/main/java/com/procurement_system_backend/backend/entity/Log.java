package com.procurement_system_backend.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Nihara
 *
 */
@Document(collection="Log")
public class Log {

	@Id
	private String _id;
	private String logID;
	private String logDetail;
	private String dateTime;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getLogID() {
		return logID;
	}
	public void setLogID(String logID) {
		this.logID = logID;
	}
	public String getLogDetail() {
		return logDetail;
	}
	public void setLogDetail(String logDetail) {
		this.logDetail = logDetail;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Log(String _id, String logID, String logDetail, String dateTime) {
		super();
		this._id = _id;
		this.logID = logID;
		this.logDetail = logDetail;
		this.dateTime = dateTime;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
