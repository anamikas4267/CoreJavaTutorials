package com.anamika.functionFunctionalInterface;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		Function<String, String> supplier = (String str)->{
			return str;
		};
		
		System.out.println(supplier.apply("You can do it!!"));
		
	}

}
