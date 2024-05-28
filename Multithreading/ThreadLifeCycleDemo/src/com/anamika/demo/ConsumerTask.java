package com.anamika.demo;

public class ConsumerTask implements Runnable {
	
	SharedResource sharedResource;
	
	public ConsumerTask(SharedResource resource) {
		this.sharedResource = resource ;
	}

	@Override
	public void run() {
		sharedResource.consumeItem();

	}

}
