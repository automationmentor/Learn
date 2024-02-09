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
import com.jayway.restassured.RestAssured;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class sampleREST {
	
	String access_token;
	
	// Get Token
//	@BeforeTest
	public void get_access_token()
	{ 
         access_token=given()
        .contentType("application/x-www-form-urlencoded")
        .formParam("grant_type", "password")
        .formParam("username", "Aadesh")
        .formParam("password", "password2")
        .when()
        .put("http://10.74.113.75:8080/token")
        .then()
        .statusCode(200)        
        .extract()
        .path("access_token");        
	}	
	
	// Get All Users
	@Test(enabled=false)
	public void test_get_all_user()
	{              
		given()
        .header("Authorization", "Bearer "+access_token)
        .get("http://10.74.113.75:8080/api/Users")
        .then()
        .statusCode(200)
        .and()
        .contentType(ContentType.JSON)
        .log()
        .all();
	}
	// Get All Users
	@Test(enabled=false)
	public void test_get_all_user_and_verify_content()
	{              
		given()
        .header("Authorization", "Bearer "+access_token)
        .get("http://10.74.113.75:8080/api/Users")
        .then()
        .statusCode(200)
        .and()
        .contentType(ContentType.JSON)
        .and()
        .body("Name",hasItem("Bhavya"));         
	}
	
	// Get User By ID
	@Test(enabled=false)
	public void test_get_user_by_id()
	{              
		given()
        .header("Authorization", "Bearer "+access_token)
        .get("http://10.74.113.75:8080/api/Users/?id=1")
        .then()
        .statusCode(200)
        .and()
        .contentType(ContentType.JSON)
        .and()
        .body("Name",equalTo("Bhavya")
        	  ,"UserName",equalTo("Bhavya")
        	  ,"Password",equalTo("password"));        
         
	}
	
	// Get User By ID Parameter
	@Test(enabled=false)
	public void test_get_user_by_id_parameter()
	{              
		given()
        .header("Authorization", "Bearer "+access_token)
        .pathParam("id", 2)
        .get("http://10.74.113.75:8080/api/Users/{id}")
        .then()
        .statusCode(200)
        .and()
        .contentType(ContentType.JSON)
        .and()
        .body("Name",equalTo("Aadesh"));
         
	}
	
	// Add User
	@Test(enabled=false)
	public void test_add_user()
	{              
		
		Map<String,String> validJson = new HashMap<>();
		validJson.put("ID", "10");
		validJson.put("Name", "QA1");        
		validJson.put("UserName", "QA1");
		validJson.put("Password", "QA1");
		validJson.put("UserRoles.Role", "Admin");
				
		given()
        .header("Authorization", "Bearer "+access_token)
        .contentType("application/json")
        .body(validJson)
        .when()
        .post("http://10.74.113.75:8080/api/Users/AddUser")
        .then()
        .statusCode(201)
        .and()
        .contentType(ContentType.JSON)
        .and()
        .body("Name",equalTo("QA1"));         
	}
	
	// Update User
	@Test(enabled=false)
	public void test_update_user()
	{   	
		Map<String,String> validJson = new HashMap<>();
		validJson.put("Name", "QA1");        
		validJson.put("UserName", "QA1");
		validJson.put("Password", "QA1");
		validJson.put("Password", "QA1");
		
		
				
		given()
        .header("Authorization", "Bearer "+access_token)
        .contentType("application/json")
        .pathParam("id", 6)
        .body(validJson)
        .when()
        .put("http://10.74.113.75:8080/api/Users/UpdateUser/{id}")
        .then()
        .log()
        .all();
 
               
	}
	
	// Delete User
	
	@Test(enabled=false)
	public void test_delete_user()
	{  				
		given()
        .header("Authorization", "Bearer "+access_token)
        .contentType("application/json")
        .pathParam("id", 6)
        .when()        
        .delete("http://10.74.113.75:8080/api/Users/DeleteUser/{id}")
        .then()
        .log()
        .all()
        .statusCode(201)
        .and()
        .contentType(ContentType.JSON);           
	}
	
	// Get User By ID Parameter
	@Test(enabled=false)
	public void test_responseObject()
	{              
		Response response=
		given()
        .header("Authorization", "Bearer "+access_token)
        .pathParam("id", 2)
        .get("http://10.74.113.75:8080/api/Users/{id}");	

		JsonPath jsonPathEvaluator = response.jsonPath();
		
		System.out.println("Status Code:"+response.getStatusCode());
		System.out.println("Content Type:"+response.contentType());
		System.out.println("Headers:"+response.getHeaders());	
		System.out.println("Search:"+jsonPathEvaluator.get("UserRoles.Role"));		
         
	}
	
	
	
	
	// Get User By ID Parameter and pojo
	@Test(enabled=false)
	public void test_get_user_by_id_parameter_pojo()
	{              
		userProfile userProfileObject=given()
        .header("Authorization", "Bearer "+access_token)
        .pathParam("id", 2)
        .get("http://10.74.113.75:8080/api/Users/{id}")
        .as(userProfile.class);
		
		System.out.println(userProfileObject.getID());
		System.out.println(userProfileObject.getName());
		System.out.println(userProfileObject.getPassword());
		System.out.println(userProfileObject.getUserName());         
	}

	// Add User using JsonObject
		@Test(enabled=false)
		public void test_add_user_withJsonObject()
		{              
			JsonObject jsonObj=new JsonObject();
			jsonObj.addProperty("ID", 12);
			jsonObj.addProperty("Name", "QA3");
			jsonObj.addProperty("UserName", "QA3");
			jsonObj.addProperty("Password", "QA3");	
			jsonObj.addProperty("Password", "QA3");	

					
			given()
	        .header("Authorization", "Bearer "+access_token)
	        .contentType("application/json")
	        .body(jsonObj)
	        .when()
	        .post("http://10.74.113.75:8080/api/Users/AddUser")
	        .then()
	        .statusCode(201)
	        .and()
	        .contentType(ContentType.JSON)
	        .and()
	        .body("Name",equalTo("QA2"));         
		}

		// Add User using Gson
				@Test(enabled=false)
				public void test_add_user_withString()
				{              
					JsonObject person = new JsonObject();
					person.addProperty("firstName", "Sergey");
					person.addProperty("lastName", "Kargopolov");
					
					JsonObject address = new JsonObject();
					address.addProperty("country", "ru");
					address.addProperty("city", "Moscow");
					person.add("address", address);				
					
					System.out.println(person.toString());        
				}
				
				// Add User with java object(POJO)
				@Test(enabled=false)
				public void test_add_user_with_java_object()
				{              
					// Initialize the userProfile object
					userProfile userProfileObject=new userProfile();
					userProfileObject.setID(14);
					userProfileObject.setName("QA6");
					userProfileObject.setPassword("QA6");
					userProfileObject.setUserName("QA6");
					
					// Initialize user role composite member of userProfile
					UserRoles UserRolesObject=new UserRoles();
					UserRolesObject.setRole();
					
					// 
					ArrayList<Map> UserRolesPermissionArray=new ArrayList<Map>();
					
					Hashtable<String,String> UserRolesPermissionTable=new Hashtable<String,String>();
					UserRolesPermissionTable.put("Permission", "User_View");
					UserRolesPermissionArray.add(UserRolesPermissionTable);		
					
					UserRolesObject.setRolePermissions(UserRolesPermissionArray);
					
					ArrayList<UserRoles> UserRolesArray=new ArrayList<UserRoles>();
					UserRolesArray.add(UserRolesObject);
					
					userProfileObject.setRole(UserRolesArray);
					
					
					
					given()
			        .header("Authorization", "Bearer "+access_token)
			        .contentType("application/json")
			        .body(userProfileObject)
			        .log()
			        .all()
			        .when()
			        .post("http://10.74.113.75:8080/api/Users/AddUser")
			        .then()
			        .statusCode(201)
			        .and()
			        .contentType(ContentType.JSON)
			        .and()
			        .body("Name",equalTo("QA6"))
			        .log()
			        .all();	
			        
				}
				
				// Get User By ID and map it to POJO
				@Test(enabled=false)
				public void test_get_user_by_id_pojo()
				{              
					userProfile object=
					given()
			        .header("Authorization", "Bearer "+access_token)
			        .get("http://10.74.113.75:8080/api/Users/?id=1")
			        .as(userProfile.class);
					
					System.out.println(object.getID());
					System.out.println(object.getName());
					System.out.println(object.getPassword());
					System.out.println(object.getUserName());
					System.out.println(object.getRole());
			               
			         
				}
				
				// Add User using Gson
				@Test(enabled=true)
				public void test_add_user_withString_json()
				{              
					JsonObject person = new JsonObject();
					person.addProperty("firstName", "Sergey");
					person.addProperty("lastName", "Kargopolov");
					
					JsonObject address = new JsonObject();
					address.addProperty("country", "ru");
					address.addProperty("city", "Moscow");
					person.add("address", address);	
					
					JsonObject jsonObj=new JsonObject();
					jsonObj.addProperty("ID", 12);
					jsonObj.addProperty("Name", "QA3");
					jsonObj.addProperty("UserName", "QA3");
					jsonObj.addProperty("Password", "QA3");	
					jsonObj.addProperty("Password", "QA3");
					
					JsonArray jsonArrayObject=new JsonArray();
					
					
					System.out.println(person.toString());        
				}
				

	

}
