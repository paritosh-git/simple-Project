package com.thread;

public class ThreadA extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <5 ; i++) {
				System.out.println(total+i);
				total = total+i;
			}
			notify();
		}
	}
}
