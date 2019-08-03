package com.zensar.spring.performers;
/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 04:18 PM
 * Modified Date: 27th Jul'19 04:18 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is represents a performer Juggler of Zensar Idol Competition.
 * 				 Juggler gets bean bags using constructor injection
 */

public class Juggler implements Performer {
	
	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor of Juggler");
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("param costructor of Juggler");
	}

	//business logic method of Performer
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling "+beanBags);
	}

}
