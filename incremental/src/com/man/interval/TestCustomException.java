package com.man.interval;

public class TestCustomException {

	
	static void validate(int age) throws MyException{
		
		
		if(age < 21){
			
			throw new MyException("Can not vote!!");
			
		}else{
			
			System.out.println("Welcome to vote !!");
		}
		
	}
	
	
	public static void main(String args[]){
		
		try{
		validate(13);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		System.out.println("Chala hava yeu dya !!!");
	}
	
}
