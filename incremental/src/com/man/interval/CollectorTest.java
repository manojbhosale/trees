package com.man.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectorTest {

	public static void main(String args[]){
		
		Hashtable<TestClassSort, String> tm = new Hashtable<TestClassSort, String>();
		
		tm.put(new TestClassSort(10, "Manoj"), "test1");
		tm.put(new TestClassSort(11, "Manoj1"), "test1");
		tm.put(new TestClassSort(13, "Manoj2"), "test1");
		tm.put(new TestClassSort(12, "Manoj3"), "test1");
		
		List<TestClassSort> al = new ArrayList<TestClassSort>();
		al.add(new TestClassSort(10, "Manoj"));
		al.add(new TestClassSort(11, "Manoj1"));
		al.add(new TestClassSort(13, "Manoj2"));
		al.add(new TestClassSort(12, "Manoj3"));
		
		
		Collections.sort(al, new NameComparator());
		
		for(TestClassSort e: al){
			
			System.out.println(e.age+" "+e.name);
			
		}
		//Enumeration<String> e = tm.elements();
		
		
		/*while(e.hasMoreElements()){
			
			System.out.println(e.);
			
		}*/
		
	}
	
}
