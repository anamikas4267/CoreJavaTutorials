package com.anamika.demo;

public class MonitorLocksDemo implements Runnable{
	
	MonitorLearning monitorLearning;
	
	public MonitorLocksDemo(MonitorLearning monitorLearning) {
		this.monitorLearning = monitorLearning;
	}

	@Override
	public void run() {
		monitorLearning.task1();
	}

}
