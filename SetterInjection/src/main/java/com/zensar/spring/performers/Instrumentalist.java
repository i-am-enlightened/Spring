package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 05:36 PM
 * Modified Date: 27th Jul'19 05:36 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent an Instrumentalist of Zensar Idol Competition
 */
public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	// for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}

	// for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	//business logic of Instrumentalist
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing "+song);
		instrument.play();
	}

}
