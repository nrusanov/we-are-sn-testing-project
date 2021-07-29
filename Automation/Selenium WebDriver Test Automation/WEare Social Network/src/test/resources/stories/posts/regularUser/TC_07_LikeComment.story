Meta:
@regularUser
@comments
@userLikesComment

Narrative:
As a regular user
I want to like my own comment my own public post
So that a comment on public post is liked

Lifecycle:
Before:
Scope: STORY
Given I type randomUsername in usernameField field
When I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present

Scenario: Edit my own comment my own public post as a regular user
Given homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.showCommentsButton element is present
And I click exploreThisPostPage.showCommentsButton element
And exploreThisPostPage.likeButton element is present
And I click exploreThisPostPage.likeButton element
Then exploreThisPostPage.likeCount element is present
And exploreThisPostPage.likeCount element contains the value Likes: 1
And exploreThisPostPage.dislikeButton element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present