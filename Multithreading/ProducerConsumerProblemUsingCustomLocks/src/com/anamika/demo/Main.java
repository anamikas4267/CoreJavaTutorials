package com.anamika.demo;

public class Main {
	
	public static void main(String[] args) {
		
		SharedResources resource = new SharedResources(3);
		
		Thread th1 = new Thread(()->{
			for(int i=1;i<=6;i++) {
				resource.produce(i);
			}
		},"Producer");
		
		Thread th2 = new Thread(()->{
			for(int i=1;i<=6;i++) {
				resource.consume();
			}
		},"Consumer");
		
	
		th1.start();
		th2.start();
	}

}
