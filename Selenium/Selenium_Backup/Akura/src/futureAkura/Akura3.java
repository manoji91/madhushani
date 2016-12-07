package futureAkura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Akura3 {
	 @Test

	public static void main() throws InterruptedException {
		 
		 WebDriver dr = new FirefoxDriver();
		 
		//launch
			dr.get("http://localhost:8080/akura/welcomeAll.htm");
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
		
		//disciplinary action page of student 150104 and add an action
		 dr.get("http://localhost:8080/akura/studentSearch.htm");
		 dr.findElement(By.xpath("//input[@id='admission_number']")).clear();
		 dr.findElement(By.xpath("//input[@id='admission_number']")).sendKeys("150104");
		 dr.findElement(By.className("button")).click();
		 
		Thread.sleep(2000);
		
		 dr.findElement(By.xpath("//*[@id='search_results']/div[2]/table/tbody/tr[2]/td[2]/a")).click();
		
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//*[@id='menubar']/div/ul/li[4]/a")).click();
		 
		 dr.findElement(By.className("icon_new")).click();
		 
		 dr.findElement(By.id("comment")).clear();
		 dr.findElement(By.xpath("//input[@id='comment']")).sendKeys("Very Bad");
		
		// dr.findElement(By.id("diciplinaryActionDate")).clear();
		// dr.findElement(By.xpath("//input[@id='diciplinaryActionDate']")).sendKeys("2016-10-20");
		 
		 Thread.sleep(1000);
		 
		 dr.findElement(By.id("warningLevelId1")).clear();
		 dr.findElement(By.xpath("//input[@id='warningLevelId1']")).click();		 
		 
	}

}
