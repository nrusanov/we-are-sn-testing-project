# **Connections**

## Test case 88

* **Title:** Registered and logged in user is able to send friend request
* **Description:** Verify that a registered and logged in user is able to send friend requests to other registered users.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Navigate to the search section;
   * 3. For professional category type: 'Translator';
   * 4. Click on 'Search' button;
   * 5. Navigate to a user with username 'Team NeptunusTwo';
   * 6. Click on 'See profile' button;
   * 7. Click on 'connect' button;
* **Expected result:** The friend request is sent successfully and a relevant message is displayed 

## Test case 89

* **Title:** Registered and logged in user is able to unsend already sent friend request
* **Description:** Verify that a registered and logged in user is able to unsend friend requests to other registered users.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already sent a friend request
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Navigate to the search section;
   * 3. For professional category type: 'Translator';
   * 4. Click on 'Search' button;
   * 5. Navigate to a user with username 'Team NeptunusTwo';
   * 6. Click on 'See profile' button;
* **Expected result:** There should be button for friend request cancellation

## Test case 90

* **Title:** Registered and logged in user is able to accept friend requests
* **Description:** Verify that a registered and logged in user is is able to accept friend requests from other registered users.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has created at least one public post and user has already friend request sent from other user
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Personal Profile' link at the site header;
   * 3. Click on 'New Friend Requsts' button;
   * 4. Navigate to the request from user 'TeamNeptunus';
   * 5. Click on 'Approve Request' button;
   * 6. Click on 'Personal Profile' link at the site header
* **Expected result:** The count in Friends List is increased by one.

## Test case 91

* **Title:** Registered and logged in user is able to reject friend requests
* **Description:** Verify that a registered and logged in user is is able to reject friend requests from other registered users.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has created at least one public post and user has already friend request sent from other user 
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Personal Profile' link at the site header;
   * 3. Click on 'New Friend Requsts' button;
   * 4. Navigate to the request from user 'TeamNeptunus';
* **Expected result:** There should have button for friend request rejection and the count in Friends List must be decreased by one.

## Test case 92

* **Title:** Registered and logged in user is able to unfriend 
* **Description:** Verify that a registered and logged in user is is able to unfriend other registered users.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has created at least one public post and user has already at least one friend
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Personal Profile' link at the site header;
* **Expected result:** There should have button for unfriend.

## Test case 93

* **Title:** Registered user is able to see friends' private posts
* **Description:** Verify that a registered and logged in user is is able to see friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already at least one friend with at least one private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
* **Expected result:** A post/or a list of post is displayed, having the following properties: author, professional catregory of the author, 'Public Post: False', Topic, date and time of post last edition, 'Explore this post' 'See profile' buttons, Likes, Comments count, Rank, Like/Dislike button.

## Test case 94

* **Title:** Registered user is able to comment friends' private posts
* **Description:** Verify that a registered and logged in user is is able to comment friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already at least one friend with at least one private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Navigate to 'Leave a comment' section;
   * 5. In the text box for message type: 'This is a comment from friend';
   * 6. Click on button 'Post Comment';
   * 7. Click on button 'Show Comments' 
* **Expected result:** A comment from with author 'TeamNeptunusTwo' and content as per step 5 should appear

## Test case 95

* **Title:** Registered user is able to like his/her own comment on friends' private posts
* **Description:** Verify that a registered and logged in user is is able to like his/her comment on friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already at least one comment on friend's private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Click on button 'Show Comments';
   * 5. For comment with author 'TeamNeptunusTwo' and 'This is a comment from friend' click on 'Like' button;
* **Expected result:** The likes count is increased with one and 'Like' button changes to 'Dislike'

## Test case 95

* **Title:** Registered user is able to dislike his/her own comment on friends' private posts
* **Description:** Verify that a registered and logged in user is is able to dislike his/her comment on friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already liked his/her own comment on friend's private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Click on button 'Show Comments';
   * 5. For comment with author 'TeamNeptunusTwo' and 'This is a comment from friend' click on 'dislike' button;
* **Expected result:** The likes count is decreased with one and 'Dislike' button changes to 'Like'

## Test case 96

* **Title:** Registered user is able to like comment on friends' private posts
* **Description:** Verify that a registered and logged in user is is able to like comment on friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user there is at least one comment on friend's private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Click on button 'Show Comments';
   * 5. For any comment with author different from 'TeamNeptunusTwo' click on 'Like' button;
* **Expected result:** The likes count is increased with one and 'Like' button changes to 'Dislike'

## Test case 97

* **Title:** Registered user is able to dislike already liked comment on friends' private posts
* **Description:** Verify that a registered and logged in user is is able to dislike already liked comment on friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has liked at least one comment on friend's private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Click on button 'Show Comments';
   * 5. For any comment with author different from 'TeamNeptunusTwo' and already liked by user 'TeamNeptunusTwo' click on 'Dislike' button;
* **Expected result:** The likes count is decreased with one and 'Dislike' button changes to 'Like'

## Test case 98

* **Title:** Registered user is able to edit his/her own comment on friends' private posts
* **Description:** Verify that a registered and logged in user is is able to edit his/her own comment on friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has already at least one comment on friend's private post
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property and click on 'Explore this post' button;
   * 4. Click on button 'Show comments';
   * 5. Navigate to a comment with auhor 'TeamNeptunusTwo' and click on button 'EDIT COMMENT';
   * 6. Type 'This is an edited comment from friend' in the text box for Message;
   * 7. Click on button 'Edit comment';
   * 8. Click on button 'Show Comments'
* **Expected result:** A comment with author 'TeamNeptunusTwo' and content as per step 6 should appear

## Test case 99

* **Title:** Registered user is able to like friends' private posts
* **Description:** Verify that a registered and logged in user is is able to like friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and there is at least one private post created by user's friend 
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property;
   * 4. Click on button 'LIKE'; 
* **Expected result:** Comment likes count is increased with one and 'Like' button changes to 'Dislike'

## Test case 100

* **Title:** Registered user is able to dislike friends' private posts
* **Description:** Verify that a registered and logged in user is is able to dislike friends' private posts.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has liked at least one private post created by user's friend 
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property;
   * 4. Click on button 'dislike'; 
* **Expected result:** Comment likes count is decreased with one and 'dislike' button changes to 'like'

## Test case 101

* **Title:** Registered user is able to delete his/her own comment on friends' private post
* **Description:** Verify that a registered and logged in user is is able to delete his/her own comment on friends' private post.
* **Narrative:** As a Registered user I want to use connection functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop and user has at least one comment on friend's private post 
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the site header;
   * 3. Navigate to a post with 'Public Post: False' property;
   * 4. Click on button 'Explore this post'; 
   * 5. Click on 'Show Comments' button;
   * 6. Navigate to a comment with author 'TeamNeptunusTwo'
   * 7. Click on 'DELETE COMMENT' button;
   * 8. From the drop-down menu below 'Do You want to delete this Comment?' choose 'Delete comment';
   * 9. Click on 'Submit' button;
   * 10. Go back two times with the browser back buttons;
* **Expected result:** A message for successful deletion of comment should appear after step 9 and comments count should be decreased with one after step 10








