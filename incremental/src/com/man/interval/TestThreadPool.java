package com.man.interval;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String args[]){
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i = 0 ; i < 10; i++){
			
			Runnable work = new Worker(" "+i);
			es.execute(work);
		}
		es.shutdown();
		
		while(!es.isTerminated()){
			//System.out.println("Manoj~~");
		}
		System.out.println("Finished all threads !!");
	}
	
}


class Worker implements Runnable{

	private String message;
	
	public Worker(String s){
		message = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" (Start) message "+ message);
		pause(1500);
		System.out.println(Thread.currentThread().getName()+" (End)");
	}
	
	public void pause(int time){
		
		try{
			Thread.sleep(time);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}	
	
}