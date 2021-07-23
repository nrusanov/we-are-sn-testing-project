Meta:
@userPostFunctionality

Narrative:
As a regular user
I want to create a new public post
So that a public post is created

Scenario: Create a new public post as a regular user
Given I open Crete New Post page
When I select public visibility from the dropdown menu
And I type the text "Hello Selenium WebDriver!" in the body field
And I upload a image in the post
And I click on 'Save post' button
Then A public post is created, containing a body and an image



