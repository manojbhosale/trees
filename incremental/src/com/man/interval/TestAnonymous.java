package com.man.interval;

abstract class Person {

	abstract void view();
	
}

public class TestAnonymous{
	
	
	public static void main(String args[]){
		
		Person p = new Person() {
			
			@Override
			void view() {
				// TODO Auto-generated method stub
				System.out.println("test anaymous successful !!!");
			}
		};
		p.view();
	}
	
}