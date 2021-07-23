Meta:
@userConnectFunctionality

Narrative:
As a regular user
I want to send friend request
So that i can interact with other users

Scenario: A regular user send a friend request to another user
Given I type user first name Neptunus and last name TeamTwo in the search box
When I click on 'Search' button
And I click on 'See Profile' button
And I click on 'Connect' button
!-- Then Friend Request is sent
Then I log out
And I am logged out