Meta:
@regularUser
@posts
@userDislikePublicPost

Narrative:
As a regular user
I want to dislike my own already liked public post
So that a public post is disliked


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type randomUsername in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Like my own public post as a regular user
Given homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And exploreThisPostPage.postAuthor element is present
And exploreThisPostPage.postAuthor element contains the value randomUsername
And exploreThisPostPage.postContent element is present
And exploreThisPostPage.postContent element contains the value This is an edited public post
And exploreThisPostPage.dislikeButton element is present
And I click exploreThisPostPage.dislikeButton element
Then exploreThisPostPage.likeButton element is present
And exploreThisPostPage.dislikeCount element contains the value Likes: 0
And I click exploreThisPostPage.seeProfileButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present