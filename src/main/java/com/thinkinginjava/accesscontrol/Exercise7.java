package com.thinkinginjava.accesscontrol;

/*
 * Exercise 7: (1) Create the library according to the code fragments describing access and Widget. 
 * Create a Widget in a class that is not part of the access package.
 */
public class Exercise7 {

	public Exercise7() {
		// TODO Auto-generated constructor stub
		System.out.println("Exercise 7 Construct");
	}
}

// package access - Widget can be get in other class
class Widget{
	
	public Widget() {
		// TODO Auto-generated constructor stub
		System.out.println("Exercise7 Widget Construct");
	}
}