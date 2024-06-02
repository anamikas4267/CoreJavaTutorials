package com.anamika.demo;

public class Eagle implements Bird {
	
	@Override
	public void canFly(String val) {
		System.out.println(val);
		
	}

	public static void main(String[] args) {
		
		Bird bird = new Eagle();
		bird.canFly("I am an Eagle");

	}

	

}
