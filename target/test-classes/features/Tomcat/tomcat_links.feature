Feature: tomcat application links
Scenario: check all the header links of tomcat page
	Given User is on tomcat Page
	When User clicks on Documentation Page
	And User clicks on Configuration Page	
	Then Message displayed All Header Links Are Working
#	
#	Scenario: check all the Developer quick start links of tomcat page
#	Given User is on tomcat Page
#	When User clicks on Tomcat Setup link
#	And User clicks on first Web Application link
#	And User clicks on JDBC DataSources link
#	Then Message displayed All Developer Links Are Working