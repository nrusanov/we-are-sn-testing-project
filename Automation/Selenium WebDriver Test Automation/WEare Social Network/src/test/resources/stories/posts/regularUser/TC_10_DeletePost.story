Meta:
@regularUser
@posts
@userPostFunctionality

Narrative:
As a regular user
I want to delete my own public post
So that a public post is deleted

Scenario: Delete my own public post as a regular user
Given I type randomUsername in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.deletePostButton element is present
And I click exploreThisPostPage.deletePostButton element
And deletePostPage.deletePostDropDown element is present
And I select Delete post from deletePostPage.deletePostDropDown dropdown
And I click deletePostPage.submitButton element
Then deletedPostPage.deletedPostMessage element is present
And deletedPostPage.deletedPostMessage element contains the value Post deleted successfully
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present