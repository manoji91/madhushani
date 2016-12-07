package futureAkura;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver dr;
	
  @Test
  public void main() throws InterruptedException 
  {
	// get login link
	  dr.get("http://localhost:8080/akura/login.htm");
	  
	  //enter username
	  dr.findElement(By.name("j_username")).clear();
	  dr.findElement(By.name("j_username")).sendKeys("admin");
	  
	  //enter password
	  dr.findElement(By.name("j_password")).clear();
	  dr.findElement(By.name("j_password")).sendKeys("admin");
	  
	  //submit
	  dr.findElement(By.className("button")).click();
	  
	  //print login success message
	  System.out.println("Login Successful. Lets logout now");
	  
	  //get the title of the page
	  dr.getTitle();
	  
	  //get the title of the page
	  dr.getTitle().length();
	  
	  //print the title and the length of the page title
	  System.out.println("length of the the page title is "+ dr.getTitle().length());
	  
	  //wait for 100 seconds
	  Thread.sleep(1000);
	  
	  dr.navigate().to("http://localhost:8080/akura/schoolDetail.htm");
	  
	  	  
	  Thread.sleep(1000);
	  
	  //go back to the previous page
	  dr.navigate().back();
	  
	  Thread.sleep(1000);
	  
	  // go to the school details again by using forward
	  dr. navigate().forward();
	  
	  // go to school module
	  //dr.get("http://localhost:8080/akura/schoolDetail.htm");
	  
	  //print the title of the page
	  System.out.println("title of the page is "+ dr.getTitle());
	  
	  //print the current URL
	  System.out.println("title of the page is "+ dr.getCurrentUrl());
	  
	  //print the page source
	   dr.getPageSource();
	  
	  //wait for 100 seconds
	  Thread.sleep(2000);
	  
	  //go to home page
		 dr.get("http://localhost:8080/akura/adminWelcome.htm");
		 
	 //get the current window
		  dr.close();
		  
	  
	  //logout
	       //dr.get("http://localhost:8080/akura/j_spring_security_logout.htm");
	       // /html/body/div/div/div[2]/a[2]
		   //  "http://localhost:8080/akura/j_spring_security_logout.htm"
	       // <a href="/akura/j_spring_security_logout">Logout</a>
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	// Create a new instance of the Firefox driver
	 dr = new FirefoxDriver();
	  
	//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
	//Launch the  website
	 dr.get("http://localhost:8080/akura/welcomeAll.htm");
	 //another method to do this:
	 /*  String URL = "http://www.DemoQA.com";
	     driver.get(URL);
     */
   }

  @AfterMethod
  public void afterMethod() 
  {
	  // close the driver [all windows]
	  dr.quit();
  }

}
