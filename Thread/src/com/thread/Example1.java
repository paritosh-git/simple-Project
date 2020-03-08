package com.thread;

public class Example1 extends Thread {
	  public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Example1 ex = new Example1();
		Example1 ex2= new Example1();
		System.out.println(ex.getName());
		System.out.println(ex2.getName());
		System.out.println(ex.getId());
		System.out.println(ex2.getId());
		ex.start();
		ex2.start();
		ex.setName("main thread");
		System.out.println(ex.getName());
		ex2.setName("main thread 2");
		System.out.println(ex2.getName());
	}

}
