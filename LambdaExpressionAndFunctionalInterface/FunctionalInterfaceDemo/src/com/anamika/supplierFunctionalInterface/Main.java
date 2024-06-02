package com.anamika.supplierFunctionalInterface;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Supplier supplier = ()->{
			return true;
		};
		
		System.out.println(supplier.get());
		
	}

}
