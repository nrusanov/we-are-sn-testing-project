Meta:
@admin
@enable
@adminEnableFunctionality

Narrative:
As an admin
I want to enable user profile
So that I can restore user access to the site


Lifecycle:
Before:
Scope: STORY

Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: The admin enables a regular user profile
Given homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
And homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click searchPage.seeProfileButton element
And I click adminZonePage.enableButton element
Then adminZonePage.disableButton element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present
