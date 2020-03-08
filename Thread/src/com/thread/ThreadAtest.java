package com.thread;

public class ThreadAtest {
	public static void main(String[] args) {
		ThreadA aa = new ThreadA();
		aa.start();

		synchronized (aa) {
			try {
				System.out.println("Waiting for aa to complete...");
				aa.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Total is: " + aa.total);
		}
	}
}

