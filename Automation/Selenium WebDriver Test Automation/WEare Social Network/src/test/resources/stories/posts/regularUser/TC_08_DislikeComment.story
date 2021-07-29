Meta:
@regularUser
@comments
@userDislikesComment

Narrative:
As a regular user
I want to dislike my own comment my own public post
So that a comment on public post is disliked

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
And exploreThisPostPage.dislikeButton element is present
And I click exploreThisPostPage.dislikeButton element
Then exploreThisPostPage.dislikeCount element is present
And exploreThisPostPage.dislikeCount element contains the value Likes: 0
And exploreThisPostPage.likeButton element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present