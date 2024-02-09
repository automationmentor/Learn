package coreJava;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.ResponseSpecification;

import org.testng.annotations.DataProvider;

import static org.hamcrest.Matchers.*;

public class HelloWorldRestAssured {

// @Test
// public void makeSureThatGoogleIsUp() {
//     given().when().get("http://www.google.com").then().statusCode(200);
// }
	
	@BeforeClass
	public void initPath() {
		
		RestAssured.baseURI = "http://ergast.com";
	}

//	 @Test
//	 public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
//	         
//	     given().
//	     when().
//	         get("/api/f1/2017/circuits.json").
//	     then().
//	         assertThat().
//	         body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
//	 }
	
	
// @Test
// public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
//         
//     given().
//     when().
//         get("/api/f1/2017/circuits.json").
//     then().
//         assertThat().
//         body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
// }
 
// @Test
// public void test_ResponseHeaderData_ShouldBeCorrect() {
//         
//     given().
//     when().
//         get("/api/f1/2017/circuits.json").
//     then().
//         assertThat().
//         statusCode(200).
//     and().
//         contentType(ContentType.JSON).
//     and().
//         header("Content-Length",equalTo("4551"));
// }
 
// @Test
// // Parameterizing tests using Query parameters
// public void test_Md5CheckSumForTest_ShouldBe098f6bcd4621d373cade4e832627b4f6() {
//     
//     String originalText = "test";
//     String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
//         
//     given().
//         param("text",originalText).
//     when().
//         get("http://md5.jsontest.com").
//     then().
//         assertThat().
//         body("md5",equalTo(expectedMd5CheckSum));
// }

// @Test
// // Parameterizing tests using Path parameters
// public void test_NumberOfCircuits_ShouldBe20_Parameterized() {
//         
//     String season = "2017";
//     int numberOfRaces = 20;
//         
//     given().
//         pathParam("raceSeason",season).
//     when().
//         get("/api/f1/{raceSeason}/circuits.json").
//     then().
//         assertThat().
//         body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
// }

 
// @DataProvider(name="seasonsAndNumberOfRaces")
// public Object[][] createTestDataRecords() {
//     return new Object[][] {
//         {"2017",20},
//         {"2016",21},
//         {"1966",9}
//     };     
// }
// 
// @Test(dataProvider="seasonsAndNumberOfRaces")
// public void test_NumberOfCircuits_ShouldBe_DataDriven(String season, int numberOfRaces) {
//                 
//     given().
//         pathParam("raceSeason",season).
//     when().
//         get("/api/f1/{raceSeason}/circuits.json").
//     then().
//         assertThat().
//         body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
// }
 
//	@Test
//	public void test_ScenarioRetrieveFirstCircuitFor2017SeasonAndGetCountry_ShouldBeAustralia() {
//	        
//	    // First, retrieve the circuit ID for the first circuit of the 2017 season
//	    String circuitId = given().
//	    when().
//	        get("/api/f1/2017/circuits.json").
//	    then().
//	        extract().
//	        path("MRData.CircuitTable.Circuits.circuitId[0]");
//	        
//	    // Then, retrieve the information known for that circuit and verify it is located in Australia
//	    given().
//	        pathParam("circuitId",circuitId).
//	    when().
//	        get("http://ergast.com/api/f1/circuits/{circuitId}.json").
//	    then().
//	        assertThat().
//	        body("MRData.CircuitTable.Circuits.Location[0].country",equalTo("Australia"));
//	}
	
//	ResponseSpecification checkStatusCodeAndContentType = 
//		    new ResponseSpecBuilder().
//		        expectStatusCode(200).
//		        expectContentType(ContentType.JSON).
//		        build();
//
//	@Test
//	public void test_NumberOfCircuits_ShouldBe20_UsingResponseSpec() {
//	        
//	    given().
//	    when().
//	        get("/api/f1/2017/circuits.json").
//	    then().
//	        assertThat().
//	        spec(checkStatusCodeAndContentType).
//	    and().
//	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
//	}

//	@Test
//	public void checkThereWasARaceAtSilverstoneIn2014() {
//		
//		given().
//		when().
//			get("/api/f1/2014/circuits.json").
//		then().
//			assertThat().
//			body("MRData.CircuitTable.Circuits.circuitId", hasItem("silverstone"));
//	}
	
//	@Test
//	public void checkThereWasNoRaceAtNurburgringIn2014() {
//		
//		given().
//		when().
//			get("/api/f1/2014/circuits.json").
//		then().
//			assertThat().
//			body("MRData.CircuitTable.Circuits.circuitId", not(hasItem("nurburgring")));
//	}
//	
//	@Test
//	public void checkThereWasNoRaceAtNurburgringIn2014AndLog() {
//		
//		given().
//		when().
//			get("/api/f1/2014/circuits.json").
//		then().
//			log().
//			body();
//			
//	}

	/*******************************************************
	 * Request the list of all circuits that hosted a
	 * Formula 1 race in 2014 and check that this request is
	 * answered within 100 ms
	 * Use /api/f1/2014/circuits.json
	 ******************************************************/
	
//	@Test
//	public void checkResponseTimeFor2014CircuitList() {
//		
//		given().
//		when().
//			get("/api/f1/2014/circuits.json").
//		then().
//			assertThat().
//			time(lessThan(100L),TimeUnit.MILLISECONDS);
//	}
	
	/*******************************************************
	 * Request an authentication token for the Paypal sandbox
	 * API and write the response to the console
	 * Use Basic authentication
	 * username = oauth
	 * password = gimmeatoken
	 * Use /v1/oauth2/token
	 * Store this authentication token in a String variable
	 * for future reference
	 ******************************************************/
	
//	String accessToken;
//	
//	@BeforeClass
//	public void retrieveOAuthToken() {
//						
//		accessToken = 
//				
//		given().
//			auth().
//			preemptive().
//			basic("oauth","gimmeatoken").
//		when().
//			get("/v1/oauth2/token").
//		then().
//			extract().
//			path("access_token");
//	}


}
