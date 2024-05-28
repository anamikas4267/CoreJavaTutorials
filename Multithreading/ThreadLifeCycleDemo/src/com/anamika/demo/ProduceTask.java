package com.anamika.demo;

public class ProduceTask implements Runnable {
	
	SharedResource sharedResource;
	
	public ProduceTask(SharedResource resource) {
		this.sharedResource = resource;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		sharedResource.produceItem();

	}

}
