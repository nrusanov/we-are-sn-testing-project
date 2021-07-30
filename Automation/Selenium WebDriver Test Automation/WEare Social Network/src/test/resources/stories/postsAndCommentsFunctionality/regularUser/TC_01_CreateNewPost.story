Meta:
@regularUser
@posts
@userNewPublicPostCreation

Narrative:
As a regular user
I want to create a new public post
So that a public post is created


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
When I type randomUsername in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Create a new public post as a regular user
Given homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.createPost element
And I select Public post from visibilityDropDownMenu dropdown
And I type Hello Selenium WebDriver! in textArea field
And I click createPostPage.savePostButton element
Then createPostPage.createdPost element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present
