import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	
	
@BeforeTest
public void myBeforeTest(){
	System.out.println("Network connectivity should exist");
	System.out.println("Open Google chrome browser");
	System.out.println("Type 'www.google.lk' and click enter");
}


//method to return the name
public String returnMyName(){
String myName = "Shan";
return myName;
}


// method to add 2 values
public int addValues(){
	int a = 1;
	int b = 2;
	int c;
	c = a+b;
	return c;
}

public int myAddition(int a, int b){
	int c = a+b;
	return c;
}

public boolean myTestPassed(){
	boolean myStatus = false;
	return myStatus;
}


public boolean myTestPassed2(int val){
	boolean marks;
	if (val >50){
		marks = true;
	}
	else{
		marks = false;
	}
	return marks;
}

@Test
public void myTest(){
	System.out.println("Type 'VirtusaPolaris' in google search textbox");
	System.out.println("Navigate to 'VirtusaPolaris'site");
	System.out.println("Click on 'IT Consulting and Agile Software Development link");
	
	// if used this way this will pass the test
	Assert.assertEquals(returnMyName(), "Shan");
	// if used this way this will fail the test
	//Assert.assertEquals(returnMyName(), "Shaniiii");
}

@Test
public void myTest2(){
Assert.assertEquals(addValues(), 4);
}


@Test
public void myTest3(){
Assert.assertEquals(myAddition (10, 15), 4);
}

@Test
public void myTest4(){
	Assert.assertTrue(myTestPassed(), "false");
}


@Test
public void myTest5(){
	Assert.assertTrue(myTestPassed2(90), "true");
}

@AfterTest
public void myAfterTest(){
	System.out.println("System should navigate to the site");
}
	
	

}
