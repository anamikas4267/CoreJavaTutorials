package com.anamika.demo;

public class SharedResource {
	
	boolean isItemPresent = false;
	
	public synchronized void addItem() {
		System.out.println("producer thread inside addItem");
		isItemPresent = true;
		System.out.println("producer thread calling notify method");
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		System.out.println("consumer thread inside consumeItem");
		if(!isItemPresent) {
			try {
				System.out.println("consumer thread is waiting");	
			wait();
			}catch(Exception e) {}
		}
		isItemPresent = false;
		System.out.println("consumer thread completed");
	}

}
