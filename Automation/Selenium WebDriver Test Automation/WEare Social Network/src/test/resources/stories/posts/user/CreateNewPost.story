Meta:
@posts
@userPostFunctionality

Narrative:
As a regular user
I want to create a new public post
So that a public post is created

Scenario: Create a new public post as a regular user
Given I click homePage.navigationBar.createPost element
When I select Public post from createPostPage.postVisibilityDropDown dropdown
And I type Hello Selenium WebDriver! in createPostPage.bodyField field
And I upload a C:\\Users\\Lenovo\\Desktop\\Neptunus Final Project\\neptunus-final-project\\Automation\\Selenium WebDriver Test Automation\\Data\\QA.png in createPostPage.chooseFileButton
And I click createPostPage.savePostButton element
Then createPostPage.createdPost element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present