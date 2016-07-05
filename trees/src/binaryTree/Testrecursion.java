package binaryTree;

public class Testrecursion {

	public static void main(String args[]){
		
		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int n){
		
		//termination condition
		if(n == 1){
			return n;
		}
		
		return n*factorial(n-1);	
	}
	
}
