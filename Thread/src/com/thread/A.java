package com.thread;

public class A implements Runnable {
public void run() {
	System.out.println("thread is running...");
	
}
public static void main(String[] args) {
	A aa = new A();
		Thread tg = new Thread(aa);
		tg.start();
	}
}

