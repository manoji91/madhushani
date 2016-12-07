
public class Manager extends Employee {
	
	public void calculateSalary(int basicSalary, int allowance, int bonus){
		int salary = basicSalary+ allowance + bonus;
		System.out.println("Manager salary is: "+salary);
	}

}
