Meta:
@regularUser
@search
@userSearchFunctionality

Narrative:
As a regular user
I want to search for a user profile by professional category
So that i can interact with him


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Search for a user profile by professional category as a regular user
Given homePage.navigationBar.logOutButton element is present
When I type Dentist in homePage.professionalCategoryField field
And I click homePage.searchButton element
Then homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present