package com.anamika.predicateFunctionalInterface;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (Integer i)->{
			return (i>0)?true:false;
		};
		
		System.out.println(predicate.test(7));
		
	}

}
