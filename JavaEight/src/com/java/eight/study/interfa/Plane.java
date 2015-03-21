package com.java.eight.study.interfa;

public interface Plane {
	default void fly() {
		System.out.println("I can fly.");
	}
	default void carry(){
		System.out.println("plane carry");
	}
}
