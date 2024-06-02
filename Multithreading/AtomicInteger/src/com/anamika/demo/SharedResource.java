package com.anamika.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
	
	AtomicInteger counter = new AtomicInteger(0);
	
//	int counter;
	
	public void increment() {
		counter.incrementAndGet();
	}
	
	public int getCounter() {
		return counter.get();
	}

}
