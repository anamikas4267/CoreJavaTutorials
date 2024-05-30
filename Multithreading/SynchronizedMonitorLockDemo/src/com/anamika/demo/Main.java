package com.anamika.demo;

public class Main {

	public static void main(String[] args) {

		// working on different object

		SharedResource resource1 = new SharedResource();

		Thread thread1 = new Thread(() -> {
			resource1.produce();
		});

		SharedResource resource2 = new SharedResource();

		Thread thread2 = new Thread(() -> {
			resource2.produce();
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			
		}
		
		
		// sharing same object 

		SharedResource resource = new SharedResource();

		Thread thread3 = new Thread(() -> {
			resource.produce();
		});


		Thread thread4 = new Thread(() -> {
			resource.produce();
		});

		thread3.start();
		thread4.start();

	}

}
