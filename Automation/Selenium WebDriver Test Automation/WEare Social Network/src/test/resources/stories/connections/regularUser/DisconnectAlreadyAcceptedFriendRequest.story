!-- Meta:
!-- @regularUser
!-- @connections
!-- @userConnectFunctionality
!--
!-- Narrative:
!-- As a regular user
!-- I want to disconnect an already accepted friendship
!-- So that i
!--
!-- Scenario: A regular user disconnect an already accepted friendship
!-- Given I type randomUsername in loginPage.usernameField field
!-- And I type Neptunus_21 in loginPage.passwordField field
!-- And I click loginPage.loginButton element
!-- And homePage.navigationBar.logOutButton element is present
!-- When I type Dentist in homePage.professionalCategoryField field
!-- And I click homePage.searchButton element
!-- And homePage.assertNames element contains the value Team NeptunusTwo
!-- And I click searchPage.seeProfileButton element
!-- And I click personalProfilePage.disconnectButton element
!-- Then personalProfilePage.connectButton element is present
!-- And I click homePage.navigationBar.logOutButton element
!-- And homePage.navigationBar.signInButton element is present