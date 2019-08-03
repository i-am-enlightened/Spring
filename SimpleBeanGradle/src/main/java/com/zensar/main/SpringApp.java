package com.zensar.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.simple.Greeting;

public class SpringApp {

	public static void main(String[] args) {
		//To create a Spring IoC Container object
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml"); 
		Greeting greet= ctx.getBean("bean1",Greeting.class);
		System.out.println(greet.sayGreet());
		
	}

}
