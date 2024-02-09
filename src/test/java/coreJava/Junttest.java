package coreJava;
import org.junit.*;
import org.junit.Test;
//import org.testng.annotations.Test;


public class Junttest {
	@BeforeClass
	public static void beforeClassTest(){
	System.out.println("Executed before class method");
	}
	
	@Before
	public void beforeTest(){
	System.out.println("Running before test");
	}
	 

	@Test
	public void firstJunitTest(){
	System.out.println("Running first Junit test");
	}
	 

	@Test
	public void secondJunitTest(){
	System.out.println("Running second Junit test");
	}
	
	@Test
	public void thirdJunitTest(){
	System.out.println("Running third Junit test");
	//Assert.assertEquals("test failed", "abc", "abce");
	}
	
	@After
	public void afterTest(){
	System.out.println("Running after test");
	}

	@AfterClass
	public static void afterClassTest(){
	System.out.println("Running afterclass method");
	}
	}
