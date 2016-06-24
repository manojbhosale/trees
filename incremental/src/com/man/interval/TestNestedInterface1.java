package com.man.interval;

public class TestNestedInterface1 implements Showable.Message{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("In side messge !!");
	}

	public static void main(String args[]){
		
		Showable.Message tni = new TestNestedInterface1();
		tni.msg();
	}
	
}
