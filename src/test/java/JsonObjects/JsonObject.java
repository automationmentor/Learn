package JsonObjects;

import static com.jayway.restassured.RestAssured.given;

import java.util.List;

import org.apache.log4j.Logger;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
//This class is the base class that every page in the application will inherit
public class JsonObject {
	public static Logger log;
	public String accessToken;
	public Response response;
//	public JsonPath jsonPathEvaluator;
	public RequestSpecification request;
	
	// Constructor
	public JsonObject()
	{		
		setAccessToken();
		request=given().header("Authorization", "Bearer "+accessToken);
	}
	
	// Setters
	public void setAccessToken()
	{ 
		accessToken=given()
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
	

	public String getAccessToken()
	{
		return accessToken;
	}
	
	public int getStatusCode()
	{
		return response.getStatusCode();
	}
	
	
}
