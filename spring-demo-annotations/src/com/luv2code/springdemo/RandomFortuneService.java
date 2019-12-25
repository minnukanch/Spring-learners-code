package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	// create an array if strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Deligence is the mother of good luck",
			"The jouney is the reward"
	};
	
	// create a random generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
	// pick a random string from the array
	int index = myRandom.nextInt(data.length);
	
		String theFortune = data[index];
		
		return theFortune;
	}

}
