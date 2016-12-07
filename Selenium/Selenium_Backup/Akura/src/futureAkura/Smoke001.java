package futureAkura;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Smoke001
{
	@Test
	public static void main(){
	//Verify that the admin user can log in to the system with valid credentials
	 
	 WebDriver dr = new FirefoxDriver();
	 //dr = new FirefoxDriver();
	
	 //Launch
	 dr.get("http://localhost:8080/akura/welcomeAll.htm");
	 
	 //Go to Login Link
	 dr.get("http://localhost:8080/akura/login.htm");
	 
	 
	 //Enter user details and submit
	 //enter username
	  dr.findElement(By.name("j_username")).clear();
	  dr.findElement(By.name("j_username")).sendKeys("admin");
	  
	  //enter password
	  dr.findElement(By.name("j_password")).clear();
	  dr.findElement(By.name("j_password")).sendKeys("admin");
	  
	  //submit
	  dr.findElement(By.className("button")).click();
	
	
	 
	 
	 /* OR you can write this way
	  * String URL = "http://localhost:8080/akura/welcomeAll.htm";
	  * 
	  * dr.get(URL);
	  */
	 
	
	}
}
