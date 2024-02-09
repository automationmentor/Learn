package samples;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Before;
import org.testng.Assert;
//import org.junit.Test;
import org.testng.annotations.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
import org.json.simple.parser.JSONParser;  
import org.json.simple.parser.ParseException;
import com.jayway.restassured.RestAssured;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Cookie;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestREST {
	
	Cookie cookie;
	
	@Test
	public void Login()
	{ 
		
		cookie=given()
		        .contentType("application/x-www-form-urlencoded")
		        .formParam("password", "admin")
		        .formParam("username", "admin")
		        .when()
		        .post("http://localhost:8080/pippo/login")
		        .then()        
		        .statusCode(302) 
		        .extract()
		        .response()		       
		        .getDetailedCookie("JSESSIONID");
	}
	
//	@Test
//	public void getAllContact()
//	{
//		
//		given()
//		.cookie(cookie)
//		.log()
//		.all()
//		.get("http://localhost:8080/pippo/api/contacts")
//        .then()
////        .statusCode(200)
//        .log()
//        .all();	
//	}
	
	
	@Test
	public void getContact()
	{
		
		given()
		.cookie(cookie)
		.log()
		.all()
		.get("http://localhost:8080/pippo/api/contact/1")
        .then()
        .statusCode(200)
        .log()
        .all();	
	}
//	
//	@Test
//	public void addContact()
//	{
//		
//		Map<String,String> validJson = new HashMap<>();
//		validJson.put("address", "test");
//		validJson.put("id", "0");        
//		validJson.put("name", "test3");
//		validJson.put("phone", "1111111111");
//		
//		given()
//		.cookie(cookie)
//      .contentType("application/json")
//      .body(validJson)
//      .when()
//      .post("http://localhost:8080/pippo/api/contact")
//      .then()
//      .statusCode(200)
//      .log()
//      .all();	
//		
//	}
//	
//	@Test
//	public void deleteContact()
//	{
//		
//		given()
//		.cookie(cookie)
//      .contentType("application/json")      
//      .when()
//      .delete("http://localhost:8080/pippo/api/contact/6")
//      .then()
//      .statusCode(200)
//      .log()
//      .all();	
//		
//	}
//	
//	@Test
//	public void editContact()
//	{
//		
//		Map<String,String> validJson = new HashMap<>();
//		validJson.put("address", "test10");
//		validJson.put("id", "10");        
//		validJson.put("name", "test10");
//		validJson.put("phone", "1111111111");
//		
//		given()
//		.cookie(cookie)
//      .contentType("application/json")
//      .body(validJson)
//      .when()
//      .post("http://localhost:8080/pippo/api/contact")
//      .then()
//      .statusCode(200)
//      .log()
//      .all();	
//	}
//	
	
	
}