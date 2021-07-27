Meta:
@regularUser
@comments
@userCommentsFunctionality

Narrative:
As a regular user
I want to edit my own comment my own public post
So that a comment on public post is edited

Scenario: Edit my own comment my own public post as a regular user
Given I type randomUsername in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButtonn element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
And exploreThisPostPage.editCommentButton element is present
And I click exploreThisPostPage.editCommentButton element
And textArea element is present
And I type This is an edited comment in textArea field
And I click editCommentPage.editCommentButton element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
Then exploreThisPostPage.commentContent element contains the value This is an edited comment
And exploreThisPostPage.commentAuthor element contains the value randomUsername
And exploreThisPostPage.commentsCount element contains the value 1 Comments
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present