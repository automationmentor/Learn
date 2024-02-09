Feature: Add a user
  Scenario: User calls web service to add a valid user
    When an Adminstrator adds a new user with the following details
    
		| id 	 			| name 				|userName					|password			 |
		| 20				| QATest1			|QATest1userName	|QATestpassword|
		
		Then the status code returned from Add user is 201