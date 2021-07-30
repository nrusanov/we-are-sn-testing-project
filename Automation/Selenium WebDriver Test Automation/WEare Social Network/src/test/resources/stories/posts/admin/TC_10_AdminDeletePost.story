Meta:
@admin
@posts
@adminDeletePublicPost

Narrative:
As an admin
I want to delete my own public post
So that a public post is deleted


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Delete my own public post as an admin
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And I scroll down in bodyOfSite
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.deletePostButton element is present
And I click exploreThisPostPage.deletePostButton element
And deletePostPage.deletePostDropDown element is present
And I select Delete post from deletePostPage.deletePostDropDown dropdown
And I click deletePostPage.submitButton element
Then deletedPostPage.deletedPostMessage element contains the value Post deleted successfully
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present