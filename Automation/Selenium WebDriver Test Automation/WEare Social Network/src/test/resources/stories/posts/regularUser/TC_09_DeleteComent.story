Meta:
@regularUser
@comments
@userDeletesComment

Narrative:
As a regular user
I want to delete my own comment my own public post
So that a comment on public post is deleted

Lifecycle:
Before:
Scope: STORY
Given I type randomUsername in usernameField field
When I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present

Scenario: Edit my own comment my own public post as a regular user
Given homePage.navigationBar.logOutButton element is present
And I click homePage.navigationBar.LatestPosts element
When browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
And exploreThisPostPage.deleteCommentButton element is present
And I click exploreThisPostPage.deleteCommentButton element
And I scroll down in deleteCommentPage.DeleteCommentNavigated
And deleteCommentPage.dropDown element is present
And I select Delete comment from deleteCommentPage.dropDown dropdown
And I click deleteCommentPage.SubmitButton element
Then deletedCommentPage.deletedCommentMessage element contains the value Comment deleted successfully
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present