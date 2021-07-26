Meta:
@regularUser
@posts
@userPostFunctionality

Narrative:
As a regular user
I want to edit my own public post
So that a public post is edited

Scenario: Edit my own public post as a regular user
Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
And homePage.navigationBar.LatestPosts element is present
When I click homePage.navigationBar.LatestPosts element
And browsedPosts.exploreThisPostButton element is present
And I click browsedPosts.exploreThisPostButtonn element
And exploreThisPostPage.editPostButton element is present
And I click exploreThisPostPage.editPostButton element
And editPostPage.postVisibilityDropDown element is present
And I select editPostPage.publicPostOption from editPostPage.postVisibilityDropDown dropdown
And editPostPage.editPostTextArea element is present
And I type This is an edited public post in editPostPage.editPostTextArea field
And editPostPage.savePostButton element is present
And I click editPostPage.savePostButton element
Then exploreThisPostPage.postAuthor element is present
And exploreThisPostPage.postAuthor element contains the value randomUsername
And exploreThisPostPage.postContent element is present
And exploreThisPostPage.postContent element contains the value This is an edited public post
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present