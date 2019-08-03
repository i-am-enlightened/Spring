package com.zensar.spring;

import org.springframework.stereotype.Component;

//@Component //bean-id class name in camelcase
@Component("fest")
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
