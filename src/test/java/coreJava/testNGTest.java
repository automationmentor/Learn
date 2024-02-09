package coreJava;
import org.testng.asserts.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;



public class testNGTest {
	@BeforeClass
	public void beforeClassTest(){
	System.out.println("Executed before class method");
	}
	
	@BeforeMethod
	public void beforeMethod(){
	System.out.println("Running before every test method");
	}
	
	@BeforeTest
	public void beforeTest(){
	System.out.println("Runs only once before the test begins");
	}
	 
	///////////////////// Test Methods
	
	@Test
	public void firstJunitTest(){
	System.out.println("Running first TestNG test");
	}
	 

	@Test
	public void secondJunitTest(){
	System.out.println("Running second TestNG test");
	}
	
	@Test
	public void thirdJunitTest(){
	System.out.println("Running third TestNG test");
	//Assert.assertEquals("test failed", "abc", "abce");
	}
	
//	@AfterMethod
//	public void afterTest(){
//	System.out.println("Running after method");
//	}
//
//	@AfterClass
//	public void afterClassTest(){
//	System.out.println("Running afterclass method");
//	}
	
	}
