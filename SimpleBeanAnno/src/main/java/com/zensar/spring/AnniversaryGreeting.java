package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("annie")
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Anniversary Greeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}

}
