package com.atm2;

// Enum sabit bileşenlerdir
// constructer private olmalı
// set ile ilgili metodum olmasın

public enum MoneyCurrency {
	TL(1, "türkLirası"), USD(2, "amerikanDoları"), EUR(3, "Euro");
	
	private final int number;
	private final String curr;
	
	// constructer private oldu
	private MoneyCurrency(int number, String curr) {
		this.number = number;
		this.curr = curr;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getCurr() {
		return curr;
	}
	
}
