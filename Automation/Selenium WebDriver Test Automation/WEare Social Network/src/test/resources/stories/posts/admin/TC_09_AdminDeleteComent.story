Meta:
@admin
@comments
@adminDeletesComment

Narrative:
As an admin
I want to delete my own comment my own public post
So that a comment on public post is deleted

Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Edit my own comment my own public post as an admin
Given homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
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