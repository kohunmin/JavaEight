package com.java.eight.study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lamda {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		/**
		 * 기존 방식
		 */
		for (int number : numbers) {
			System.out.println(number);
		}
		
		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer value) {
				System.out.println(value);
			}
		});
	}
}
