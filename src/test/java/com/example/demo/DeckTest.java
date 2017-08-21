package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.models.Deck;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeckTest {

	@Test
	public void contextLoads() {
		
		Deck deck = new Deck();
	}

}
