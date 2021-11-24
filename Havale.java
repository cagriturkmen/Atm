package com.atm2;

public class Havale extends CommonProperty {
	
	private String havaleSerial;
	private String havaleAmount;
	
	// Parametresiz constructor
	public Havale() {
		
	}
	
	// Parametreli constructor
	public Havale(String id, String havaleSerial, String havaleAmount) {
		super(id);
		this.havaleSerial = havaleSerial;
		this.havaleAmount = havaleAmount;
	}
	
	@Override
	public String toString() {
		return "Eft [eftName=" + havaleSerial + ", eftMount=" + havaleAmount + ", getId()=" + getId() + ", getDate()="
				+ getDate() + "]";
	}
	
	public String getEftName() {
		return havaleSerial;
	}
	
	public void setEftName(String eftName) {
		this.havaleSerial = eftName;
	}
	
	public String getEftMount() {
		return havaleAmount;
	}
	
	public void setEftMount(String eftMount) {
		this.havaleAmount = havaleAmount;
	}
	
}
