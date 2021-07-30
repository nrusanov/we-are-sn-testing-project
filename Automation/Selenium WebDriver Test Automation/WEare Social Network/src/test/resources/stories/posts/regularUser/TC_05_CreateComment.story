Meta:
@regularUser
@comments
@userCreatesNewComment

Narrative:
As a regular user
I want to comment my own public post
So that a public post is commented

Lifecycle:
Before:
Scope: STORY
Given I type randomUsername in usernameField field
When I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Comment my own public post as a regular user
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And I scroll down in bodyOfSite
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And textArea element is present
And I type This is a comment in textArea field
And I click exploreThisPostPage.postCommentButton element
And I click textArea element
And I scroll up in textArea
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
Then exploreThisPostPage.commentsCount element is present
And exploreThisPostPage.commentsCount element contains the value 1 Comments
And exploreThisPostPage.commentAuthor element contains the value randomUsername
And exploreThisPostPage.commentContent element contains the value This is a comment
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present