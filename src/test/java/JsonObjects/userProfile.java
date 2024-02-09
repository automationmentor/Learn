package JsonObjects;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.*;
import com.google.gson.annotations.SerializedName;
import com.jayway.restassured.http.ContentType;


public class userProfile extends JsonObject {
	@SerializedName("ID")
	private String id;	
	
	@SerializedName("Name")
	private String name;
	
	@SerializedName("UserName")
	private String userName;
	
	@SerializedName("Password")
	private String password;
	
	private String ENDPOINT_GET_USER_BY_ID = "http://10.74.113.75:8080/api/Users/";
	
	// Constructors
	public userProfile(String ID,String Name,String UserName, String Password)
	{
		super();
		this.id=ID;
		this.name=Name;
		this.userName=UserName;
		this.password=Password;		
	}
	
	public userProfile()
	{
		super();
	}	

	// Setters
	
	public void setId(String ID)
	{
	this.id=ID;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setUserName(String username)
	{
		this.userName=username;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	// Getters	
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}	
	
	
	public userProfile getUserProfileAsObject()
	{    
		return response.as(userProfile.class);
	}	

	
	public List<userProfile> getAllUsersProfileAsObject()
	{     
		
		userProfile[] userProfileArray= request.when().get(ENDPOINT_GET_USER_BY_ID).as(userProfile[].class); // working
		List<userProfile> listofUserProfile=new ArrayList<userProfile>(Arrays.asList(userProfileArray));
		return listofUserProfile;
	}
	
	// REST Request processing
	public void processGetUserProfile(String idNumber)
	{    			
		response=request.param("id", idNumber).when().get(ENDPOINT_GET_USER_BY_ID);		
//		System.out.println("response: " + response.prettyPrint());	
//		jsonPathEvaluator=response.jsonPath();		        		 
	}
	
	public void processGetAllUsersProfile()
	{    			
		response=request.when().get(ENDPOINT_GET_USER_BY_ID);	
//		jsonPathEvaluator=response.jsonPath();
//		System.out.println("response: " + response.prettyPrint());		 
	}
	
	public void processPostUserProfile(userProfile userProfileObject)
	{    			
		response=request.contentType("application/json").body(userProfileObject).when().post("http://10.74.113.75:8080/api/Users/AddUser");	
		System.out.println("response: " + response.prettyPrint());
	}
	
	
	public boolean validateGetUser(userProfile expectedResult)
	{
		userProfile actualResult=getUserProfileAsObject();
		
		if(expectedResult.getId().equals(actualResult.getId()) && expectedResult.getName().equals(actualResult.getName()) && expectedResult.getUserName().equals(actualResult.getUserName()) && expectedResult.getPassword().equals(actualResult.getPassword()))
		return true;
		else
		return false;
	}
	
	// Validation methods
	
	public boolean validateGetAllUsers(List<userProfile> expectedResult)	
	{
		
		List<userProfile> actualResult=getAllUsersProfileAsObject();
		String Found="No";
		boolean returnType=false;
				
		for (userProfile ExpectedResultObject:expectedResult) 
		{		    
			
			
			for(userProfile ActualResultObject:actualResult)
			{
				if(ExpectedResultObject.getId().equals(ActualResultObject.getId()) && ExpectedResultObject.getName().equals(ActualResultObject.getName())  && ExpectedResultObject.getUserName().equals(ActualResultObject.getUserName()) && ExpectedResultObject.getPassword().equals(ActualResultObject.getPassword()) )
				{
					Found="Yes";
					break;
				}
				else
				{
					Found="No";
					continue;
				}
						
			} // end of inner for loop
			
			if(Found.equals("Yes")) 
			{
				returnType=true;
				continue;
			}
			else
			{
				returnType=false;
				System.out.println("Record Mistatch:"+ExpectedResultObject.getId());
				break;
				
			}
			
		}// end of outer for loop
		return returnType;			
	}
	
	public int getSizeOfResponse()	{
//		return jsonPathEvaluator.getInt("size()");
		List<userProfile> actualResult=getAllUsersProfileAsObject();
		return actualResult.size();
	}
	
}