package com.java.eight.study.lamda;

import java.util.function.Consumer;

public class loan {
	public static void withResource(Consumer<Resource> consumer) {
	    Resource resource = new Resource();
	    try {
	        consumer.accept(resource);
	    } finally {
	        resource.dispose();
	    }
	}
	
	public static void main(String[] args) {
		withResource(resource -> resource.operate());
	}
}

class Resource {
	 
    public Resource() {
        System.out.println("Opening resource");
    }
 
    public void operate() {
        System.out.println("Operating on resource");
    }
 
    public void dispose() {
        System.out.println("Disposing resource");
    }
}