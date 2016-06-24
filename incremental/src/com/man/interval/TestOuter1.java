package com.man.interval;


public class TestOuter1 {

	
	static int data = 30;
	static class Inner{
		
		static void msg(){System.out.println("data is "+ data);}
		
	}
	
	public static void main(String args[]){
		
		TestOuter1.Inner.msg();
		//ti.msg();
		
	}
	
}
