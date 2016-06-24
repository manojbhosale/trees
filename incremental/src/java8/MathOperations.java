package java8;

public class MathOperations {
	
	public static void main(String args[]){
		
		ActualOperation au = (int a, int b) -> (a + b);
		ActualOperation au1 = ( a,  b) -> a - b;
		ActualOperation au2 = (int a, int b) -> {return a * b;};
		ActualOperation au3 = (int a, int b) -> a / b;
		System.out.println(au.operate(10, 11));
		System.out.println(au1.operate(10, 11));
		System.out.println(au2.operate(10, 11));
		System.out.println(au3.operate(10, 11));
		
	}
	
	interface ActualOperation{
		
		int operate(int a, int b);
		
	}
	
}

