package com.example.demo;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Deck;
import com.example.demo.models.Card;

@SpringBootApplication
public class BlackjackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackjackApplication.class, args);
		
		Card card = new Card("Clubs", "Jack", 10);
		System.out.println("You have a " + card.getCardFace() + " of " + card.getCardSuit() +". It's value is: " + card.getFaceValue());
		System.out.println(card.getCardFace() + " of " + card.getCardSuit());
		
		Deck deck = new Deck();
		System.out.println(deck.toString());
		System.out.println(deck.getDeckSize());
		
		deck.shuffle();
		System.out.println(deck.toString());
		
		System.out.println(deck.drawACard());
		
		System.out.println(deck.getDeckSize());
		System.out.println(deck.toString());
		System.out.println(deck.drawACard());
		
		
	}
}
