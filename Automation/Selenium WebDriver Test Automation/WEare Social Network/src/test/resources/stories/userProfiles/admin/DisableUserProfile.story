Meta:
@admin
@disable
@adminDisableFunctionality

Narrative:
As an admin
I want to disable user profile
So that i


Scenario: The admin disables a regular user profile
Given I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
And homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click searchPage.seeProfileButton element
And I click adminZonePage.disableButton element
Then adminZonePage.enableButton element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present