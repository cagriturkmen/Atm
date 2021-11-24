package com.atm2;

public interface IBankMethods {
	
	// para görüntüle
	
	public void showMoney();
	
	// para ekle
	public void addMoney();
	
	// para çekmek
	public void reduceMoney();
	
	// havale yapmak
	public void sendHavaleMoney();
	
	// eft Yapmak
	public void sendEtfMoney();
	
	// fake mail
	public void fakeMail(String emailAdress);
	
}
