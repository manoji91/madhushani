package testpackage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.*;

////
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.*;

public class rex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("http://rex/login.jsp#/home");
		driver.manage().window().maximize();
		
	
		FileInputStream file = new FileInputStream("C:\\project\\Book1.xlsx");
		//try{
		XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int noOfColumns = sheet.getRow(0).getLastCellNum();
        //*******
        int noOfRows = sheet.getLastRowNum();
      
     
        
        String[] Headers = new String[noOfColumns];
        //String[] Rows = new String[noOfRows];
        
        for (int j=0;j<noOfColumns;j++){
        	
            Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
        	
        }
        
             
                for (int i = 0; i < 4; i++) {
                	
                    Row row = (Row) sheet.getRow(i);
                    
                                     
                    if(Headers[0].equals("Username") && Headers[1].equals("Password") && Headers[2].equals("Status"))
                    {
                    	System.out.println(i);
                      // System.out.println((sheet.getRow(i+1).getCell(2).getStringCellValue()));
                    	driver.findElement(By.xpath("/html/body/div/form/div/input")).sendKeys(sheet.getRow(i+1).getCell(0).getStringCellValue());
                    	driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(sheet.getRow(i+1).getCell(1).getStringCellValue());
                       
                       
                    	if((sheet.getRow(i+1).getCell(2).getStringCellValue()).equals("invalid")){
                    		System.out.println("invalid");
                    		
                    	    driver.findElement(By.xpath("/html/body/div/form/input")).click();
                 
                    	}
                    	else {
                    		
                    		System.out.println("valid");
                    		
                        	driver.findElement(By.xpath("/html/body/div/form/input")).click();
                        	//driver.findElement(By.xpath("/html/body/nav/div/div[3]/div[3]/ul/li[5]/a")).click();
                    		
                    	}
                    	} 
                  
                    		
                    
                    }  
               }
            
            
            
}
	
           
            
            
	

