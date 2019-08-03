package com.zensar.spring;

/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 12:51 PM
 * Modified Date: 27th Jul'19 12:51 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is specialized greeting used to greet anybody on his/her birthday
 */

public class BirthdayGreeting implements Greeting {

	public BirthdayGreeting() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("BirthdayGreeting created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Wish you a very Happy Birthday!";
	}

}
