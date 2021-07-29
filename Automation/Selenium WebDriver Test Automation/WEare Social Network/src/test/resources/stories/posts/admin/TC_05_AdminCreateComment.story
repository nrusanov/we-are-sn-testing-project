Meta:
@admin
@comments
@adminCreatesNewComment

Narrative:
As an admin
I want to comment my own public post
So that a public post is commented

Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Comment my own public post as an admin
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And textArea element is present
And I type This is a comment in textArea field
And I click exploreThisPostPage.postCommentButton element
And I click textArea element
And I scroll up in textArea
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
Then exploreThisPostPage.commentsCount element contains the value 1 Comments
And exploreThisPostPage.commentAuthorAdmin element contains the value adminRandom
And exploreThisPostPage.commentContent element contains the value This is a comment
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present