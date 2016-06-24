package parameterized;

import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args){
		
		Result res = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
		for(Failure f: res.getFailures()){
			
			System.out.println(f.toString());
			
		}
		System.out.println(res.wasSuccessful());
		
	}
}
