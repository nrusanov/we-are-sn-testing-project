# **Admin search functionality**

## Test case 106

* **Title:** Search boxes should be present on home page
* **Description:** Verify that the search form for profiles searching at least by name and/or email is present.
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
* **Expected result:** Search form should appear, in which at least a field for searching by name and/or email is present.

## Test case 107

* **Title:** Search should display results for specific user by entering professional category, First name and Last name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category, First name and Last name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: painter; for First and last names: Test User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'Test User';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile'.

## Test case 108

* **Title:** Search should display results for specific user/s entering professional category and First name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category and First name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com.For professional category: painter; for First name: Test
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'Test';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 109

* **Title:** Search should display results for specific user/s entering professional category and Last name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category and Last name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com.For professional category: painter; for Last name: User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'User';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 110

* **Title:** Search should display results in chronological order depending on date of registration by searching professional category
* **Description:** Verify that the search form displays correct results when a search citeria for professional category is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: painter; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.
* **Executed by automation tool:** Selenium WebDriver

## Test case 111

* **Title:** Search should display results for specific user/s entering First name
* **Description:** Verify that the search form displays correct results when a search citeria for First name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For First name: Test; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'Test';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 112

* **Title:** Search should display results for specific user by entering First name and Last Name
* **Description:** Verify that the search form displays correct results when a search citeria for First name and Last name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For First and Last names: Test User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'Test User';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile'.
* **Executed by automation tool:** Selenium WebDriver

## Test case 113

* **Title:** Search should display results for specific user/s entering Last name
* **Description:** Verify that the search form displays correct results when a search citeria for Last name is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For Last name: User; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'User';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 114

* **Title:** Admin searches for users profiles without entering any criteria
* **Description:** Verify that the page displays error message when no search criteria is set
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Leave the two search boxes blank;
   * 3. Click on button 'Search'
* **Expected result:** An error message saying that search criteria should be filled in should be displayed.

## Test case 115

* **Title:** Admin should be able to paste a text into the search boxes
* **Description:** Verify that the admin is able to paste text in the two search boxes
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. In Notepad: painter; Test User; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Copy 'painter' from Notepad and paste it in the first search box.
   * 3. Copy 'Test User" from Notepad and paste it in the second search box.
* **Expected result:** The text intended for the two search boxes is displayed in them

## Test case 116

* **Title:** Admin should be able to complete search queries using 'Enter' key
* **Description:** Verify that the admin is able to complete search queries using 'Enter' key
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: 'painter'
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'painter' in the first search box;
   * 3. Press 'Enter' key
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 117

* **Title:** Search boxes should presents auto suggestions when the query is typed
* **Description:** Verify that the site presents a functionality for auto complete of search criteria
* **Narrative:** As admin user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Low
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: 'painter'; for First name: 'Test'
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Start typing 'paint' in the first search box;
   * 3. Start typing 'tes' in the first search box;
* **Expected result:** For first search box a pop-up with suggestion 'painter' should appear, for the second search box a pop-up with suggestion 'Test' should appear. User should be able to accept the suggestions with 'Enter' key.

## Test case 118

* **Title:** Search should display results for all categories when 'all' is typed
* **Description:** Verify that the site displays all users (no matter what their professional category is) when 'all' is typed in the search box for professional category
* **Narrative:** As admin user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: 'all';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'all' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A list of users with the following user details should appear: profile picture, location, names, professional category member since and a button 'See profile'. Users with all categories should be displayed, including the ones who chose all categories when registering or editing profile. 

## Test case 119

* **Title:** Search should display relevant results by searching by part of the profession
* **Description:** Verify that the site displays all relevant users when only part of the professional category is written in the search box
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For professional category: 'paint';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'paint' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, professional category: 'Painter', member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 120

* **Title:** Search should display relevant results by searching by part of the First name
* **Description:** Verify that the site displays all relevant users when only part of the First name is written in the search box
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For First name: Tes';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'Tes' in the second search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: the names should include: "Test" as a first name, professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 121

* **Title:** Search should display relevant results by searching by part of the Last name
* **Description:** Verify that the site displays all relevant users when only part of the Last name is written in the search box
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For Last name: 'Use';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'Use' in the second search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: the names should include: "User" as a last name, professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 122

* **Title:** Search boxes should not allow filling in with more than allowable symbols
* **Description:** Verify that the two search boxes doesn't allow filling in with more than 255 symbols
* **Narrative:** As admin user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For the first search box: any text with 256 symbols; for the second search box: any text with 256 symbols
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Try to type any text with 256 symbols in the first search box;
   * 3. Try to type any text with 256 symbols in the second search box;
   * 4. Click on button 'Search'
* **Expected result:** Each search box should not allow typing more than 255 symbols in it

## Test case 123

* **Title:** A successfull search should be possible to complete ignoring upper case in the first search box
* **Description:** Verify that the first search box allows searching users ignoring upper case. 
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For the first search box: 'PaInTeR';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'PaInTeR' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, professional category: 'Painter', member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 124

* **Title:** A successfull search should be possible to complete ignoring upper case in the second search box
* **Description:** Verify that the second search box allows searching users ignoring upper case. 
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For the second search box: 'TeSt';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'TeSt' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: containing 'Test', professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 125

* **Title:** Admin could see other users profiles
* **Description:** Verify that logged in admin could see other users after successfull search query.
* **Narrative:** As admin I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. The admin must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: adminNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com. For the first search box: 'painter';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'painter' in the first search box;
   * 3. Click on button 'Search'
   * 4. For the first user in the list click on button 'See Profile'
* **Expected result:** A new page should be loaded with the user detals and a 'disable' button should be present.