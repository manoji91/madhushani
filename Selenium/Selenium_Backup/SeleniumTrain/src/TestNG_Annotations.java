import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
@Test
	public void firstTest(){
		
		System.out.println("@Test");
}

@BeforeTest
public void firstBeforeTest(){
	
	System.out.println("@BeforeTest");
}
	

@AfterTest
public void firstAfterTest(){
	
	System.out.println("@AfterTest");
}
	

@BeforeSuite
public void firstBeforeSuite(){
	
	System.out.println("@BeforeSuite");
}

@AfterSuite
public void firstAfterSuite(){
	
	System.out.println("@AfterSuite");
}

@BeforeClass
public void firstBeforeClass(){
	
	System.out.println("@BeforeClass");
}

@AfterClass
public void firstAfterClass(){
	
	System.out.println("@AfterClass");
}

@BeforeMethod
public void firstBeforeMethod(){
	
	System.out.println("@BeforeMethod");
}

@AfterMethod
public void firstAfterMethod(){
	
	System.out.println("@AfterMethod");
}


}
