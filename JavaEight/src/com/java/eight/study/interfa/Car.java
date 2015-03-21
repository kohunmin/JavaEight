package com.java.eight.study.interfa;

public interface Car {
	default void drive(){
		System.out.println("I can drive.");
	}
	default void carry(){
		System.out.println("car carry");
	}
}
