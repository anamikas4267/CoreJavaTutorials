package com.anamika.demo2;

import com.anamika.demo.Bird;

public class Main {

	public static void main(String[] args) {

		Bird bird = new Bird() {
			@Override
			public void canFly(String val) {
				System.out.println(val);
			}

		};
		
		bird.canFly("Bird is flying");

	}

}
