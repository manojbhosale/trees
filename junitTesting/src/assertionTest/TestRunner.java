package assertionTest;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class TestRunner {
	
	
	public static void main(String[] args){
		
		Result res = JUnitCore.runClasses(TestAssertion.class);
		for(Failure result: res.getFailures()){
			
			System.out.println(result.toString());
			
		}
		
		System.out.println(res.wasSuccessful());
	}

}
