# **"Latest post" page**

## Test case 48

* **Title:** Unregistered user should be able to see all public posts
* **Description:** Verify that an unregistered user is able to to see all public posts of the registered users on the "Latest post" page.
* **Narrative:** As an unregistered user I want to be able to see all public posts
* **Priority:** High
* **Pre-condition:** Application is running. То have at least one posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
* **Expected result:** To be displayed all public posts to site users.

## Test case 49

* **Title:** Unregistered user should be able to see all public posts in a chronological order
* **Description:** Verify that an unregistered user is able to to see all public posts in a chronological order of the registered users on the "Latest post" page.
* **Narrative:** As an unregistered user I want to be able to see all public posts in a chronological order.
* **Priority:** Medium
* **Pre-condition:** Application is running. То have at least a few posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
* **Expected result:** To be displayed all public posts to site users in a chronological order.

## Test case 50

* **Title:** Unregistered user should be able to filter all public posts by professional category
* **Description:** Verify that an unregistered user is able to filter all public posts by professional category of the registered users on the "Latest post" page.
* **Narrative:**  As an unregistered user I want to be able to filter all public posts.
* **Priority:** High
* **Pre-condition:** Application is running. To have several posts from users with the same professional category.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. From the dropdown menu in "Explory Category" section choose a professional category;
   * 3. Click on "Browse" button
* **Expected result:** To be displayed all public posts of registered users with the respective category.

## Test case 51

* **Title:** Unregistered user should be able to see all filtered public posts by professional category in a chronological order
* **Description:** Verify that an unregistered user is able to see all filtered public posts by professional category in a chronological order of the registered users on the "Latest post" page.
* **Narrative:**  As an unregistered user I want to be able to see all filtered public posts in a chronological order.
* **Priority:** Medium
* **Pre-condition:** Application is running. To have several posts from users with the same professional category.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. From the dropdown menu in "Explory Category" section choose a professional category;
   * 3. Click on "Browse" button
* **Expected result:** To be displayed all filtered public posts in a chronological order of registered users with the respective category.

## Test case 52

* **Title:** Unregistered user should be able to explore a user post on a registered user
* **Description:** Verify that an unregistered user is able to explore a user post on a registered user and see the comments in it
* **Narrative:** As an unregistered user I want to be able to explore a user post on a registered user
* **Priority:** High
* **Pre-condition:** Application is running. То have at least one posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. Choose one of the users posts and click on "Explore this post" button;
   * 3. Scroll down to the "Show Comments" button and click on it
* **Expected result:** To be displayed all content of the post, as well as comments, if any.

## Test case 53

* **Title:** Unregistered user should be able to see all public posts of the selected user
* **Description:** Verify that an unregistered user is able to see all public posts of the selected user.
* **Narrative:** As an unregistered user I want to be able to see all public posts of the selected user.
* **Priority:** Medium
* **Pre-condition:** Application is running. То have at least a few posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. Choose one of the users posts and click on "Explore this post" button;
   * 3. Navigate to the "All posts of this user" button, which is located to the right below the header.
* **Expected result:** To be displayed all public posts of the selected user.

## Test case 54

* **Title:** Unregistered user cannot like a post (negative)
* **Description:** Verify that an unregistered user is not able to like a users posts.
* **Narrative:** As an unregistered user I am not able to like a users posts.
* **Priority:** High
* **Pre-condition:** Application is running. То have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. Choose one of the users posts and click on "Like" button;
* **Expected result:** The unregistered user cannot press the "Like" button.

## Test case 55

* **Title:** Unregistered user cannot dislike a post (negative)
* **Description:** Verify that an unregistered user is not able to dislike an already liked users posts.
* **Narrative:** As an unregistered user I am not able to dislike a users posts.
* **Priority:** High
* **Pre-condition:** Application is running. То have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. Choose one of the users posts and click on "Like" button;
* **Expected result:** The unregistered user cannot press the "Dislike" button, because there was no way to like the post before.

## Test case 56

* **Title:** Unregistered user cannot comment a post (negative)
* **Description:** Verify that an unregistered user is not able to comment a users posts.
* **Narrative:** As an unregistered user I am not able to comment a users posts.
* **Priority:** High
* **Pre-condition:** Application is running. То have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/posts;
   * 2. Choose one of the users posts and click on "Comment" button;
* **Expected result:** The unregistered user cannot press the "Comment" button.