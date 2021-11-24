package com.atm2;

import java.util.Date;

public class CommonProperty {
	
	private String id;
	private Date date;
	
	public CommonProperty() {
		// Date'i burada set ettik.
		this.date = new Date(System.currentTimeMillis());
	}
	
	// Aşağıdaki parametreli constructor da date de vardı . Ama bi değiştirilmesin
	// istediğimiz (ulaşılamasın) için kaldırdık.
	public CommonProperty(String id) {
		
		this.id = id;
		
	}
	
	@Override
	public String toString() {
		return "CommonProperty [id=" + id + ", date=" + date + "]";
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
}
