Meta:
@admin
@search
@adminSearchFunctionality
@ADMINSEARCH

Narrative:
As an admin
I want to search for a user profile by first and last names
So that i can interact with him


Lifecycle:
Before:
Scope: STORY


Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present


Scenario: Search for a user profile by first name and last name as an admin
Given homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
Then homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present

