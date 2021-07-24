Meta:
@admin
@search
@userSearchFunctionality

Narrative:
As an admin
I want to search for a user profile by first and last names
So that i can interact with him


Scenario: Search for a user profile as an admin
Given I type adminUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
Then homePage.assertNames element contains the value Team NeptunusTwo
And homePage.assertProfessionalCategory element contains the value Dentist
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present