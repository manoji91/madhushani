package futureM;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://rex/login.jsp;JSESSIONID=d425c270-3fda-43d8-900d-01b9d98f269a");
	  
	  driver.findElement(By.xpath("//input[@id='uname']")).clear();
	  driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("rtweerasooriya");
	  driver.findElement(By.xpath("//input[@id='password']")).clear();
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("2wsx3edc@");  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  
  }
}
