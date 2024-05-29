package com.anamika.demo;

public class Main {
	
	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource();
		
		System.out.println("Main thread started");
		
		Thread t1 = new Thread(()-> {
			System.out.println("t1 is calling produce method");
			sharedResource.produce();
		});
		
		t1.setDaemon(true);
		t1.start();
		
		
		System.out.println("Main thread finished");
		
		
	}

}
