package com.zensar.spring.performers;

/*
 * Author: Swapnil Shrivastava
 * Creation Date: 27th Jul'19 04:50 PM
 * Modified Date: 27th Jul'19 04:50 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: More skilled juggler who juggles while reciting a poem.
 * Poem is injected into PoeticJuggler using Constructor Injection 
 */
import com.zensar.spring.poems.Poem;
//Dependent Object Class
public class PoeticJuggler extends Juggler {

	//Dependency object reference10
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No-Arg Constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("param constructor of Poeticjuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem....");
		poem.recite();
	}
}
