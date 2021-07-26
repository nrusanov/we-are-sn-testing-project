Meta:
@Admin
@connections
@adminConnectFunctionality

Narrative:
As an admin
I want to send friend request, accept friend request, disconnect already accepted friend request
So that i can use connectivity functionality


Scenario: An admin sends friend request to a regular user and the user accepts it, then the admin disconnect already accepted friend request
Given I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusOne in homePage.namesField field
And I click homePage.searchButton element
And homePage.assertFirstUserName element contains the value Team NeptunusOne
And I click searchPage.seeProfileButton element
And I click personalProfilePage.connectButton element
Then searchPage.FriendRequestMessage element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present

Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.PersonalProfile element
And I click personalProfilePage.newFriendRequestButton element
And I click personalProfilePage.approveRequestButton element
Then personalProfilePage.assertApprovedRequest element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present

Given I type adminRandom in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Team NeptunusOne in homePage.namesField field
And I click homePage.searchButton element
And homePage.assertFirstUserName element contains the value Team NeptunusOne
And I click searchPage.seeProfileButton element
And I click personalProfilePage.disconnectButton element
Then personalProfilePage.connectButton element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present

