# **Post functionality**

## Test case 51

* **Title:** Admin should be able to create a new post
* **Description:** Verify that an admin is able to create a new post containing a discription and an atached file.
* **Narrative:** As an Admin I want to be able to create a post.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Create New post" link, which is located in the header menu;
   * 5. Scroll down to the "Create new post" section;
   * 6. Choose a post visibility;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on  "Choose file" button and upload a file;
   * 9. Click on "Save post" button
* **Expected result:** A new post is created, containing a description and a file;

## Test case 52

* **Title:** Admin should be able to create a new post without attached file
* **Description:** Verify that an admin is able to create a new post containing only discription.
* **Narrative:** As an Admin I want to be able to create a new post.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Create New post" link, which is located in the header menu;
   * 5. Scroll down to the "Create new post" section;
   * 6. Choose a post visibility;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on "Save post" button
* **Expected result:** A new post is created, containing only description.

## Test case 53

* **Title:** Admin cannot create a new post with more than the allowable characters (negative)
* **Description:** Verify that an admin is not able to create a new post containing more than the allowable characters (1000) in the "Message" field.
* **Narrative:** As an Admin I would like to get a proper error when I try to create a new post with more than 1000 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Create New post" link, which is located in the header menu;
   * 5. Scroll down to the "Create new post" section;
   * 6. Choose a post visibility;
   * 7. Fill in the "Message" field with  more than 1000 characters;
   * 8. Click on  "Choose file" button and upload a picture;
   * 9. Click on "Save post" button
* **Expected result:** Post is not created.  A pop-up error message appears stating that the "Message" field cannot contain more than the 1000 characters.

## Test case 54

* **Title:** Admin cannot create a new post with less than the allowable characters (negative)
* **Description:** Verify that an admin is not able to create a new post containing less than the allowable character (1) in the "Message" field.
* **Narrative:** As an Admin I would like to get a proper error when I try to create a new post with less than 1 character.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Create New post" link, which is located in the header menu;
   * 5. Scroll down to the "Create new post" section;
   * 6. Choose a post visibility;
   * 7. Fill in the "Message" field with less than 1 character;
   * 8. Click on  "Choose file" button and upload a picture;
   * 9. Click on "Save post" button
* **Expected result:** Post is not created.  A pop-up error message appears stating that the "Message" field cannot contain less than the 1 character.

## Test case 55

* **Title:** Admin cannot create a blank post (negative)
* **Description:** Verify that an admin is not able to create a blank post.
* **Narrative:** As an Admin I would like to get a proper error when I try to create a blank post.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Create New post" link, which is located in the header menu;
   * 5. Scroll down to the "Create new post" section;
   * 6. Choose a post visibility;
   * 7. Leave the "Message" field blank;
   * 8. Click on "Save post" button
* **Expected result:** Post is not created.  A pop-up error message appears stating that the post cannot be published without discription. 

## Test case 56

* **Title:** Admin should be able to edit his own post
* **Description:** Verify that an admin is able to edit his own post.
* **Narrative:** As an Admin I want to be able to edit my own post.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The admin must have created at least one post.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Edit" button, which is located to the right of the post;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on "Save post" button
* **Expected result:** Тhe post is edited containing a new description.

## Test case 57

* **Title:** Admin should be able to delete his own post
* **Description:** Verify that an admin is able to delete his own post.
* **Narrative:** As an Admin I want to be able to delete my own post.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered, logged in and must have created at least one post.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
  * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Delete post" button;
   * 7. Choose "Delete post" from the dropdown menu;
   * 8. Click on "Submit" button
* **Expected result:** The post is successfully deleted.

## Test case 58

* **Title:** Admin should be able to like his own post
* **Description:** Verify that an admin is able to like his own post.
* **Narrative:** As an Admin I want to be able to like my own post.
* **Priority:** High
* **Pre-condition:**  The docker must be set up. The admin must be registered, logged in and must have created at least one post.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "All posts of this user", whis is located to the right of the post;
   * 7. Find the post and click on the "Like" button;
* **Expected result:** The post is liked.

## Test case 59

* **Title:** Admin should be able to dislike his own post
* **Description:** Verify that an admin is able to dislike his own post.
* **Narrative:** As an Admin I want to be able to dislike my own post.
* **Priority:** High
* **Pre-condition:**  The docker must be set up. The admin must be registered, logged in and must have created at least one post, that he already liked.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "All posts of this user", whis is located to the right of the post;
   * 7. Find the liked post and click on the "Dislike" button;
* **Expected result:** The post is disliked.

## Test case 60

* **Title:** Admin should be able to edit other users public posts
* **Description:** Verify that an admin is able to edit other users public posts.
* **Narrative:** As an Admin I want to be able to edit other users public posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one public of them;
   * 6. Click on "Explore this post" button;
   * 7. Click on "Edit post" button, which is located to the right of the post;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on "Save post" button
* **Expected result:** Тhe other user public post is edited containing a new description.

## Test case 61

* **Title:** Admin should be able to delete other users public posts
* **Description:** Verify that an admin is able to delete other users public posts.
* **Narrative:** As an Admin I want to be able to delete other users public posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
  * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one public of them;
   * 6. Click on "Explore this post" button;
   * 7. Click on "Delete post" button;
   * 8. Choose "Delete post" from the dropdown menu;
   * 9. Click on "Submit" button
* **Expected result:** The public post of the other user is successfully deleted.

## Test case 62

* **Title:** Admin should be able to like other users public posts
* **Description:** Verify that an admin is able to like other users public posts.
* **Narrative:** As an Admin I want to be able to like other users public posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one public of them;
   * 6. Click on the "Like" button;
* **Expected result:** The post is liked.

## Test case 63

* **Title:** Admin should be able to dislike other users public posts
* **Narrative:** As an Admin I want to be able to dislike other users public posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few public posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one public of them;
   * 6. Find the liked post and click on the "Dislike" button;
* **Expected result:** The post is disliked.

## Test case 64

* **Title:** Admin should be able to edit other users private posts
* **Narrative:** As an Admin I want to be able to edit other users private posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few private posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one private of them;
   * 6. Click on "Explore this post" button;
* **Expected result:** Тhe other user private post is edited containing a new description.

## Test case 65

* **Title:** Admin should be able to delete other users private posts
* **Narrative:** As an Admin I want to be able to delete other users private posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few private posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
  * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one private of them;
   * 6. Click on "Explore this post" button;
* **Expected result:** The private post of the other user is successfully deleted.

## Test case 66

* **Title:** Admin should be able to like other users private posts
* **Narrative:** As an Admin I want to be able to like other users private posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created a few private posts.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one private of them;
   * 6. Click on the "Like" button;
* **Expected result:** The post is liked.








