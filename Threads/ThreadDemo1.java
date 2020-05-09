package com.info.threads;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		thread.setName("Java");
		thread.setPriority(7);
		
		System.out.println(thread);
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
	}
}
