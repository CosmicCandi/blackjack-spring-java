package com.example.demo.models;

public class Card {
	String suit;
	String face;
	int faceValue;
		
	public Card (String suit, String face, int faceValue) {
		this.suit = suit;
		this.face = face;
		this.faceValue = faceValue;
	}
	
	public String getCardSuit() {
		return suit;
	}
	
	public String getCardFace() {
		return face;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	@Override 
	public String toString () {
		return getCardFace() + " of " + getCardSuit() ;
	}
}
	

