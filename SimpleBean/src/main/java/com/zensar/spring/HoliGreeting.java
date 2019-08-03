package com.zensar.spring;

/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 12:51 PM
 * Modified Date: 27th Jul'19 12:51 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is specialized greeting used to greet anybody on occasion of great Indian festival of Holi
 */

public class HoliGreeting implements Greeting {

	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("HoliGreeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi. May your life is full of colors!";
	}

}
