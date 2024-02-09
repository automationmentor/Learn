package coreJava;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



//import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
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

public class Test3 {
	
//	@Test
//	public void test_get_statuscode_and_contentType()
//	{
//	// JSNON GET request
//	Response response=
//	given()
//	.when()
//	.get("http://d55csfapp05/IntuitionAPI/api/template/doc1")
//	.then()
//	.statusCode(200)
//	.and()
//	.contentType(ContentType.JSON)
//	.and()
//	.log()
//	.all()
//	.extract()
//	.response();	
//	
//	System.out.println(response.getStatusCode());
//	}
	
//	@Test
//	public void test_get_statuscode_and_contentType1()
//	{
//	// JSNON GET request
//	Response SAMLRequest=given()
//	.relaxedHTTPSValidation()
//	.log()
//	.all()
//	.when()
//	.get("https://10.74.113.177/Home/Index")
//	.then()
//	.statusCode(200)	
//	.and()	
//	.log()
//	.all()
//	.extract().response();	
//	
//	String myText=SAMLRequest.asString();
//	
//	System.out.println(myText);
//	}
	
	@Test
	public void test_put_with_valid_json1()
	{ 
        String access_token=given()
        .contentType("application/x-www-form-urlencoded")
        .formParam("grant_type", "password")
        .formParam("username", "Aadesh")
        .formParam("password", "password2")
        .when()
        .put("http://10.74.113.75:8080/token")
        .then()
        .statusCode(200)
//        .log()
//        .all()
        .extract()
        .path("access_token");
        
//        given()
//        .auth()       
//        .oauth2("bearer "+access_token)
//        .log()
//        .all()
//        .get("http://10.74.113.75:8080/api/Users")
//        .then()
//        .log()
//        .all();
        
        given()
        .header("Authorization", "Bearer "+access_token)
        .log()
        .all()
        .get("http://10.74.113.75:8080/api/Users")
        .then()
        .log()
        .all();
        
        
	}
	
	

}
