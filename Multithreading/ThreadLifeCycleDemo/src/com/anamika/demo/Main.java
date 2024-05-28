package com.anamika.demo;

public class Main {

	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource();
		
		Thread producerThread = new Thread(new ProduceTask(sharedResource)); 
		Thread consumerThread = new Thread(new ConsumerTask(sharedResource));
		
		producerThread.start();
		consumerThread.start();
	}

}
