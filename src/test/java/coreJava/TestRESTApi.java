package coreJava;
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
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestRESTApi {
	
	String access_token;
	
	// Get Token
	@BeforeTest
	public void Login()
	{ 
         given()
        .contentType("application/x-www-form-urlencoded")
        .formParam("password", "admin")
        .formParam("username", "admin")
        .when()
        .post("http://localhost:8080/pippo/login")
        .then()        
        .statusCode(200) 
        .log();
        
        
//        .extract()
//        .path("access_token");        
	}	
	
//	// Get All Users
//	@Test(enabled=false)
//	public void test_get_all_user()
//	{              
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .get("http://10.74.113.75:8080/api/Users")
//        .then()
//        .statusCode(200)
//        .and()
//        .contentType(ContentType.JSON)
//        .log()
//        .all();
//	}
//	// Get All Users
//	@Test(enabled=false)
//	public void test_get_all_user_and_verify_content()
//	{              
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .get("http://10.74.113.75:8080/api/Users")
//        .then()
//        .statusCode(200)
//        .and()
//        .contentType(ContentType.JSON)
//        .and()
//        .body("Name",hasItem("Bhavya"));         
//	}
//	
//	// Get User By ID
//	@Test(enabled=false)
//	public void test_get_user_by_id()
//	{              
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .get("http://10.74.113.75:8080/api/Users/?id=1")
//        .then()
//        .statusCode(200)
//        .and()
//        .contentType(ContentType.JSON)
//        .and()
//        .body("Name",equalTo("Bhavya")
//        	  ,"UserName",equalTo("Bhavya")
//        	  ,"Password",equalTo("password"));        
//         
//	}
//	
//	// Get User By ID Parameter
//	@Test(enabled=false)
//	public void test_get_user_by_id_parameter()
//	{              
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .pathParam("id", 1)
//        .get("http://10.74.113.75:8080/api/Users/{id}")
//        .then()
//        .statusCode(200)
//        .and()
//        .contentType(ContentType.JSON)
//        .and()
//        .body("Name",equalTo("Bhavya"));
//         
//	}
//	
//	// Add User
//	@Test(enabled=false)
//	public void test_add_user()
//	{              
//		
//		Map<String,String> validJson = new HashMap<>();
////		validJson.put("ID", "10");
//		validJson.put("Name", "QA1Harsh");        
//		validJson.put("UserName", "QA1");
//		validJson.put("Password", "QA1");
//		validJson.put("UserRoles.Role", "Admin");
//				
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .contentType("application/json")
//        .body(validJson)
//        .when()
//        .post("http://10.74.113.75:8080/api/Users/AddUser")
//        .then()
//        .statusCode(201)
//        .and()
//        .contentType(ContentType.JSON)
//        .and()
//        .body("Name",equalTo("QA1"));         
//	}
//	
//	// Update User
//	@Test(enabled=true)
//	public void test_update_user()
//	{   	
//		Map<String,String> validJson = new HashMap<>();
//		validJson.put("ID", "28"); 
//		validJson.put("Name", "TestingQA1");        
//		validJson.put("UserName", "Testing");
//		validJson.put("Password", "Testing");		
//				
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .contentType("application/json") 
////        .contentType("application/x-www-form-urlencoded")
//        .param("id", 28)
////        .pathParam("id", 25)
//        .log()
//        .all()
//        .body(validJson)
//        .when()
////        .put("http://10.74.113.75:8080/api/Users/UpdateUser/{id}")
//        .put("http://10.74.113.75:8080/api/Users/UpdateUser")
//        .then()
//        .log()
//        .all();
// 
//               
//	}
//	
//	// Delete User
//	
//	@Test(enabled=false)
//	public void test_delete_user()
//	{  				
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .contentType("application/x-www-form-urlencoded")
//        .param("id", 7)
//        .when()        
//        .delete("http://10.74.113.75:8080/api/Users/DeleteUser")
//        .then()
//        .log()
//        .all()
//        .statusCode(200)
//        .and()
//        .contentType(ContentType.JSON);           
//	}
//	
//	// Get User By ID Parameter
//	@Test(enabled=false)
//	public void test_responseObject()
//	{              
//		Response response=
//		given()
//        .header("Authorization", "Bearer "+access_token)
//        .pathParam("id", 1)
//        .get("http://10.74.113.75:8080/api/Users/{id}");	
//
//		JsonPath jsonPathEvaluator = response.jsonPath();
//		
//		System.out.println("Status Code:"+response.getStatusCode());
//		System.out.println("Content Type:"+response.contentType());
//		System.out.println("Headers:"+response.getHeaders());	
//		System.out.println("Search:"+jsonPathEvaluator.get("UserRoles.Role"));		
//         
//	}
//	
//	
//	
//	
//	// Get User By ID Parameter and pojo
//	@Test(enabled=false)
//	public void test_get_user_by_id_parameter_pojo()
//	{              
//		userProfile userProfileObject=given()
//        .header("Authorization", "Bearer "+access_token)
//        .pathParam("id", 1)
//        .get("http://10.74.113.75:8080/api/Users/{id}")
//        .as(userProfile.class);
//		
//		System.out.println(userProfileObject.getID());
//		System.out.println(userProfileObject.getName());
//		System.out.println(userProfileObject.getPassword());
//		System.out.println(userProfileObject.getUserName());         
//	}
//
//					
//				// Get User By ID and map it to POJO
//				@Test(enabled=false)
//				public void test_get_user_by_id_pojo()
//				{              
//					userProfile object=
//					given()
//			        .header("Authorization", "Bearer "+access_token)
//			        .get("http://10.74.113.75:8080/api/Users/?id=1")
//			        .as(userProfile.class);
//					
//					System.out.println(object.getID());
//					System.out.println(object.getName());
//					System.out.println(object.getPassword());
//					System.out.println(object.getUserName());
//					System.out.println(object.getRole());
//			               
//			         
//				}
//				
//				// Add User using Json
//				// Limitation: The structure of Json is not structured
//				@Test(enabled=false)
//				public void test_add_user_withString_json()
//				{              
//					// user details
//					JSONObject user=new JSONObject();					
//					user.put("ID", 20);
//					user.put("Name", "QA1");
//					user.put("UserName", "QA2");
//					user.put("Password", "QA3");	
//					
//					// UserRoles array
//					JSONArray roleArray=new JSONArray();
//					JSONObject roleObject=new JSONObject();
//					roleObject.put("Role", "Admin");
//					roleArray.add(roleObject);
//					
//					
//					user.put("UserRoles", roleArray);
//
//					// RolePermissions array
//					JSONArray RolePermissions=new JSONArray();
//					JSONObject Permission=new JSONObject();
//					Permission.put("User_View", "Permission");
//					Permission.put("User_Save", "Permission");					
//					RolePermissions.add(Permission);
//					
//					// Add RolePermissions array to user details object
//					user.put("RolePermissions", RolePermissions);				
//					
//					System.out.println(user.toString());					
//					
//				}
//				
//				
//
//				// Add User using Gson
//				@Test(enabled=false)
//				public void test_add_user_withString_Gson()
//				{        
//
//					// user details
//					JsonObject user=new JsonObject();					
//					user.addProperty("ID", "20");
//					user.addProperty("Name", "QA1");
//					user.addProperty("UserName", "QA2");
//					user.addProperty("Password", "QA3");	
//					
//					// Roles array
//					JsonArray roleArray=new JsonArray();
//					JsonObject roleObject=new JsonObject();
//					roleObject.addProperty("Role", "Admin");
//					roleArray.add(roleObject);
//					
//					// add roles array to user
//					user.add("UserRoles", roleArray);
//					
//					// RolePermissions array
//					JsonArray RolePermissionsArray=new JsonArray();
//					JsonObject Permission=new JsonObject();
//					Permission.addProperty("User_View", "Permission");
//					Permission.addProperty("User_Save", "Permission");					
//					RolePermissionsArray.add(Permission);
//				
//					// add RolePermissions array to roles object 
//					roleObject.add("RolePermissions", RolePermissionsArray);		
//					
//					
//					System.out.println(user.toString());
//			
//					
//				}

				
	

}
