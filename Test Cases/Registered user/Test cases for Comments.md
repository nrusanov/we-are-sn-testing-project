# **Comments**

## Test case 70

* **Title:** Registered and logged in user should be able to comment his/her own public post
* **Description:** Verify that a registered and logged in user is able to comment his/her own public post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has created at least one public post
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to a post with author TeamNeptunus and Public Post: True property;
   * 4. Click on 'Explore this post' button;
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Type: 'This is a test comment' in the text box;
   * 7. Click on button 'Post comment';
   * 8. Click on button 'Show Comments'
* **Expected result:** The comment is created successfully with author TeamNeptunus and content: 'This is a test comment', the comments count is increased with one.

## Test case 71

* **Title:** Registered and logged in user should be able to comment his/her own private post
* **Description:** Verify that a registered and logged in user is able to comment on his/her own private post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has created at least one private post
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to a post with author TeamNeptunus and Public Post: False property;
   * 4. Click on 'Explore this post' button;
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Type: 'This is a test comment for private post' in the text box;
   * 7. Click on button 'Post comment';
   * 8. Click on button 'Show Comments'
* **Expected result:** The comment is created successfully with author TeamNeptunus and content: 'This is a test comment for private post', the comments count is increased with one.

## Test case 72

* **Title:** Registered and logged in user should be able to edit his/her own comments on his/her own public posts
* **Description:** Verify that a registered and logged in user is able to edit his/her own comments on his/her own public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment on his/her own public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is a test comment' click on 'EDIT COMMENT' button;
   * 7. In the textbox for Message type: 'This is an edited comment';
   * 8. Click on button 'Show Comments';
* **Expected result:** The comment is edited successfully, the author is TeamNeptunus and content is: 'This is an edited comment', the comments count remains the same.

## Test case 73

* **Title:** Registered and logged in user should be able to edit his/her comment on his/her own private posts
* **Description:** Verify that a registered and logged in user to edit edit his/her comment on his/her own private posts
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment on his/her own private post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to any private post /Public Post: False/ of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 4. Click on button 'Show Comments';
   * 5. On a comment with text: 'This is a test comment for private post' click on 'EDIT COMMENT' button;
   * 6. In the textbox for Message type: 'This is an edited comment for private post';
   * 7. Click on button 'Show Comments';
* **Expected result:** The comment is edited successfully, the author is TeamNeptunus and content is: 'This is an edited comment for private post', the comments count remains the same.

## Test case 74

* **Title:** Registered and logged in user should be able to like his/her own comments on his/her own public posts
* **Description:** Verify that a registered and logged in user is able to like his/her own comments on his/her own public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment on his/her own public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is an edited comment' click on 'Like' button;
* **Expected result:** Likes count is increased by one and the 'Like' button changes to 'Dislike'.

## Test case 75

* **Title:** Registered and logged in user should be able to like his/her own comments on his/her own private posts
* **Description:** Verify that a registered and logged in user is able to like his/her own comments on his/her own private posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment on his/her own private post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to any private post /Public Post: False/ of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 4. Click on button 'Show Comments';
   * 5. On a comment with text: This is an edited comment for private post' click on 'Like' button;
* **Expected result:** Likes count is increased by one and the 'Like' button changes to 'Dislike'.

## Test case 76

* **Title:** Registered and logged in user should be able to dislike his/her own like on his/her own comment on his/her own public post
* **Description:** Verify that a registered and logged in user is able to dislike his/her own like on his/her own comment on his/her own public post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have an own like on his/her own public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is an edited comment' click on 'Dislike' button;
* **Expected result:** Likes count is increased by one and the 'Dislike' button changes to 'Like'.

## Test case 77

* **Title:** Registered and logged in user should be able to dislike his/her own like on his/her own comment on his/her own private post 
* **Description:** Verify that a registered and logged in user is able to dislike his/her own like on his/her own comment on his/her own private post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have an own like on his/her own private post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to any private post /Public Post: False/ of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 4. Click on button 'Show Comments';
   * 5. On a comment with text: This is an edited comment for private post' click on 'Dislike' button;
* **Expected result:** Likes count is decreased by one and the 'Dislike' button changes to 'Like'.

## Test case 78

* **Title:** Registered and logged in user should be able to delete his own comment on his/her own public post
* **Description:** Verify that a registered and logged in user is able to delete his own comment on his/her own public post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have an own comment on his/her own public post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is an edited comment' click on 'DELETE COMMENT' button;
   * 7. From the drop-down menu below 'Do You want to delete this Comment?' choose 'Delete comment';
   * 8. Click on 'Submit' button;
   * 9. Go back two times with the browser back button;
* **Expected result:** A message with text: 'Comment deleted successfully' should appear after step 8 and comments count should be decreased with one after step 9.

## Test case 79

* **Title:** Registered and logged in user should be able to delete his own comment on his/her own private post
* **Description:** Verify that a registered and logged in user is able to delete his own comment on his/her own private post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have an own comment on his/her own private post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any private post /Public Post: False/ of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. On a comment with text: 'This is an edited comment for private post' click on 'DELETE COMMENT' button;
   * 6. From the drop-down menu below 'Do You want to delete this Comment?' choose 'Delete comment';
   * 7. Click on 'Submit' button;
   * 8. Go back two times with the browser back button;
* **Expected result:** A message with text: 'Comment deleted successfully' should appear after step 7 and comments count should be decreased with one after step 8.

## Test case 80

* **Title:** Registered and logged in user should be able to comment public post of another user
* **Description:** Verify that a registered and logged in user is able to comment public post of another user.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and other user has created at least one public post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to a post with author TeamNeptunus and 'Public Post: True' property;
   * 4. Click on 'Explore this post' button;
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Type: 'This is a test comment from TeamNeptunusTwo' in the text box;
   * 7. Click on button 'Post comment';
   * 8. Click on button 'Show Comments'
* **Expected result:** The comment is created successfully with author TeamNeptunusTwo and content: 'This is a test comment from TeamNeptunusTwo', the comments count is increased with one.

## Test case 81

* **Title:** Registered and logged in user should be able to edit his/her own comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to edit his/her own comments on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have created at least one comment on another user's public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is a test comment from TeamNeptunusTwo' click on 'EDIT COMMENT' button;
   * 7. In the textbox for Message type: 'This is an edited comment from TeamNeptunusTwo';
   * 8. Click on button 'Show Comments';
* **Expected result:** The comment is edited successfully, the author is TeamNeptunusTwo and content is: 'This is an edited comment from TeamNeptunusTwo', the comments count remains the same.

## Test case 82

* **Title:** Registered and logged in user should be able to like his/her own comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to like his/her own comments on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have created at least one comment on another user's public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is a test comment from TeamNeptunusTwo' click on 'LIKE' button;
* **Expected result:** The likes count is increased by one and the 'Like' button changes to 'Dislike'.

## Test case 83

* **Title:** Registered and logged in user should be able to dislike his/her own comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to dislike his/her own comments on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have created at least one comment on another user's public post created, the logged in user already liked the comment, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is a test comment from TeamNeptunusTwo' click on 'DISLIKE' button;
* **Expected result:** The likes count is decreased by one and the 'Dislike' button changes to 'Like'.

## Test case 84

* **Title:** Registered and logged in user should be able to delete his/her own comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to delete his/her own comments on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have created at least one comment on another user's public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On a comment with text: 'This is a test comment from TeamNeptunusTwo' click on 'DELETE COMMENT' button;
   * 7. From the drop-down menu below 'Do You want to delete this Comment?' choose 'Delete comment';
   * 8. Click on 'Submit' button;
   * 9. Go back two times with the browser back button;
* **Expected result:** A message with text: 'Comment deleted successfully' should appear after step 8 and comments count should be decreased with one after step 9.

## Test case 85

* **Title:** Registered and logged in user should be able to like another user's comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to like another user's comments on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment created by other user on public post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to public post of user with username: 'TeamNeptunus' and click on button 'Explore this post' on any of the user's post;
   * 5. Click on button 'Show Comments';
   * 6. On any comment (not created by TeamNeptunusTwo) click on 'LIKE' button;
* **Expected result:** The likes count is increased by one and the 'Like' button changes to 'Dislike'.

## Test case 86

* **Title:** Registered and logged in user should be able to dislike his/her own like on another user's comments on another user's public posts
* **Description:** Verify that a registered and logged in user is able to dislike his/her own like on another user's comments on, which comment is on another user's public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one comment created by other user on public post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to the public post of user with username: 'TeamNeptunus' in which there is a liked comment by TeamNeptunusTwo and click on button 'Explore this post';
   * 5. Click on button 'Show Comments';
   * 6. On the liked comment click on 'DISLIKE' button;
* **Expected result:** The likes count is decreased by one and the 'Dislike' button changes to 'Like'.

## Test case 87

* **Title:** Registered and logged in user should not be able to create a comment with more than allowed symbols on his/her own public post
* **Description:** Verify that a registered and logged in user is not able to create a comment with more than allowed symbols on his/her own public post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one public post created by the logged in user, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any post created by user 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Type: text with 1 001 symbols in the text box;
   * 7. Click on button 'Post comment';
* **Expected result:** An error message that a comment with more than 1 000 symbols should be displayed or the text box should not allow typing more than 1 000 symbols.

## Test case 88

* **Title:** Registered and logged in user should not be able to create a comment with more than allowed symbols on his/her own private post
* **Description:** Verify that a registered and logged in user is not able to create a comment with more than allowed symbols on his/her own private post.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one private post created by the logged in user, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to a post with 'Public Post: False' property;
   * 4. Click on button 'Explore this post';
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Type text with 1 001 symbols in the text box;
   * 7. Click on button 'Post comment';
* **Expected result:** An error message that a comment with more than 1 000 symbols should be displayed or the text box should not allow typing more than 1 000 symbols.

## Test case 89

* **Title:** Registered and logged in user should not be able to create a comment on other user's public post with more than allowed symbols
* **Description:** Verify that a registered and logged in user not be able to create a comment on other user's public post with more than allowed symbols.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one public post created by other user, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any post created by user 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Navigate to the 'Leave a comment' section;
   * 7. Type: text with 1 001 symbols in the text box;
   * 8. Click on button 'Post comment';
* **Expected result:** An error message that a comment with more than 1 000 symbols should be displayed or the text box should not allow typing more than 1 000 symbols.

## Test case 90

* **Title:** Registered and logged in user should be able to create a new comment by pasting a text in the message field
* **Description:** Verify that Registered and logged in user is able to create a new comment by pasting a text in the message field
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, the logged in user have created at least one public post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any post created by user 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Navigate to the 'Leave a comment' section;
   * 6. Copy the following text: 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout' and paste it in the text box for message;
   * 7. Click on button 'Post comment';
   * 8. Click on button 'Show comments' and navigate to the newly created comment;
* **Expected result:** The content of the comment should be equal to the one in step 6.

## Test case 91

* **Title:** A link in a comment could be clickable
* **Description:** Verify that pasted link in a comment could be clickable and navigate to the respective URL.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Low
* **Pre-condition:** Application is running. The user must be registered and logged in, the logged in user have created at least one public post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any post created by user 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Navigate to the 'Leave a comment' section;
   * 6. In the section 'Message' paste the following URL: https://www.telerikacademy.com/;
   * 7. Click on button 'Post comment';
   * 8. Click on button 'Show comments' and navigate to the newly created comment;
* **Expected result:** The link shoould be clickable and navigate to the designated URL.

