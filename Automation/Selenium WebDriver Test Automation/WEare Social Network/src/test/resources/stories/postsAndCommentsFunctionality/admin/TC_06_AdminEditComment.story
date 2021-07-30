Meta:
@admin
@comments
@adminEditComment

Narrative:
As an admin
I want to edit my own comment my own public post
So that a comment on public post is edited

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
Given homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And I click bodyOfSite element
And I scroll down in bodyOfSite
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
And exploreThisPostPage.editCommentButton element is present
And I click exploreThisPostPage.editCommentButton element
And textArea element is present
And I type This is an edited comment in textArea field
And I click editCommentPage.editCommentButton element
And I click textArea element
And I scroll up in textArea
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
Then exploreThisPostPage.editedCommentContent element contains the value This is an edited comment
And exploreThisPostPage.commentAuthorAdmin element contains the value adminRandom
And exploreThisPostPage.commentsCount element contains the value 1 Comments
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present