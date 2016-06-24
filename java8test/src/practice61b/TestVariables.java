package practice61b;

import lambdas.Person;

public class TestVariables {
	int z;
	public static void main(String args[]){
		
		Person p = new Person();
		Person pc;
		
		pc = p;
		p.setName("Manoj");
		
		System.out.println(pc.getName()+"\n"+p.getName());
		int x = 0;
		int y = x;
		x = 11;
		
		System.out.println(x+" "+y+" "+new TestVariables().z);
		Person.main(new String[]{"a"});
		
	}
	
	
}
