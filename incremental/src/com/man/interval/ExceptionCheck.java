package com.man.interval;

import java.io.IOError;
import java.io.IOException;

class Parent{

	public void m() throws IOException{
		System.out.println("Parent");

	}

}

public class ExceptionCheck extends Parent{

	public void m() throws IOException{  
		throw new IOException("device error");//checked exception  
	}  
	void n()throws IOException{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handled");}  
	}  
	public void finalize(){System.out.println("finalize called");}  

	public static void main(String args[]){
		ExceptionCheck obj=new ExceptionCheck();  
		obj.p();  
		System.out.println("normal flow...");  
		//obj.method();
		M m = new M();
		//	m.method();
		obj=null;
		//	System.gc();
	}


}
class M{  
	void method()throws IOException{  
		System.out.println("device operation performed");  
	}  
}  