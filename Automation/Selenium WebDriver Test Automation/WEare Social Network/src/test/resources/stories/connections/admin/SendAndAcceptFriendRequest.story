Meta:
@Admin
@connections
@userConnectFunctionality

Narrative:
As an admin
I want to send and accept friend request
So that i can interact with other users


Scenario: An admin sends a friend request to another regular user and the other user accepts it
Given I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusTwo in homePage.namesField field
And I click homePage.searchButton element
And I click searchPage.seeProfileButton element
And I click personalProfilePage.connectButton element
Then searchPage.FriendRequestMessage element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present

Given I type randomSecondUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.PersonalProfile element
And I click personalProfilePage.newFriendRequestButton element
And I click personalProfilePage.approveRequestButton element
Then personalProfilePage.assertApprovedRequest element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present