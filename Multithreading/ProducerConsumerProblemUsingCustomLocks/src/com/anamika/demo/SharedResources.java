package com.anamika.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {
	
	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	
	public SharedResources(int size) {
		sharedBuffer = new LinkedList<Integer>();
		bufferSize  = size;
	}
	
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	public void produce(int item) {
		
		try {
		lock.lock();	
		System.out.println("Lock is acquired by "+ Thread.currentThread().getName());
		while(bufferSize == sharedBuffer.size()) {
			System.out.println("Buffer is full , produce thread needs to wait");
			condition.await();
		}
		sharedBuffer.add(item);
		condition.signal();
		System.out.println(item + " is added");
		}catch(Exception e) {}
		finally {
			lock.unlock();
			System.out.println("Lock is released by "+ Thread.currentThread().getName());
		}
		
	}
	
	public void consume() {
		try {
			lock.lock();
			System.out.println("Lock is acquired by "+ Thread.currentThread().getName());
			while(sharedBuffer.isEmpty()) {
				System.out.println("Buffer is empty, consumer thread needs to wait , nothing to consume");
				condition.await();
			}
			int item = sharedBuffer.poll();
			condition.signal();
			System.out.println(item + " is removed");
		}catch(Exception e) {}
		finally {
			lock.unlock();
			System.out.println("Lock is released by "+ Thread.currentThread().getName());
		}
	}

}
