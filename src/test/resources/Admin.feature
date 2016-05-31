Feature: Registration 
	In Order to add data from the backend, I need to login as an Admin
	In order to use My Great Application
    As a user  I want to be able to register
 Scenario: Login as an Administrator to add location, resorts, price etc 
	Given when user enter the login Id and Password 
	Then the system should enter the Admin Landing page. 
Scenario: add new location to the database 
	Given when user navigate to Location Tab 
	Then User needs to add new location name, Image and description 
	And sumbit to have new location updated into the system 
Scenario: associate new location as Resort 
	Given user navigates to Resort page 
	Then choose location from the dropdown and click on addResort button
Scenario: Add Rooms to the selected resort
	Given I navigate to Rooms application
	When I choose the resort and click on add room
	Then I choose add resort properties like charges, type and area
	And click on Add Room
Scenario: view Room
Given user is in the add room page
When user clicks on view room link
And choose the resort/location
Then system should display all the resorts and available rooms
Scenario: 'Standard Registration' 
	Given I am not currently logged in 
	When I am on the signup page 
	Then I should click on Register Now link 
	And I fill in Choose UserName (required) 
	And I fill in Password (required with password 
	And I fill in Password confirmation with password 
	And I fill in FirstName, Last Name and age (required) 
	And I enter Email Address, Address ,Contact Number, Occupation 
	And I add my Credit Card Number, PIN and MemberType 
	Then I click on Register Button 
Scenario: Login as Guest 
	Given I land into the sign in page 
	When I verify that login form exist 
	Then I enter my credential and choose my privilege as Guest 
Scenario: Proceed with application Hotel Reservation 
	Given from the homePage I navigate to Hotel Reservation page 
	And I choose a location to proceed to check if the rooms are available 
	And I finalise the reservation 