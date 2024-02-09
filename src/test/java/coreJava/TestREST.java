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

public class TestREST {
	
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
	}
}