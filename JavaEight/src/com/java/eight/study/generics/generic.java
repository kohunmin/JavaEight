package com.java.eight.study.generics;


public class generic {
	public static void main(String[] args) {
		{
			Box<String> stringBox = new Box<>();
			Box rawBox = stringBox;
		}
		
		{
			Box<Integer> integerBox = new Box<Integer>();
	        integerBox.set(new Integer(10));
	       // integerBox.inspect("some text"); // error: this is still String!
		}
		
		{
			String[] dogs = {"a","b","b"};
			
			int count = countGreaterThan(dogs, "a");
			System.out.println(count);
		}
	}
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
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

class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    // ...
}