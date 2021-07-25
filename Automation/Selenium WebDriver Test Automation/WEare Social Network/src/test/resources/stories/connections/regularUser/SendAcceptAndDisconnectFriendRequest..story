Meta:
@regularUser
@connections
@userConnectFunctionality

Narrative:
As a regular user
I want to send friend request, accept friend request, disconnect already accepted friend request
So that i can use connectivity functionality

Scenario: A first regular user sends friend request to second regular user and the second user accepts it, then the first user disconnect already accepted friend request
Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Dentist in homePage.professionalCategoryField field
And I click homePage.searchButton element
And homePage.assertSecondUserName element contains the value Team NeptunusTwo
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

Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I type Dentist in homePage.professionalCategoryField field
And I click homePage.searchButton element
And homePage.assertSecondUserName element contains the value Team NeptunusTwo
And I click searchPage.seeProfileButton element
And I click personalProfilePage.disconnectButton element
Then personalProfilePage.connectButton element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present