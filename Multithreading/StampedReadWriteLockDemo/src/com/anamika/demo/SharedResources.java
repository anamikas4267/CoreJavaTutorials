package com.anamika.demo;

import java.util.concurrent.locks.StampedLock;

public class SharedResources {
	
	boolean isAvailable = false;
	
	public void producer(StampedLock lock) {
		long stamp = lock.readLock();
		try {
			System.out.println("Stamped Read Lock acquired by "+ Thread.currentThread().getName());
			Thread.sleep(4000);
		}catch(Exception e) { }
		finally {
			lock.unlockRead(stamp);
			System.out.println("Stamped Read Lock released by "+ Thread.currentThread().getName());
		}
	}
	
	public void consume(StampedLock lock) {
		long stamp = lock.writeLock();
		try {
			isAvailable = true;
			System.out.println("Stamped Write Lock acquired by "+ Thread.currentThread().getName());
			Thread.sleep(4000);
		}catch(Exception e) { }
		finally {
			lock.unlockWrite(stamp);
			System.out.println("Stamped Write Lock released by "+ Thread.currentThread().getName());
		}
	}

}
