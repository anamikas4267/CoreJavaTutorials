package com.anamika.demo;

public class Main {
	
	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource();
		
		System.out.println("Main thread started");
		
		Thread t1 = new Thread(()-> {
			System.out.println("t1 is calling produce method");
			sharedResource.produce();
		});
		
		t1.start();
		
		try {
			System.out.println("Main thread waiting for thread t1 to finish");
			t1.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("Main thread finished");
		
		
	}

}
