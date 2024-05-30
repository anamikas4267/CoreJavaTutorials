package com.anamika.demo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String[] args) {
		
		
		ReadWriteLock lock = new ReentrantReadWriteLock();
		
		SharedResource resource = new SharedResource();
		
		Thread t1=new Thread(()->{
			resource.produce(lock);
		});
		
		
		Thread t2=new Thread(()->{
			resource.produce(lock);
		});
		
		
		
		Thread t3 = new Thread(()->{
			resource.consume(lock);
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
