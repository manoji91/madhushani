package FutureM;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RealEstate {
  @Test
  public void f() {
	  WebDriver dr = new FirefoxDriver();
	  //opening the web page 
	  dr.get("https://www.realestate.com.au/buy");
	  
	  //dr.findElement(By.xpath("//input[@id='where']")).clear();
	  //dr.findElement(By.xpath("//input[@id='where']")).sendKeys("Tarneit");	 
	  
	  dr.findElement(By.id("includeSurrounding")).click();
	  
	  
	  
	 // Select dropdown = new Select(dr.findElement(By.xpath("//select[@id='rui-sel-rui-property-type-select-id']")));
	 // dropdown.selectByVisibleText("House");
	  
	  
	
	 // dr.findElement(arg0)
	 // rui-sel-rui-min-price-select-id
	  //dr.selectByIndex(0);
	  
	  
	 // se.selectByVisibleText("Man");
	 // se.selectByIndex(0);
	 // se.selectByValue("Male");
		 
	
  }
}
