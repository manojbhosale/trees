package completexample;

public class EmpBusinessLogic {
	
	public double calculateYearlySalary(EmployeeDetails empDetails){
		
		double yearlySalary = 0;
		yearlySalary = empDetails.getMonthlySalary() * 12;
		return yearlySalary;
				
		
	}
	
	//calculate upraisal amount of employee''
	
	public double calculateAppraisal(EmployeeDetails empDetails){
		double appraisal = 0;
		if(empDetails.getMonthlySalary() < 10000){
			appraisal = 500;
		}else{
			appraisal = 1000;
		}
		return appraisal;
	}

}
