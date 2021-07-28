Meta:
@admin
@posts
@adminPostFunctionality

Narrative:
As an admin
I want to create a new public post
So that a public post is created


Lifecycle:
Before:
Scope: STORY
Given I click homePage.navigationBar.signInButton element
And homePage.navigationBar.signInButton element is present
When I type adminRandom in usernameField field
And I type Neptunus_21 in passwordField field
And I click loginPage.loginButton element
Then homePage.navigationBar.logOutButton element is present

Scenario: Create a new public post as an admin
Given homePage.navigationBar.logOutButton element is present
When I click homePage.navigationBar.createPost element
And I select Public post from visibilityDropDownMenu dropdown
And I type Hello Selenium WebDriver! in textArea field
!-- And I upload C:\Users\Lenovo\Desktop\Neptunus Final Project\neptunus-final-project\Automation\Selenium WebDriver Test Automation\WEare Social Network\src\test\resources\images\QA.png in createPostPage.chooseFileButton
And I click createPostPage.savePostButton element
Then createPostPage.createdPost element is present
And I click homePage.weAreButton element
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present