package com.anamika.demo;

import java.util.concurrent.locks.StampedLock;

public class Main {

	public static void main(String[] args) {
		
		StampedLock stampedLock = new StampedLock();
		
		SharedResources resource1 = new SharedResources();
		
		Thread t1 = new Thread(()->{
			resource1.producer(stampedLock);
		});
		
		Thread t2 = new Thread(()->{
			resource1.producer(stampedLock);
		});
		
		SharedResources resource2 = new SharedResources();
				
		Thread t3 = new Thread(()->{
			resource1.consume(stampedLock);
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
