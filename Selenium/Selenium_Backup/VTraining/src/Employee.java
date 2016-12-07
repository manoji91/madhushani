
public class Employee {

     private String userName;
	 //String firstName;
    // String lastName;
     private String Designation;
     
    private abstract void testAbstract();  

     public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public void employeeAssessment(String firstName, String lastName){
    	 System.out.println("Starting Employee Assesment");
    	 System.out.println("Employee Name: "+firstName+" "+lastName);
    	 System.out.println("Completed Employee Assesment");
     }
     
     public void calculateSalary(int basicSalary, int allowance){
    	 int salary = basicSalary + allowance;
    	 System.out.println("Salary is: "+salary);
     }

}
