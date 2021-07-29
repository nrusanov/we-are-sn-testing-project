Meta:
@admin
@posts
@adminLikePublicPost

Narrative:
As an admin user
I want to like my own public post
So that a public post is liked

Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Like my own public post as an admin
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And explore.postAuthorAdmin element contains the value adminRandom
And exploreThisPostPage.postContent element contains the value This is an edited public post
And exploreThisPostPage.likeButton element is present
And I click exploreThisPostPage.likeButton element
Then exploreThisPostPage.dislikeButton element is present
And exploreThisPostPage.likeCount element contains the value Likes: 1
And I click exploreThisPostPage.seeProfileButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present