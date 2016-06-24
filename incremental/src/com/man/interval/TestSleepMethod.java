package com.man.interval;

public class TestSleepMethod implements Runnable{

	public void run(){
		
		for(int i = 0; i < 4; i++){
			try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
			System.out.println(i);
		}
	}
	
	
	public static void main(String args[]){
		
		TestSleepMethod tsm = new TestSleepMethod();
		TestSleepMethod tsm1 = new TestSleepMethod();
		//tsm.run();tsm1.run();
		Thread t1 = new Thread(tsm);
		Thread t2 = new Thread(tsm1);
		t1.start();
		t2.start();
		t1.start();
	}
}
