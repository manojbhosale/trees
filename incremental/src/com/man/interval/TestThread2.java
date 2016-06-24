package com.man.interval;

public class TestThread2 implements Runnable{

	public void run(){
		
		System.out.println("Thread is running !!!");
		
	}
	
	public static void main(String args[]){
		
		TestThread2 tt2 = new TestThread2();
		Thread t = new Thread(tt2);
		TestThread2 tt1 = new TestThread2();
		Thread t1 = new Thread(tt1);
		t.start();t1.start();
		
		
	}
	
}
