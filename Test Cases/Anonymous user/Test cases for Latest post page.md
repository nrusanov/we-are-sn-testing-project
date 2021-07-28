# **"Latest post" page**

## Test case 75

* **Title:** Unregistered user should be able to see all public posts
* **Narrative:** As an unregistered user I want to be able to see all public posts
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have at least one post created.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
* **Expected result:** To be displayed all public posts to site users.

## Test case 76

* **Title:** Unregistered user should be able to see all public posts in a chronological order
* **Narrative:** As an unregistered user I want to be able to see all public posts in a chronological order.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. Must have a few posts created.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
* **Expected result:** To be displayed all public posts to site users in a chronological order.

## Test case 77

* **Title:** Unregistered user should be able to filter all public posts by professional category
* **Narrative:**  As an unregistered user I want to be able to filter all public posts by professional category.
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have a few posts from users with the same professional category.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
    * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. From the dropdown menu in "Explory Category" section choose a professional category;
   * 3. Click on "Browse" button
* **Expected result:** To be displayed all public posts of registered users with the respective category.

## Test case 78

* **Title:** Unregistered user should be able to see all filtered public posts by professional category in a chronological order
* **Narrative:**  As an unregistered user I want to be able to see all filtered public posts  by professional category in a chronological order.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. Must have a few posts from users with the same professional category.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. From the dropdown menu in "Explory Category" section choose a professional category;
   * 3. Click on "Browse" button
* **Expected result:** To be displayed all filtered public posts in a chronological order of registered users with the respective category.

## Test case 79

* **Title:** Unregistered user should be able to explore a user post on a registered user
* **Narrative:** As an unregistered user I want to be able to explore a user post on a registered user and see the comments in it.
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have at least one posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. Choose one of the users posts and click on "Explore this post" button;
   * 3. Scroll down to the "Show Comments" button and click on it
* **Expected result:** To be displayed all content of the post, as well as comments, if any.

## Test case 80

* **Title:** Unregistered user should be able to see all public posts of the selected user
* **Narrative:** As an unregistered user I want to be able to see all public posts of the selected user.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. Must have at least a few posts.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. Choose one of the users posts and click on "Explore this post" button;
   * 3. Navigate to the "All posts of this user" button, which is located to the right below the header.
* **Expected result:** To be displayed all public posts of the selected user.

## Test case 81

* **Title:** Unregistered user cannot like a post (negative)
* **Narrative:** As an unregistered user I want to get a proper error message when I try to like a users posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. Choose one of the users posts and click on "Like" button;
* **Expected result:** The unregistered user cannot press the "Like" button.

## Test case 82

* **Title:** Unregistered user cannot dislike a post (negative)
* **Narrative:** As an unregistered user I want to get a proper error message when I try to dislike an already liked users posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. Choose one of the users posts and click on "Like" button;
* **Expected result:** The unregistered user cannot press the "Dislike" button, because there was no way to like the post before.

## Test case 83

* **Title:** Unregistered user cannot comment a post (negative)
* **Narrative:** As an unregistered user I want to get a proper error message when I try to comment a users posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. Must have at least one post.
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
    * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Latest posts" link, which is located in the header menu;
   * 2. Choose one of the users posts and click on "Comment" button;
* **Expected result:** The unregistered user cannot press the "Comment" button.