package completexample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String args[]){
		
		Result  result = JUnitCore.runClasses(TestEmployeeDetails.class);
		
		for(Failure f : result.getFailures()){
			
			System.out.println(f.toString());
			
		}
		
		System.out.println(result.wasSuccessful());
		
	}

}
