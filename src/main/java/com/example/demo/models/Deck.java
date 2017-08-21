package com.example.demo.models;

import java.util.ArrayList;
import java.util.Collections;

import com.example.demo.models.Card;

public class Deck {
	
	ArrayList<Card> deck = new ArrayList<Card>();
	public Integer faceValue = null;
	public String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades"};
	public String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
								   "Jack", "Queen", "King", "Ace" };
	
	public Deck() {
		
		for (String s : suits) {
			for (String f : faces) {
				if (f.equals("Jack") || f.equals("Queen") || f.equals("King")) {
					faceValue = 10;
				} else if (f.equals("Ace")) {
					faceValue = 11;
				}	else {
					faceValue = Integer.parseInt(f);
				}
		
				Card card = new Card(s, f, faceValue);
				
				deck.add(card);				
			}
        }
	}		
	
	@Override
	public String toString() {
		return deck.toString();
	}
	
	public int getDeckSize() {
		return deck.size();
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public String drawACard() {
		Card drawnCard = deck.get(0);
		deck.remove(0);
		return drawnCard.toString();
	}
}