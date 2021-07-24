Meta:
@userSearchFunctionality

Narrative:
As a regular user
I want to search for a user profile by professional category
So that i can interact with him


Scenario: Search for a user profile as a regular user
Given I type Dentist in homePage.professionalCategoryField field
When I click homePage.searchButton element
Then homePage.assertNames element contains the value Team NeptunusTwo
And homePage.assertProfessionalCategory element contains the value Dentist
And I click homePage.navigationBar.logOutButton element
And homePage.navigationBar.signInButton element is present