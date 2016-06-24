package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestPredicate {

	public static void main(String args[]){
		
		List<Integer> l = Arrays.asList(1,2,3,4,4,5,6,7);
		
		System.out.println("Print all numbers!!");
		
		eval(l, n -> true );
		

		System.out.println("Print all even numbers!!");

		eval(l, n -> n%2==0 );

		System.out.println("Print all numbers large than 3!!");

		eval(l, n -> n > 3 );

		
		
	}
	
	
	public static void eval(List<Integer> li, Predicate<Integer> p){
		
		for (Integer integer : li) {
			
			if(p.test(integer)){
				
				System.out.print(integer+ " ");
				
			}
			
		}
		
	}
	
}
