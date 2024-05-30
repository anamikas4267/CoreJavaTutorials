package com.anamika.demo;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	
	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	
	public SharedResource(int size) {
		sharedBuffer = new LinkedList<>();
		bufferSize = size;
	}
	
	public synchronized void produceItem(int item) {
		
		while(bufferSize == sharedBuffer.size()) {
			
			  System.out.println("Buffer is full,producer thread needs to wait");
			  
			  try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		sharedBuffer.add(item);
		notify();
		System.out.println(item + " is added");
	}
	
	public synchronized void consumeItem() {
		
		while(sharedBuffer.isEmpty()) {
			System.out.println("Buffer is empty, nothing to consume, consumer thread needs to be in waiting state");
			
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		int item = sharedBuffer.poll();
		notify();
		System.out.println(item + " is removed");
	}

}
