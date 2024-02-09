package coreJava;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
//import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
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

public class Test2 {
	
//	@Test
//	public void test_get_statuscode_and_contentType()
//	{
//	// JSNON GET request
//	given()
//	.when()
//	.get("http://d55csfapp05/IntuitionAPI/api/template/doc1")
//	.then()
//	.statusCode(200)
//	.and()
//	.contentType(ContentType.JSON);		
//	}

//	@Test
//	public void test_get_body_contains_desinger()
//	{	
//	given()
//	.when()
//	.get("http://d55csfapp05/IntuitionAPI/api/template/doc1")
//	.then()
//	.body(containsString("Designer 17.0.0"));
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
//        given()
//        .contentType("application/json")
//        .body(validJson)
//        .when()
//        .put("http://d55csfapp05/IntuitionAPI/api/realtime/doc3")
//        .then()
//        .statusCode(200)
//        .and()
//        .body(containsString("SampleField1"));        
//	}
	
	@Test
	public void test_put_with_valid_json1()
	{
		
		Map<String,String> validJson = new HashMap<>();
		validJson.put("recordName", "SampleRecord1");
		validJson.put("fieldName", "SampleRecord2");        
		validJson.put("recordInstance", "1");
		validJson.put("useRecordInstance", "true");
		validJson.put("value", "NEW VALUE!!!");       

        given()
        .contentType("application/json")
        .body(validJson)
        .when()
        .put("http://d55csfapp05/IntuitionAPI/api/realtime/doc3")
        .then()
        .statusCode(200)
        .and()
        .body(containsString("SampleRecord2"))
        .and()
        .log()
        .all();
	}

	
}
