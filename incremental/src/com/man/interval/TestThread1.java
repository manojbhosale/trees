package com.man.interval;

public class TestThread1 extends Thread{
	
	public void run(){
		
		
		
		System.out.println("Thread is running !!!");
		
	}
	
	public static void main(String args[]){
		
		TestThread1 tt = new TestThread1();
		tt.start();
		TestThread1 tt1 = new TestThread1();
		tt1.start();
		
	}
	
}