package completexample;

//import junit.framework.Test;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	@Test
	public void testCalculateAppraisal(){
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		Double appraisal = empBusinessLogic.calculateAppraisal(employee);
		System.out.println("BeforeAssert");
		assertEquals(500,appraisal,0.0);
		System.out.println("AfterAssert");
		assertEquals(500,appraisal,0.0);
		System.out.println("AfterAAAAssert");
	}
	
	
	// test to check the yearly salary
	@Test
	public void testCalculateYearlySalary(){
		
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96001, salary,0.0);
	}
	

}
