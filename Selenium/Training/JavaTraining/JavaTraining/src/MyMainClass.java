
public class MyMainClass {

		static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello World");
       String name = "Dilsha";
       
       int x = 10;
       b = 20;
       System.out.println(x);
       System.out.println(b);
       
       Company comp = new Company();
       comp.calculatevalue(20, 40);
       System.out.println("My Name is: "+name);
       System.out.println(comp.printMyName());
       System.out.println(comp.printMyResult(50));
       comp.printOneToTen();
       comp.printasteric();
       
       Manager manager = new Manager();
       Subordinate sub = new Subordinate();
       manager.employeeAssessment("Dilsha", "Tharanga");
       Employee emp = new Employee();
       //emp.calculateSalary(20000, 10000);
       sub.calculateSalary(20000, 10000);
       manager.calculateSalary(10000, 50000, 10000);
       //emp.setDesignation("Associate Consultant");
       //emp.setUserName("Dtharanga");
       sub.setDesignation("Associate Consultant");
       sub.setUserName("Dtharanga");
       //System.out.println("My Designation is: "+emp.getDesignation());
       //System.out.println("My User Name is: "+emp.getUserName());
       System.out.println("My Designation is: "+sub.getDesignation());
      System.out.println("My User Name is: "+sub.getUserName());
       
	}

}
