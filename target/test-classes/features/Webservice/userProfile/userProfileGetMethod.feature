Feature: Get user by ID
  Scenario: User calls web service to get a valid user by its ID
    Given a user exists with an ID of 1
    When a user retrieves the user information by ID
    Then the status code returned from Get user by ID is 200
    And response of Get user by ID service includes the following
    
		| id 	 			| name 				|userName	|password|
		| 1					| Bhavya			|Bhavya		|password|
	
	  
	Scenario: User calls web service to get a invalid user by its ID
    Given a user does not exists with an ID of 100
    When a user retrieves the user information by ID
    Then the status code returned from Get user by ID is 404
    

  Scenario: User calls web service to get all users    
    When a user retrieves the information of all the users
    Then the status code returned from Get all users is 200
    And the number of records returned in response is 15					
		And response of Get all users includes the following in any order		
		| id 	 			| name 				|userName	|password|
		| 1					| Bhavya			|Bhavya		|password|
		| 2					| Aadesh			|Aadesh		|password2|
		| 3					| Utkarsh			|Utkarsh	|password3|