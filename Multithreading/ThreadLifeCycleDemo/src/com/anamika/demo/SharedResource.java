package com.anamika.demo;

public class SharedResource {
	
	boolean isItemAvailable = false;
	
	public synchronized void produceItem() {
		System.out.println("Thread "+ Thread.currentThread().getName() + " is producing item..");
		isItemAvailable = true;
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		
		System.out.println("Thread "+ Thread.currentThread().getName() + " is consuming item..");
		while(!isItemAvailable) {
			System.out.println("Thread "+ Thread.currentThread().getName() + " is waiting");
			try {
				wait();
			} catch (Exception e) {
			
			}
		}
		isItemAvailable = false;
		System.out.println("Thread "+ Thread.currentThread().getName() + " is consumed.");
	}
}
