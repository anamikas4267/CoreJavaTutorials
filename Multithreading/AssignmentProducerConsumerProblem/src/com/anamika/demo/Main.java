package com.anamika.demo;

public class Main {

	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource(3);
		
		Thread producerThread = new Thread(()->{
			for(int i=1;i<=6;i++) {
				sharedResource.produceItem(i);
			}
		});
		
		Thread consumerThread = new Thread(()->{
			for(int i=1;i<=6;i++) {
			sharedResource.consumeItem();
			}
		});
		
		producerThread.start();
		consumerThread.start();

	}

}
