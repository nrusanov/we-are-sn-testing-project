Meta:
@regularUser
@comments
@userEditComment

Narrative:
As a regular user
I want to edit my own comment my own public post
So that a comment on public post is edited

Lifecycle:
Before:
Scope: STORY
Given I type randomUsername in usernameField field
When I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Edit my own comment my own public post as a regular user
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And I scroll down in bodyOfSite
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
And I click exploreThisPostPage.editCommentButton element
And I type This is an edited comment in textArea field
And I click editCommentPage.editCommentButton element
And I click textArea element
And I scroll up in textArea
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
Then exploreThisPostPage.editedCommentContent element contains the value This is an edited comment
And exploreThisPostPage.commentAuthor element contains the value randomUsername
And exploreThisPostPage.commentsCount element contains the value 1 Comments
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present