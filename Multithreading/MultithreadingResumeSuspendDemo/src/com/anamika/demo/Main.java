package com.anamika.demo;

public class Main {
	
	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource();
		
		Thread t1 = new Thread(()-> {
			System.out.println("t1 is calling produce method");
			sharedResource.produce();
		});
		
		Thread t2 = new Thread(()-> {
			System.out.println("t2 is calling produce method");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			sharedResource.produce();
		});
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
		t1.suspend();
		
		System.out.println("Main thread finished");
		
		t1.resume();
	}

}
