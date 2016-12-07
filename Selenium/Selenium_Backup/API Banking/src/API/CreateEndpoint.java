package API;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEndpoint {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
			//launch
			dr.get("https://ec2-52-48-105-34.eu-west-1.compute.amazonaws.com:9446/carbon/admin/login.jsp");

			//login
			dr.findElement(By.id("txtUserName")).clear();
			dr.findElement(By.id("txtUserName")).sendKeys("admin");
			dr.findElement(By.id("txtPassword")).clear();
			dr.findElement(By.id("txtPassword")).sendKeys("admin");
			dr.findElement(By.className("button")).click();
				
				
			//Endpoints
			dr.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/ul/li[5]/ul/li[4]/ul/li[5]/a")).click();
			//add Endpoint
			dr.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td/div/div/div/ul/li[3]/a")).click();
			//HTTP Endpoint
			dr.findElement(By.xpath("//a[contains(text(),'HTTP Endpoint')]")).click();
			dr.findElement(By.id("endpointName")).clear();
			dr.findElement(By.id("endpointName")).sendKeys("TestLinkedIn");
			dr.findElement(By.id("uriTemplate")).clear();
			dr.findElement(By.id("uriTemplate")).sendKeys("https://api.linkedin.com/v1/people/~:(id,num-connections,picture-url)?format=json");
			
			//Test button
			//dr.findElement(By.id("testAddress")).click();
			
			//dr.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td/div/div/form/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/select")).click();
			
			
			//WebElement mySelectElement = dr.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td/div/div/form/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/select"));
			//Select dropdown= new Select(mySelectElement);
			//dropdown.selectByVisibleText("GET");
			 
			//WebElement option = dropdown.getFirstSelectedOption();
			//System.out.println(option.getText()); //output "Italy"
			
			dr.findElement(By.name("save")).click();
			
			
	}

	
	}


