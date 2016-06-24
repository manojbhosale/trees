package com.man.interval;
import java.util.regex.*;



public class TestRegEx {

public static void main(String args[]){
	
	Pattern p = Pattern.compile(".s");
	Matcher m = p.matcher("as");
	boolean b = m.matches();	
	
	System.out.println(b);

	
	boolean b2 = Pattern.compile(".s").matcher("sachin").matches();
	System.out.println(b2);
	
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","manoj1#"));
	
	boolean b3 = Pattern.matches(".s", "sachin");
	System.out.println(b3);
	
}	
	
	
}
