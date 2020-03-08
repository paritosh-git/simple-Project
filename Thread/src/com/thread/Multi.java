package com.thread;

public class Multi extends Thread {

	public void run() {
		System.out.println("I m in run method");
	}
	
	public static void main(String[] args) {
		Multi ml = new Multi();
		ml.start();
	}
}
