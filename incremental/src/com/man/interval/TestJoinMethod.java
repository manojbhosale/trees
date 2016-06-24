package com.man.interval;

public class TestJoinMethod implements Runnable{

	public void run(){

		for(int i = 0; i < 4; i++){
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}


	public static void main(String args[]){

		TestJoinMethod tjm = new TestJoinMethod();
		TestJoinMethod tjm1 = new TestJoinMethod();
		TestJoinMethod tjm2 = new TestJoinMethod();
		Thread t1 = new Thread(tjm);
		t1.setName("Manoj");
		t1.setDaemon(true);
		Thread t2 = new Thread(tjm1);
		t2.setName("Didi");
		t2.setPriority(10);
		
		Thread t3 = new Thread(tjm2);
		t3.setName("Shrikant");
		
		
		System.out.println(t1.getId()+" "+t1.getName()+" "+t1.getPriority()+" "+t1.getState()+" "+t1.getThreadGroup());
		System.out.println(t2.getId()+" "+t2.getName()+" "+t2.getPriority()+" "+t2.getState()+" "+t2.getThreadGroup());
		System.out.println(t3.getId()+" "+t3.getName()+" "+t3.getPriority()+" "+t3.getState()+" "+t3.getThreadGroup());

		t1.start();
		
		try{
			t1.join(1500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t2.start();t3.start();

	}

}
