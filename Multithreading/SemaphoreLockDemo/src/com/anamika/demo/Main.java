package com.anamika.demo;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		
		SharedResources resource = new SharedResources();
		Semaphore lock = new Semaphore(2);
		
		Thread t1 = new Thread(()->{
			resource.produce(lock);
		});
		
		Thread t2 = new Thread(()->{
			resource.produce(lock);
		});
		
		Thread t3 = new Thread(()->{
			resource.produce(lock);
		});
		
		Thread t4 = new Thread(()->{
			resource.produce(lock);
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}