package com.java.eight.study.generics;


public class generic {
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		Box rawBox = stringBox;
	}
}

class Box<T> {
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}
