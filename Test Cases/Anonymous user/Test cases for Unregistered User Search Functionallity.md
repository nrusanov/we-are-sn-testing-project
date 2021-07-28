# **Unregistered user**  

## Test case 55

* **Title:** Search boxes should be present on home page
* **Description:** Verify that the search form for profiles searching at least by name and/or email is present.
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
* **Expected result:** Search form should appear, in which at least a field for searching by name and/or email is present.

## Test case 56

* **Title:** Search should display results for specific user by entering professional category, First name and Last name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category, First name and Last name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** For professional category: painter; for First and last names: Test User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'Test User';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile'.

## Test case 57

* **Title:** Search should display results for specific user/s entering professional category and First name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category and First name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** For professional category: painter; for First name: Test
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'Test';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 58

* **Title:** Search should display results for specific user/s entering professional category and Last name
* **Description:** Verify that the search form displays correct results when a search citeria for professional category and Last name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** For professional category: painter; for Last name: User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. In the second search box fill in: 'User';
   * 4. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 59

* **Title:** Search should display results in chronological order depending on date of registration by searching professional category
* **Description:** Verify that the search form displays correct results when a search citeria for professional category is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High	
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** For professional category: painter; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the first search box fill in: 'painter';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.
* **Executed by automation tool:** Postman

## Test case 60

* **Title:** Search should display results for specific user/s entering First name
* **Description:** Verify that the search form displays correct results when a search citeria for First name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for First name: Test; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'Test';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 61

* **Title:** Search should display results for specific user by entering First name and Last Name
* **Description:** Verify that the search form displays correct results when a search citeria for First name and Last name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for First and Last names: Test User
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'Test User';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile'.
* **Executed by automation tool:** Postman

## Test case 62

* **Title:** Search should display results for specific user/s entering Last name
* **Description:** Verify that the search form displays correct results when a search citeria for Last name is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for Last name: User; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. In the second search box fill in: 'User';
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 63

* **Title:** Unregistered user search for users profiles without entering any criteria
* **Description:** Verify that the page displays error message when no search criteria is set
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** None; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Leave the two search boxes blank;
   * 3. Click on button 'Search'
* **Expected result:** An error message saying that search criteria should be filled in should be displayed.
* **Executed by automation tool:** Postman

## Test case 64

* **Title:** Unregistered user should be able to paste a text into the search boxes
* **Description:** Verify that the user is able to paste text in the two search boxes
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** In Notepad: painter; Test User; 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Copy 'painter' from Notepad and paste it in the first search box.
   * 3. Copy 'Test User" from Notepad and paste it in the second search box.
* **Expected result:** The text intended for the two search boxes is displayed in them

## Test case 65

* **Title:** Unregistered user should be able to complete search queries using 'Enter' key
* **Description:** Verify that the user is able to complete search queries using 'Enter' key
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for professional category: 'painter'
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'painter' in the first search box;
   * 3. Press 'Enter' key
* **Expected result:** A result with the following user details should appear: profile picture, location, names, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 66

* **Title:** Search boxes should presents auto suggestions when the query is typed
* **Description:** Verify that the site presents a functionality for auto complete of search criteria
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Low
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for professional category: 'painter'; for First name; 'Test'
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Start typing 'paint' in the first search box;
   * 3. Start typing 'tes' in the first search box;
* **Expected result:** For first search box a pop-up with suggestion 'painter' should appear, for the second search box a pop-up with suggestion 'Test' should appear. User should be able to accept the suggestions with 'Enter' key.

## Test case 67

* **Title:** Search should display results for all categories when 'all' is typed
* **Description:** Verify that the site displays all users (no matter what their professional category is) when 'all' is typed in the search box for professional category
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for professional category: 'all';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'all' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A list of users with the following user details should appear: profile picture, location, names, professional category member since and a button 'See profile'. Users with all categories should be displayed, including the ones who chose all categories when registering or editing profile. 

## Test case 68

* **Title:** Search should display relevant results by searching by part of the profession
* **Description:** Verify that the site displays all relevant users when only part of the professional category is written in the search box
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for professional category: 'paint';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'paint' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, professional category: 'Painter', member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 69

* **Title:** Search should display relevant results by searching by part of the First name
* **Description:** Verify that the site displays all relevant users when only part of the First name is written in the search box
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for First name: Tes';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'Tes' in the second search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: the names should include: "Test" as a first name, professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 70

* **Title:** Search should display relevant results by searching by part of the Last name
* **Description:** Verify that the site displays all relevant users when only part of the Last name is written in the search box
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for Last name: 'Use';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'Use' in the second search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: the names should include: "User" as a last name, professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 71

* **Title:** Search boxes should not allow filling in with more than allowable symbols
* **Description:** Verify that the two search boxes doesn't allow filling in with more than 255 symbols
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for the first search box: any text with 256 symbols; for the second search box: any text with 256 symbols
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Try to type any text with 255 and 256 symbols in the first search box;
   * 3. Try to type any text with 255 and 256 symbols in the second search box;
   * 4. Click on button 'Search'
* **Expected result:** Each search box should not allow typing more than 255 symbols in it

## Test case 72

* **Title:** A successfull search should be possible to complete ignoring upper case in the first search box
* **Description:** Verify that the first search box allows searching users ignoring upper case. 
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for the first search box: 'PaInTeR';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'PaInTeR' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names, professional category: 'Painter', member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 73

* **Title:** A successfull search should be possible to complete ignoring upper case in the second search box
* **Description:** Verify that the second search box allows searching users ignoring upper case. 
* **Narrative:** As Unregistered user I want to be able to search for profiles in the site using various search criteria.
* **Priority:** Medium
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for the second search box: 'TeSt';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'TeSt' in the first search box;
   * 3. Click on button 'Search'
* **Expected result:** A result with the following user details should appear: profile picture, location, names: containing 'Test', professional category, member since and a button 'See profile' / or a list of users, each of them having the above properties.

## Test case 74

* **Title:** User should be authenticated in order to see other profiles
* **Description:** Verify that the page requires login when a guest/unregistered user try to see an existing user's profile. 
* **Narrative:** As Unregistered user I want to be able to see registered user's profiles.
* **Priority:** High
* **Pre-condition:** Application is running. Docker Desktop is running and site is open through localhost.
* **Test data:** for the first search box: 'painter';
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Type 'painter' in the first search box;
   * 3. Click on button 'Search'
   * 4. For the first user in the list click on button 'See Profile'
* **Expected result:** A new page should be loaded with login form, requiring username and password entry.