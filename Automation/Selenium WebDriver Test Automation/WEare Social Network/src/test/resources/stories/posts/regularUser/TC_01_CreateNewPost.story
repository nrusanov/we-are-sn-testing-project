Meta:
@regularUser
@posts
@userPostFunctionality

Narrative:
As a regular user
I want to create a new public post
So that a public post is created

Scenario: Create a new public post as a regular user
Given I type randomUsername in loginPage.usernameField field
And I type Neptunus_21 in loginPage.passwordField field
And I click loginPage.loginButton element
And homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.createPost element
And I select Public post from createPostPage.postVisibilityDropDown dropdown
And I type Hello Selenium WebDriver! in createPostPage.bodyField field
And I upload a C:\\Users\\Lenovo\\Desktop\\Neptunus Final Project\\neptunus-final-project\\Automation\\Selenium WebDriver Test Automation\\Data\\QA.png in createPostPage.chooseFileButton
And I click createPostPage.savePostButton element
Then createPostPage.createdPost element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present