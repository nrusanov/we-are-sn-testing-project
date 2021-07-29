Meta:
@admin
@comments
@adminLikesComment

Narrative:
As an admin
I want to like my own comment my own public post
So that a comment on public post is liked

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
And exploreThisPostPage.likeButton element is present
And I click exploreThisPostPage.likeButton element
Then exploreThisPostPage.likeCount element contains the value Likes: 1
And exploreThisPostPage.dislikeButton element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present