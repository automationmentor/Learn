package RestTest;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.*;

public class Basics {
	
	public static void main(String args[])
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("");
	}

}
