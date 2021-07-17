# **"Latest post" page**

## Test case 83

* **Title:** Admin should be able to see all public and private posts
* **Narrative:** As an admin I want to be able to see all public and private posts
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have a few posts created.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
* **Expected result:** To be displayed all public and private posts of users on the site.

## Test case 84

* **Title:** Admin should be able to see all public and private posts in a chronological order
* **Narrative:** As an admin I want to be able to see all public and private posts in a chronological order.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have a few posts created.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
* **Expected result:** To be displayed all public and private posts of users on the site in a chronological order.

## Test case 85

* **Title:** Admin should be able to filter all public posts by professional category
* **Narrative:**  As an admin I want to be able to filter all public posts by professional category.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have a few posts from users with the same professional category.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. From the dropdown menu in "Explory Category" section choose a professional category;
   * 6. Click on "Browse" button
* **Expected result:** To be displayed all public posts of registered users with the respective category.

## Test case 86

* **Title:** Admin should be able to see all filtered public posts by professional category in a chronological order
* **Narrative:**  As an admin I want to be able to see all filtered public posts by professional category in a chronological order.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have a few posts from users with the same professional category.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. From the dropdown menu in "Explory Category" section choose a professional category;
   * 6. Click on "Browse" button
* **Expected result:** To be displayed all filtered public posts in a chronological order of registered users with the respective category.

## Test case 87

* **Title:** Admin should be able to explore a user public post 
* **Narrative:** As an admin I want to be able to explore a user public post and see the comments in it.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user is registered and logged in. Must have at least one public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. Find the public post and click on "Explore this post" button;
   * 6. Scroll down to the "Show Comments" button and click on it
* **Expected result:** To be displayed all content of the post, as well as comments, if any.

## Test case 88

* **Title:** Admin should be able to explore a user private post 
* **Narrative:** As an admin I want to be able to explore a user private post and see the comments in it.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user is registered and logged in. Must have at least one private posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. Find the private post and click on "Explore this post" button;
* **Expected result:** To be displayed all content of the post, as well as comments, if any.

## Test case 89

* **Title:** Admin should be able to see all public posts of the selected user
* **Narrative:** As an admin I want to be able to see all public posts of the selected user.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have at least a few public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. Choose one of the users posts and click on "Explore this post" button;
   * 6. Navigate to the "All posts of this user" button, which is located to the right below the header.
* **Expected result:** To be displayed all public posts of the selected user.

## Test case 90

* **Title:** Admin should be able to see all private posts of the selected user
* **Narrative:** As an admin I want to be able to see all private posts of the selected user.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. Must have at least a few private posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest posts" link, which is located in the header menu;
   * 5. Choose one of the users private posts and click on "Explore this post" button;
* **Expected result:** To be displayed all private posts of the selected user.






