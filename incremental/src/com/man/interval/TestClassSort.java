package com.man.interval;

public class TestClassSort implements Comparable<TestClassSort>{

	public int age;
	public String name;
	
	public TestClassSort(int age, String name){
		
		this.age = age;
		this.name = name;
		
	}

	
	public int compareTo(TestClassSort arg0) {
		// TODO Auto-generated method stub
		TestClassSort tcs = (TestClassSort) arg0;
		if(tcs.age > this.age){
			
			return -1;
		}else if(tcs.age < this.age){
			
			return 1;
		}else{
			return 0;
		}
		
		
	}
	
	public String toString(){
		
		return this.age+" "+this.name;
		
	}


	
	
	
}
