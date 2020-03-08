package com.thread;

public class CallRunMethod extends Thread {
public void run() {
	for(int i=1;i<5;i++) {
		try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
		 CallRunMethod t1=new CallRunMethod();  
		 CallRunMethod t2=new CallRunMethod();  
//	     Thread tg = new Thread(t1);
//	     Thread tg1 = new Thread(t2);
//	    	 
//	     tg.start();
//	    tg1.start();
	  t1.run();  
	  t2.run(); 
		 
	 }  
	}  



