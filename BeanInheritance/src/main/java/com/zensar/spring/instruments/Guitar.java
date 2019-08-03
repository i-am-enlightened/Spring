package com.zensar.spring.instruments;
/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 05:30 PM
 * Modified Date: 27th Jul'19 02:45 PM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent an instrument Guitar
 */
public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting ting ting....");
	}

	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is tuned");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is cleaned");
	}
	
}
