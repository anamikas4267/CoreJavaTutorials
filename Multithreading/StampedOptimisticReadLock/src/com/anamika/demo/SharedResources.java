package com.anamika.demo;

import java.util.concurrent.locks.StampedLock;

public class SharedResources {
	
	int a=10;
	
	// note: stamped optimistic read lock does not put any lock, so no need of unlocking
	public void produce(StampedLock lock) {
		long stamp = lock.tryOptimisticRead();
		try {
			System.out.println("Optimistic Read Lock acquired by "+Thread.currentThread().getName());
			a=11;
			Thread.sleep(6000);
			if(lock.validate(stamp)) {
				System.out.println("Updated successfully");
			}else {
				a=10;
				System.out.println("Rollback");
			}
		}catch(Exception e) {}
		
	}
	
	// note: stampedlock does not put any lock
	public void consume(StampedLock lock) {
		long stamp = lock.writeLock();
		try {
			System.out.println("Write Lock acquired by "+Thread.currentThread().getName());
			a=9;
		}catch(Exception e) {}
		finally {
			lock.unlockWrite(stamp);
			System.out.println("Write Lock released by "+ Thread.currentThread().getName());
		}
	}

}
