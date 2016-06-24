package lambdas;

public class LambdaOperators {
	
	public static void main(String args[]){
		MathOperators mo = (a, b) -> a + b;
		System.out.println(mo.operate(10, 11));
	}

	interface MathOperators{
		public int operate(int a, int b);
	}
	
	interface Operator{
		
		public void performOperation(MathOperators mo, String s){
			
			
			
		}
		
	}
	
}
