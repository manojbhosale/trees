package com.man.interval;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		TestClassSort tc1 = (TestClassSort) arg0;
		TestClassSort tc2 = (TestClassSort) arg1;	
		return tc1.name.compareTo(tc2.name);
	}

}
