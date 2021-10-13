Feature: Ebay Home Page Scenarios

@P1

Scenario: Advanced Searech Link


// Given When And Then

Given I am on Ebay Home Page
When I click on Advance Link
Then I navigate to Advanced Search Page
	

@P2
Scenario: Search items count

Given I am on Ebay Home Page
When I search for iphone 11
Then I vlidate 1000 search item peresent
