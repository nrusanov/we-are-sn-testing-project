# **Comment functionality**

## Test case 01

* **Title:** Admin should be able to post a new comment on his own post.
* **Description:** Verify that an admin is able to post a new comment containing a discription on his own post.
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
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on "Post Comment" button
* **Expected result:** A new comment containing a description is posted below the users post.

## Test case 02

* **Title:** Admin cannot post a new comment with more than the allowable characters (negative)
* **Description:** Verify that an admin is not able to post a new comment containing more than the allowable characters (1000) in the "Message" field.
* **Narrative:** As an Admin I would like to get a proper error when I try to post a new comment with more than 1000 characters.
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
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Fill in the "Message" field with more than 1000 characters;
   * 8. Click on "Post Comment" button
* **Expected result:** Comment is not created.  A pop-up error message appears stating that the "Message" field cannot contain more than the 1000 characters.

## Test case 03

* **Title:** Admin cannot post a new comment with less than the allowable characters (negative)
* **Description:** Verify that an admin is not able to post a new comment containing less than the allowable character (1) in the "Message" field.
* **Narrative:** As an Admin I would like to get a proper error when I try to post a new comment with less than 1 character.
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
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Fill in the "Message" field with less than 1 character;
   * 8.  Click on "Post Comment" button
* **Expected result:** Comment is not created.  A pop-up error message appears stating that the "Message" field cannot contain less than the 1 character.

## Test case 04

* **Title:** Admin cannot post a blank comment (negative)
* **Description:** Verify that an admin is not able to post a blank comment.
* **Narrative:** As an Admin I would like to get a proper error when I try to post a blank comment.
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
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Leave the "Message" field blank;
   * 8.  Click on "Post Comment" button
* **Expected result:** Comment is not posted. A pop-up error message appears stating that the comment cannot be published without discription. 

## Test case 05

* **Title:** Admin should be able to edit his own comment
* **Description:** Verify that an admin is able to edit his own comment.
* **Narrative:** As an Admin I want to be able to edit my own comment.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered, logged in and must have created at least one post and one comment in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Show Comments" button, whis is located under "Leave a comment" section;
   * 6. Click on "Edit comment" button;
   * 7. Fill in the "Message" field with a valid text (between 1-1000 characters, 1 lower case letter, 1 upper case letter, 1 numeric character, 1 special symbol, 1 Latin and 1 Cyrillic letter);
   * 8. Click on "Edit Comment" button
* **Expected result:** Тhe comment is edited containing a new description.

## Test case 06

* **Title:** Admin should be able to delete his own comment
* **Description:** Verify that an admin is able to delete his own comment.
* **Narrative:** As an Admin I want to be able to delete my own comment.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered, logged in and must have created at least one post and one comment in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Show Comments" button, whis is located under "Leave a comment" section;
   * 7. Click on "Delete comment" button;
   * 8. Choose "Delete comment" from the dropdown menu;
   * 9. Click on "Submit" button
* **Expected result:** The comment is successfully deleted.

## Test case 07

* **Title:** Admin should be able to like his own comment
* **Description:** Verify that an admin is able to like his own comment.
* **Narrative:** As an Admin I want to be able to like my own comment.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered, logged in and must have created at least one post and one comment in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Show Comments" button, whis is located under "Leave a comment" section;
   * 7. Click on "Like" button
* **Expected result:** The comment is liked.

## Test case 08

* **Title:** Admin should be able to dislike his own comment
* **Description:** Verify that an admin is able to dislike his own comment.
* **Narrative:** As an Admin I want to be able to dislike my own comment.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered, logged in and must have created at least one post and one comment in it, that he already liked.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Personal Profile" link, which is located in the header menu;
   * 5. Scroll down to the user post, whis is located below Recent Post and click on it;
   * 6. Click on "Show Comments" button, whis is located under "Leave a comment" section;
   * 7. Click on "Dislike" button
* **Expected result:** The comment is disliked.

## Test case 09

* **Title:** Admin should be able to post a comment on the other users posts
* **Description:** Verify that an admin is able to post a comment on the other users posts.
* **Narrative:** As an Admin I want to be able to post a comment on the other users posts.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created а few posts and a few comments in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one of them;
   * 6. Click on "Explore this post" button
* **Expected result:** A new comment containing a description is posted below the other user post.

## Test case 10

* **Title:** Admin should be able to edit other users comments
* **Description:** Verify that an admin is able to edit other users comments.
* **Narrative:** As an Admin I want to be able to edit other users comments.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created а few posts and a few comments in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one of them;
   * 6. Click on "Explore this post" button
* **Expected result:** Тhe other user comment is edited containing a new description.

## Test case 11

* **Title:** Admin should be able to delete other users comments
* **Description:** Verify that an admin is able to delete other users comments.
* **Narrative:** As an Admin I want to be able to delete other users comments.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created а few posts and a few comments in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one of them;
   * 6. Click on "Explore this post" button
* **Expected result:** The other user comment is successfully deleted.

## Test case 12

* **Title:** Admin should be able to like other users comments
* **Description:** Verify that an admin is able to like other users comments.
* **Narrative:** As an Admin I want to be able to like other users comments.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created а few posts and a few comments in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one of them;
   * 6. Click on "Explore this post" button
* **Expected result:** The other user comment is liked.

## Test case 13

* **Title:** Admin should be able to dislike other users comments
* **Description:** Verify that an admin is able to dislike other users comments.
* **Narrative:** As an Admin I want to be able to dislike other users comments.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin must be registered and logged in. The other users must have created а few posts and a few comments in it.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Latest Posts" link, which is located in the header menu;
   * 5. Scroll down to the users posts and choose one of them;
   * 6. Click on "Explore this post" button
* **Expected result:** The other user comment is disliked.






