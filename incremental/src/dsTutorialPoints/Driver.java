package dsTutorialPoints;

public class Driver {

	public static void main(String args[]){
		
		
		ArrayM a = new ArrayM(new int[]{1,2,3,4,5});
		
		for(int i : a.am){
			System.out.println(i);	
		}
		
		a.insert(10, 2);
		
		for(int i : a.am){
			System.out.println(i);	
		}
		
		
	}
	
}
