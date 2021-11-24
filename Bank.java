package com.atm2;

import java.util.ArrayList;
import java.util.List;

// Özellikler
// parametresiz
// parametreli
// toString
// method
// getter and setter
public class Bank {
	
	// özellikler
	protected String bankName;
	protected String bankCityName;
	protected String bankLogo;
	
	protected List<Eft> bankEftSerial;
	protected List<Havale> bankHavaleSerial;
	
	// composition
	protected List<MoneyWallet> moneyList;
	
	// parametresiz
	public Bank() {
		
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale seri14", "5000"));
		bankHavaleSerial.add(new Havale("2", "havale seri15", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale seri16", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale seri17", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft1 seri140", "2000"));
		bankEftSerial.add(new Eft("2", "eft1 seri141", "3000"));
		bankEftSerial.add(new Eft("3", "eft1 seri142", "4000"));
		bankEftSerial.add(new Eft("4", "eft1 seri143", "5000"));
		
	}
	
	// parametreli
	public Bank(String str, String bankName, String bankCityName, String bankLogo) {
		super();
		this.bankName = bankName;
		this.bankCityName = bankCityName;
		this.bankLogo = bankLogo;
	}
	
	// getter and setter
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCityName() {
		return bankCityName;
	}
	
	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}
	
	public String getBankLogo() {
		return bankLogo;
	}
	
	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}
	
	public List<Eft> getBankEftSerial() {
		return bankEftSerial;
	}
	
	public void setBankEftSerial(List<Eft> bankEftSerial) {
		this.bankEftSerial = bankEftSerial;
	}
	
	public List<Havale> getBankHavaleSerial() {
		return bankHavaleSerial;
	}
	
	public void setBankHavaleSerial(List<Havale> bankHavaleSerial) {
		this.bankHavaleSerial = bankHavaleSerial;
	}
	
	public List<MoneyWallet> getMoneyList() {
		return moneyList;
	}
	
	public void setMoneyList(List<MoneyWallet> moneyList) {
		this.moneyList = moneyList;
	}
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCityName=" + bankCityName + ", bankLogo=" + bankLogo + "]";
	}
	
}
