Meta:
@admin
@search
@adminSearchFunctionality

Narrative:
As an admin
I want to search for a user profile by first and last names
So that i can interact with him


Scenario: Search for a user profile by first name and last name as an admin
Given I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
Then homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present