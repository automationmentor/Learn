@SmokeTest @LoginTest

Feature: Login Action

@positiveScenario
Scenario Outline: Successful Login with Valid Credentials & data
	Given User is on Login Page
	When User enters valid "<username>" and "<password>"
	Then User reaches to Home Page
	And User successfully Logs Out
	Examples:
	| username   | password |
  | test 			 | test |
#
 #
#@negativeScenario
#Scenario Outline: Failure Login with Invalid Credentials & data
#	Given User is on Login Page
#	When User enters invalid "<username>" and "<password>"
#	Then User gets error message
#	Examples:
#	| username   | password |
  #| invalid		 | invalid |
