package com.man.interval;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		TestClassSort tc1 = (TestClassSort) arg0;
		TestClassSort tc2 = (TestClassSort) arg1;
		
		if(tc1.age > tc2.age){
			
			return 1;
		}else if(tc1.age < tc2.age){
			return -1;
		}else{
			return 0;
		}
		
		//return 0;
	}

	
	
	
}
