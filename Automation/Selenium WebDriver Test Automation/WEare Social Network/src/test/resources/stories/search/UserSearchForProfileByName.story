Meta:
@userSearchFunctionality

Narrative:
As a regular user
I want to search for a user profile by first and last names
So that i can interact with him


Scenario: Search for a user profile as a regular user
Given I type user first name Team and last name NeptunusTwo in the search box
When I click on 'Search' button
Then User profile is displayed
And I log out
And I am logged out