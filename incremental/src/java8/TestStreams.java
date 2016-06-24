package java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String args[]){
		
		/*
		//For each
		List<String> ls = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		ls.forEach(System.out::println);
		*/
		/*
		//map function
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,6);
		List<Integer> squares = l.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		squares.forEach(System.out::println);
		*/
		
		/*
		//filter
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> nonEmpty = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		int count = (int)strings.stream().filter(str -> !str.isEmpty()).count();
		nonEmpty.forEach(System.out::println);
		System.out.println(count);
*/	
	/*
		//limit
		Random r = new Random();
		
		r.ints().limit(10).forEach(System.out::println);

*/
		/*
		 * //Sorted
		Random r = new Random();
		
		r.ints().limit(100).sorted().forEach(System.out::println);
	*/
	/*	//Parellel stream
		List<String> l = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");		
		
		long count = l.parallelStream().filter(str -> str.isEmpty()).count();
	
		System.out.println(count);
*/
	/*
		//Collectors
		List<String> l = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		String joined = l.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
		System.out.println(joined);
*/	
		
		// statistics collectors
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		System.out.println("Summary Stats: "+numbers.stream().mapToInt((i) -> i).summaryStatistics());
		System.out.println("Max: "+numbers.stream().mapToInt(i->i).max().getAsInt());
		System.out.println("Min: "+numbers.stream().mapToInt(i->i).min());
		System.out.println("Average: "+numbers.stream().mapToInt(i->i).average());
		System.out.println("Sum: "+numbers.stream().mapToInt(i->i).sum());
		System.out.println("Count: "+numbers.stream().mapToInt(i->i).count());
	}
	
}
