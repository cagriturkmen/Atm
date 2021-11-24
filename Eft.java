package com.atm2;

public class Eft extends CommonProperty {
	
	private String eftName;
	private String eftMount;
	
	// Parametresiz constructor
	public Eft() {
		
	}
	
	// Parametreli constructor
	public Eft(String id, String eftName, String eftAmount) {
		super(id);
		this.eftName = eftName;
		this.eftMount = eftAmount;
	}
	
	@Override
	public String toString() {
		return "Eft [eftName=" + eftName + ", eftMount=" + eftMount + ", getId()=" + getId() + ", getDate()="
				+ getDate() + "]";
	}
	
	public String getEftName() {
		return eftName;
	}
	
	public void setEftName(String eftName) {
		this.eftName = eftName;
	}
	
	public String getEftMount() {
		return eftMount;
	}
	
	public void setEftMount(String eftMount) {
		this.eftMount = eftMount;
	}
	
}
