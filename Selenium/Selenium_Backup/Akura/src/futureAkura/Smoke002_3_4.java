package futureAkura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Smoke002_3_4 {
	@Test
	
	public static void main() throws InterruptedException{
		
		WebDriver dr = new FirefoxDriver();
		
		//SMOKE_002 - SMS Module
		dr.get("http://localhost:8080/akura/studentNotification.htm");
				
		Thread.sleep(1000);
				
		//SMOKE_003 - School Module
		dr.get("http://localhost:8080/akura/schoolDetail.htm");
				
		Thread.sleep(1000);
				
		//SMOKE_004 - User Management Module
		dr.get("http://localhost:8080/akura/manageUserRoles.htm");
		
		
	}

}
