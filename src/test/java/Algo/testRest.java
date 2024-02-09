package Algo;


//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
//import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.filter.log.LogDetail;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;

//import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import helpers.ConfigurationManager;
import helpers.FileHandlingManager;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertTrue;

//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Scanner;
//import java.util.TimeZone;


//import org.junit.Test;
//import org.mockito.Mock;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.IOUtils;
//import static org.mockito.Mockito.*;




public class testRest {
	
	@BeforeTest
	public void startTest() throws Exception
	{
		RestAssured.replaceFiltersWith(ResponseLoggingFilter.responseLogger(), new RequestLoggingFilter());		
		RestAssured.requestSpecification = new RequestSpecBuilder()
//		.setContentType(ContentType.JSON)
//		.setBaseUri(serviceULR)
		.setUrlEncodingEnabled(false)
		.build();
	}
	
	
	@Test
	public void test_get_statuscode_and_contentType()
	{
	
	given()
	.auth()
	.preemptive()
	.basic("harsh.agnihotri@conduent.com", "xeqwjuqdvacy6apireqembnhjybqlrsfhiqsq3fuyqrognjlb5gq")
	.when()
	.get("https://dev.azure.com/TSG-Tolling-Modernization/Platform-Modernization/_apis/test/Plans/12269?api-version=5.0")
	.then()
	.statusCode(200);
	//.body(containsString("Welcome to Jenkins!"));
//	.log()
//    .all();
		
	}
	
	
	
	
//	@Test
//	public void Login()
//	{ 
//		RestAssured.replaceFiltersWith(ResponseLoggingFilter.responseLogger(), new RequestLoggingFilter());		
//		
//		RestAssured.requestSpecification = new RequestSpecBuilder()
////				.setContentType(ContentType.JSON)
////				.setBaseUri(serviceULR)
//				.setUrlEncodingEnabled(false)
//				.build();
//		
//		given()
//        .contentType("application/x-www-form-urlencoded")
//        .formParam("j_username", "admin")
//        .formParam("j_password", "admin")
//        .when()
//        .post("http://localhost:8080/login?from");
////        .then()        
////        .statusCode(200) 
////        .log()
////        .all();
//	}


//	
//	@Test
//	public void test_put_with_blank_json()
//	{
//		given()
//		.when()
//		.put("http://d55csfapp05/IntuitionAPI/api/realtime/doc3")
//		.then()
//		.statusCode(415);		
//	}
//	
//	@Test
//	public void test_put_with_invalid_uri()
//	{
//		given()
//		.when()
//		.put("http://d55csfapp05/IntuitionAPI/api/realtime/invalidDoc")
//		.then()
//		.statusCode(415);
//	}
//	
//	@Test
//	public void test_put_with_valid_json()
//	{
//		
//		Map<String,String> validJson = new HashMap<>();
//		validJson.put("recordName", "SampleRecord1");
//		validJson.put("fieldName", "SampleField1");        
//		validJson.put("recordInstance", "1");
//		validJson.put("useRecordInstance", "true");
//		validJson.put("value", "NEW VALUE!!!");       
//
//      given()
//      .contentType("application/json")
//      .body(validJson)
//      .when()
//      .put("http://d55csfapp05/IntuitionAPI/api/realtime/doc3")
//      .then()
//      .statusCode(200)
//      .and()
//      .body(containsString("SampleField1"));        
//	}
	
//	@Test
//	public void test_put_with_valid_json1()
//	{
//		
//		Map<String,String> validJson = new HashMap<>();
//		validJson.put("recordName", "SampleRecord1");
//		validJson.put("fieldName", "SampleRecord2");        
//		validJson.put("recordInstance", "1");
//		validJson.put("useRecordInstance", "true");
//		validJson.put("value", "NEW VALUE!!!");       
//
//      given()
//      .contentType("application/json")
//      .body(validJson)
//      .when()
//      .put("http://d55csfapp05/IntuitionAPI/api/realtime/doc3")
//      .then()
//      .statusCode(200)
//      .and()
//      .body(containsString("SampleRecord2"))
//      .and()
//      .log()
//      .all();
//	}

	
}
