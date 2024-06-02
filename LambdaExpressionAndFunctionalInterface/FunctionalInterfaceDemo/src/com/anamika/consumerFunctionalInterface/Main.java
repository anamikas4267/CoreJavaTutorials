package com.anamika.consumerFunctionalInterface;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (Integer i)->{
			System.out.println("hello");
		};
		
		consumer.accept(7);
		
	}

}
