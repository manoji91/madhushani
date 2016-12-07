
public class Company {

	public void calculatevalue(int c, int d){
		//int c = 10;
		//int d = 30;
		int e = c+d;
		System.out.println("Addition of c and d is: "+e);
	}
	
	public String printMyName(){
		String myCompanyName = "Virtusa Polaris";
		return myCompanyName;
	}
	
	public boolean printMyResult(int marks){
		boolean flag = false;
		if (marks >= 50){
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	public void printOneToTen(){
		
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
	}
	public void printasteric(){
		for(int y=1; y <=10 ; y++){
			for (int s=1; s <= y; s++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
