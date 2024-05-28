package com.anamika.demo;

public class MonitorLearning {
	
	public synchronized void task1() {
		try {
			System.out.println("Task 1 started running");
			Thread.currentThread().sleep(10000);
			System.out.println("Task1 completed");
		}catch(Exception e) {
			
		}
	}
	
	public void task2() {
		System.out.println("Task2 started");
		synchronized(this) {
			System.out.println("Task2 inside synchronized block");
		}
	}
	
	public void task3() {
		System.out.println("Task3 started");
	}
}
