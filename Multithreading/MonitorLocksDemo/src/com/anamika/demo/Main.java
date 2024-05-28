package com.anamika.demo;

public class Main {

	public static void main(String[] args) {
		
		MonitorLearning monitorLearning = new MonitorLearning();
		
		MonitorLocksDemo runnableObj = new MonitorLocksDemo(monitorLearning);
		
		Thread t1 = new Thread(runnableObj);

		
		Thread t2 = new Thread(()->{monitorLearning.task2();});
	
		Thread t3 = new Thread(()->{monitorLearning.task3();});
		
		t1.start();
		t2.start();
		t3.start();

	}

}
