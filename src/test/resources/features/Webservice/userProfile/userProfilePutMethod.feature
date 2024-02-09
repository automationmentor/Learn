Feature: Update a user
  Scenario: User calls web service to update a valid user by ID
  	Given a user exists with an ID of 25
  	When a user updates the following information    
    
		| id 	 			| name 				|userName					|password			 |
		| 20				| QATest1			|QATest1userName	|QATestpassword|
		
		
		Then the status code returned from Add user is 201