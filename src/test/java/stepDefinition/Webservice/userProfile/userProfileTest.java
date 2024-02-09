package stepDefinition.Webservice.userProfile;
//import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.List;
import java.util.Map;
import JsonObjects.userProfile;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import JsonObjects.*;


public class userProfileTest {
	
	userProfile userProfileResponseObject;
	String userID;

	@Given("^a user exists with an ID of (\\d+)$")
	public void a_user_exists_with_an_ID_of(String arg1) throws Throwable {
		userID=arg1;
	}
	
	@Given("^a user does not exists with an ID of (\\d+)$")
	public void a_user_does_not_exists_with_an_ID_of(String arg1) throws Throwable {
		userID=arg1;
	}

	@When("^a user retrieves the user information by ID$")
	public void a_user_retrieves_the_user_information_by_ID() throws Throwable {
		userProfileResponseObject=new userProfile();
	}

	@Then("^the status code returned from Get user by ID is (\\d+)$")
	public void the_status_code_returned_from_Get_user_by_ID_is(int arg1) throws Throwable {
		userProfileResponseObject.processGetUserProfile(userID);
		assertEquals(userProfileResponseObject.getStatusCode(),arg1);
	}

	@Then("^response of Get user by ID service includes the following$")
	public void response_of_Get_user_by_ID_service_includes_the_following(List<userProfile> expectedResult) throws Throwable {
		assertTrue(userProfileResponseObject.validateGetUser(expectedResult.get(0)));
	}
	
	
	// Get All Users
	
	@When("^a user retrieves the information of all the users$")
	public void a_user_retrieves_the_information_of_all_the_users() throws Throwable {
		userProfileResponseObject=new userProfile();
		userProfileResponseObject.processGetAllUsersProfile();
	}

	@Then("^the status code returned from Get all users is (\\d+)$")
	public void the_status_code_returned_from_Get_all_users_is(int arg1) throws Throwable {
		assertEquals(userProfileResponseObject.getStatusCode(),arg1);
	}
	
	@Then("^the number of records returned in response is (\\d+)$")
	public void the_number_of_records_returned_in_response_is(int arg1) throws Throwable {
		assertEquals(userProfileResponseObject.getSizeOfResponse(),arg1);
	}


	@Then("^response of Get all users includes the following in any order$")
	public void response_of_Get_all_users_includes_the_following_in_any_order(List<userProfile> expectedResult) throws Throwable {
	    assertTrue(userProfileResponseObject.validateGetAllUsers(expectedResult));
	}	
	
	// POST
	
	@When("^an Adminstrator adds a new user with the following details$")
	public void an_Adminstrator_adds_a_new_user_with_the_following_details(List<userProfile> expectedResult) throws Throwable {
		userProfileResponseObject=new userProfile();
		userProfileResponseObject.processPostUserProfile(expectedResult.get(0));
	}

	@Then("^the status code returned from Add user is (\\d+)$")
	public void the_status_code_returned_from_Add_user_is(int arg1) throws Throwable {
		assertEquals(userProfileResponseObject.getStatusCode(),arg1);
	}
	

}
