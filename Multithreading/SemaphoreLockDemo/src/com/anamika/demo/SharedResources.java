package com.anamika.demo;

import java.util.concurrent.Semaphore;

public class SharedResources {
	
	boolean isAvailable = false;
	
	public void produce(Semaphore lock) {
		try {
			lock.acquire();
			System.out.println("Lock acquired by "+ Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(6000);
		}catch(Exception e) { }
		finally {
			lock.release();
			System.out.println("Lock released by "+ Thread.currentThread().getName());
		}
	}

}
