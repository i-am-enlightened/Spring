package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {

	private final static String LINES[]= {
			"Twinkle Twinkle Little Star",
			"How I Wonder What You Are",
			"Up Above The World So High",
			"Like A Diamond In The Sky"
	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for(String line: LINES) 
			System.out.println(line);
	}

}
