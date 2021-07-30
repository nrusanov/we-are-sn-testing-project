Meta:
@admin
@posts
@adminEditPublicPost

Narrative:
As an admin
I want to edit my own public post
So that a public post is edited


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Edit my own public post as an admin
Given homePage.navigationBar.logOutButton element is present
When homePage.navigationBar.LatestPosts element is present
And I click homePage.navigationBar.LatestPosts element
And I scroll down in bodyOfSite
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButton element
And exploreThisPostPage.editPostButton element is present
And I click exploreThisPostPage.editPostButton element
And visibilityDropDownMenu element is present
And I select Public post from visibilityDropDownMenu dropdown
And textArea element is present
And I type This is an edited public post in textArea field
And editPostPage.savePostButton element is present
And I click editPostPage.savePostButton element
Then editPostPage.postAuthorAdmin element contains the value adminRandom
And editPostPage.postContent element contains the value This is an edited public post
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present