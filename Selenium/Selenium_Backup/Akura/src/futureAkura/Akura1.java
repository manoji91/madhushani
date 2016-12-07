package futureAkura;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Akura1 {
	  @Test
	public static void main() throws InterruptedException
	{
		WebDriver dr = new FirefoxDriver();
		//launch
		dr.get("http://localhost:8080/akura/welcomeAll.htm");
		
		//successful browser open message
		System.out.println("Akura web page opened successfully");
		
		//login link
		dr.get("http://localhost:8080/akura/login.htm");
		
		Thread.sleep(1000);
		
		//SMOKE_001 - Admin User Login 
		dr.findElement(By.xpath("//input[@name='j_username']")).clear();
		dr.findElement(By.xpath("//input[@name='j_username']")).sendKeys("admin");
		dr.findElement(By.xpath("//input[@name='j_password']")).clear();
		dr.findElement(By.xpath("//input[@name='j_password']")).sendKeys("admin");
		dr.findElement(By.className("button")).click();
		
		Thread.sleep(1000);
		
		//SMOKE_002 - SMS Module
		dr.get("http://localhost:8080/akura/studentNotification.htm");
		
		Thread.sleep(1000);
		
		//SMOKE_003 - School Module
		dr.get("http://localhost:8080/akura/schoolDetail.htm");
		
		Thread.sleep(1000);
		
		//SMOKE_004 - User Management Module
		dr.get("http://localhost:8080/akura/manageUserRoles.htm");
		
		
		// wait for 1000 seconds
		Thread.sleep(1000);
		
		
		//close the driver		
		dr.quit();
		
		//SMOKE_005 - Add a new user role with Term Mark Import / Export rights
		//dr.findElement(By.className("button")).click();
		//dr.findElement(By.xpath("//input[@name='role']")).clear();
		//dr.findElement(By.xpath("//input[@name='role']")).sendKeys("Role1");
		//dr.findElement(By.xpath("//input[@id='tree']/ul[2]/li[2]/ul/li[4]/ul/li/ul/li[7]/span/span[2]")).click();
						
				//Select sel = new Select(dr.findElement(By.xpath("//select[@id='VIR_LMS_COMP_REQ_FORM1']")));
				//sel.selectByVisibleText(reason);
		
		//SMOKE_006 - navigate to the 'Manage System Users' tab
		
		//SMOKE_007 - create new systems users
		
		//SMOKE_008 -navigate to the Attendance module
		
	//	 dr.get("http://localhost:8080/akura/studentDiscipline.htm");
		
	
		
	
				
	}

}

