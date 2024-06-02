package com.anamika.demo2;

@FunctionalInterface
public interface Bird {
	
	void canFly(String val);
	
	default void print() {
		System.out.println("I am a bird");
	}
	
	static void voice() {
		System.out.println("chirp chirp");
	}
	
	String toString();
}
