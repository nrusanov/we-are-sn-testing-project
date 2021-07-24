Meta:
@userConnectFunctionality

Narrative:
As a regular user
I want to send friend request
So that i can interact with other users

Scenario: A regular user send a friend request to another user
Given I type Team NeptunusTwo in homePage.namesField field
When I click homePage.searchButton element
And I click searchPage.seeProfileButton element
And I click searchPage.connectButton element
Then searchPage.FriendRequestMessage element is present
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present