package com.man.interval;

public class LocalInner2 {

	public void display(){
		final int value = 10;
		class Inner{
			
			void msg(){
				System.out.println("Value :"+value);
				
			}
			
		}
		Inner i = new Inner();
		i.msg();
		
	}
	
	public static void main(String args[]){
		
		LocalInner2 li = new LocalInner2();
		li.display();
	}
}
