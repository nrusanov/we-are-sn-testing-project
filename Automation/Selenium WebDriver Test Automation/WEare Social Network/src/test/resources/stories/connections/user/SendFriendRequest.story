Meta:
@connections
@userConnectFunctionality

Narrative:
As a regular user
I want to send friend request
So that i can interact with other users

Scenario: A regular user send a friend request to another user
Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
And I click searchPage.seeProfileButton element
And I click searchPage.connectButton element
Then searchPage.FriendRequestMessage element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present