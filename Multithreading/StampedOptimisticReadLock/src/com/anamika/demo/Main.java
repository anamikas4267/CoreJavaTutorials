package com.anamika.demo;

import java.util.concurrent.locks.StampedLock;

public class Main {

	public static void main(String[] args) {
		
		SharedResources resource = new SharedResources();
		
		StampedLock lock = new StampedLock();
		
		Thread t1=new Thread(()->{
			resource.produce(lock);
		});
		
		Thread t2=new Thread(()->{
			resource.consume(lock);
		});
		
		t1.start();
		t2.start();
		
		
	}

}
