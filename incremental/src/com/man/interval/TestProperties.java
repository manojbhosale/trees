package com.man.interval;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String args[]) throws IOException{
		
		/*FileReader fr = new FileReader("C:\\Manoj\\config.properties");
		
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("passwd"));
		System.out.println(p.setProperty("One","tow"));
		*/
		Properties pp = System.getProperties();
		
		Set s= pp.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Properties ppp = new Properties();
		ppp.setProperty("Manoj", "Bhosale");
		ppp.setProperty("Manoj1", "Bhosale1");
		ppp.store(new FileWriter("C:\\Manoj\\info.properties"),"Java properties example !!!");
		
	}
	
}
