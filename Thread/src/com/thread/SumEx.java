package com.thread;

public class SumEx extends Thread{
    
	int sum = 0;
     public void run() {
    	 for(int i=1;i<=10;i++) {
    		 sum = sum+i;
    		 System.out.println(sum);
    	 }
     }
}
