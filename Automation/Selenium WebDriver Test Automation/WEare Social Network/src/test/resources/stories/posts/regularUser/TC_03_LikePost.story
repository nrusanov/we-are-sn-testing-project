Meta:
@regularUser
@posts
@userPostFunctionality

Narrative:
As a regular user
I want to like my own public post
So that a public post is liked

Scenario: Like my own public post as a regular user
Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And exploreThisPostPage.postAuthor element contains the value RandomUsername
And exploreThisPostPage.postContent element contains the value This is an edited public post
And exploreThisPostPage.likeButton element is present
And I click exploreThisPostPage.likeButton element
Then exploreThisPostPage.dislikeButton element is present
And exploreThisPostPage.likeCount element contains the value Likes: 1
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present