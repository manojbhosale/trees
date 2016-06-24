package lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
	
	
	public static void main(String args[]){
		
		List<Integer> a = Arrays.asList(1,2,3,4);
		
		int sum =  a.stream().mapToInt(e-> e).sum();
		
		System.out.println("Sum :"+sum);
		
		Double avg = a.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg :"+avg);
		
	}

}
