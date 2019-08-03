package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
        //Greeting greet= ctx.getBean("festivalGreeting",Greeting.class);
        Greeting greet= ctx.getBean("fest",Greeting.class);
		System.out.println(greet.sayGreet());
    }
}