Meta:
@regularUser
@posts
@userPostFunctionality
@edit

Narrative:
As a regular user
I want to edit my own public post
So that a public post is edited

Scenario: Edit my own public post as a regular user
Given I type randomUsername in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
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
Then editPostPage.postAuthor element contains the value RandomUsername
And editPostPage.postContent element contains the value This is an edited public post
And I click homePage.weAreButton element
!-- And I type keys.Home in exploreThisPostPage.font field
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present