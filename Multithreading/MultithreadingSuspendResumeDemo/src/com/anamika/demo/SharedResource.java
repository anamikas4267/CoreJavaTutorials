package com.anamika.demo;

public class SharedResource {
	
	boolean isAvailable = false;
	
	public synchronized void produce() {
		
		System.out.println(" acquired lock");
		isAvailable = true;
		
		try {
			Thread.sleep(8000);
		} catch (Exception e) {
			
		}
		
		System.out.println(" releases lock");
	}

}
