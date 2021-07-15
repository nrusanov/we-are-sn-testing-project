# **Posts**

## Test case 42

* **Title:** Registered and logged in user should be able create new public posts
* **Description:** Verify that a registered and logged in user is able to create posts with attached file.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. The the text box for message type a short text: 'This is a test post';
   * 6. From the 'Select File' section choose a file with .jpg extension from your computer and click 'Open';
   * 7. Click on button 'Save post'
* **Expected result:** The post is created successfully and could be seen in the page loaded and in the topic section of the post the text is: 'This is a test post' and bellow professional category of the user there is a text: 'Public Post: True'

## Test case 43

* **Title:** Registered and logged in user should be able to create a private post
* **Description:** Verify that a registered and logged in user is able to create private posts with attached file.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Private post';
   * 5. The the text box for message type a short text: 'This is a private post';
   * 6. From the 'Select File' section choose a file with .jpg extension from your computer and click 'Open';
   * 7. Click on button 'Save post'
* **Expected result:** The post is created successfully and could be seen in the page loaded and in the topic section of the post the text is: 'This is a private post' and bellow professional category of the user there is a text: 'Public Post: False'

## Test case 44

* **Title:** Registered and logged in user should be able to edit his/her public posts
* **Description:** Verify that a registered and logged in user to edit his/her public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Edit post';
   * 6. In the 'Post's visibility' drop-down menu choose 'Public post';
   * 7. In the textbox for Message type: 'Edited post';
   * 8. Click on 'Save post' button;
   * 9. Click on 'All posts of this user' button;
   * 10. Navigate to the edited post
* **Expected result:** In the edited post in the section 'topic' the text is: 'Edited post'

## Test case 45

* **Title:** Registered and logged in user should be able to edit his/her private posts
* **Description:** Verify that a registered and logged in user to edit his/her private posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one private post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any private post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Edit post';
   * 6. In the textbox for Message type: 'Edited private post';
   * 7. Click on 'Save post' button;
   * 8. Click on 'All posts of this user' button;
   * 8. Navigate to the edited post
* **Expected result:** In the edited post in the section 'topic' the text is: 'Edited private post'

## Test case 46

* **Title:** Registered and logged in user should be able to delete his/her public posts
* **Description:** Verify that a registered and logged in user is able to delete his/her public posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one public post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Delete post';
   * 6. Navigate to the section 'Delete post';
   * 7. From the drop-down menu 'Do You want to delete this post?' choose 'Delete post'
   * 8. Click on 'Submit' button;
* **Expected result:** A message for successfully deleted post is displayed

## Test case 47

* **Title:** Registered and logged in user should be able to delete his/her private posts
* **Description:** Verify that a registered and logged in user is able to delete his/her private posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and to have at least one private post created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to any private post of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 4. Click on button 'Delete post';
   * 5. Navigate to the section 'Delete post';
   * 6. From the drop-down menu 'Do You want to delete this post?' choose 'Delete post'
   * 7. Click on 'Submit' button;
* **Expected result:** A message for successfully deleted post is displayed

## Test case 48

* **Title:** Registered and logged in user should be able create new posts with different types of attached files
* **Description:** Verify that a registered and logged in user is able to create posts with different types of attached files.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. The the text box for message type a short text: 'This is a test post with different types of files attached';
   * 6. From the 'Select File' section choose a file with the following extensions from your computer and click 'Open': .md, .txt, .pdf, .docx, .doc;
   * 7. Click on button 'Save post'
* **Expected result:** The post is created successfully and could be seen in the page loaded and in the topic section of the post the text is: 'This is a test post' and bellow professional category of the user there is a text: 'Public Post: True'. The files attached should be visible and could be read in the site or available to download.

## Test case 49

* **Title:** Already attached files should not be lost when post edited
* **Description:** Verify that already attached files should not be lost, when post edited.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in and have at least one post created with attached .jpg file, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. In the section 'Browse public posts' click on button 'Browse';
   * 4. Navigate to any public post with .jpg file attached of user with username: 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Edit post';
   * 6. In the 'Post's visibility' drop-down menu choose 'Public post';
   * 7. In the textbox for Message type: 'Edited post';
   * 8. Click on 'Save post' button;
   * 9. Click on 'All posts of this user' button;
   * 10. Navigate to the edited post
* **Expected result:** In the edited post in the section 'topic' the text is: 'Edited post' and the file attached is still visible

## Test case 50

* **Title:** Registered and logged in user should not be able create new public posts with empty message
* **Description:** Verify that a registered and logged in user is not able to create new public posts with empty message.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. Leave the the text box for message blank;
   * 6. Click on button 'Save post'
* **Expected result:** An error message that the post cannot be created blank should appear

## Test case 51

* **Title:** Registered and logged in user should not be able to create new private posts with empty message
* **Description:** Verify that a registered and logged in user is not able to create new private posts with empty message.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Private post';
   * 5. Leave the the text box for message blank;
   * 6. Click on button 'Save post'
* **Expected result:** An error message that the post cannot be created blank should appear

## Test case 52

* **Title:** Registered and logged in user should not be able to create new public posts with more than allowed symbols
* **Description:** Verify that a registered and logged in user is not able to create new public posts with more than allowed symbols.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. In the section 'Message' write a text with 4 001 symbols;
   * 6. Click on button 'Save post'
* **Expected result:** An error message that the post cannot be created with more than allowed symbols should appear or the text box should not allow typing more than 4 000 symbols

## Test case 53

* **Title:** Registered and logged in user should not be able to create new private posts with more than allowed symbols
* **Description:** Verify that a registered and logged in user is not able to create new private posts with more than allowed symbols.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Private post';
   * 5. In the section 'Message' write a text with 1 001 symbols;
   * 6. Click on button 'Save post'
* **Expected result:** An error message that the post cannot be created with more than allowed symbols should appear or the text box should not allow typing more than 1 000 symbols

## Test case 54

* **Title:** Registered and logged in user should not be able to create new private posts with more than allowed symbols
* **Description:** Verify that a registered and logged in user is not able to create new private posts with more than allowed symbols.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Private post';
   * 5. In the section 'Message' write a text with 1 001 symbols;
   * 6. Click on button 'Save post'
* **Expected result:** An error message that the post cannot be created with more than allowed symbols should appear or the text box should not allow typing more than 1 000 symbols

## Test case 55

* **Title:** Registered and logged in user should be able to create new post by pasting a text in the message field
* **Description:** Verify that Registered and logged in user is able to create new post by pasting a text in the message field
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. In the section 'Message' paste the following text: 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.';
   * 6. Click on button 'Save post';
   * 7. Navigate to the newly created post and click on button: 'Explore this post'
* **Expected result:** Below the username of the user created the post the content should be equal to the one in step 5

## Test case 56

* **Title:** A link in a post could be clickable
* **Description:** Verify that pasted link in a post could be clickable and navigate to the respective URL.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Low
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. In the section 'Message' paste the following URL: https://www.telerikacademy.com/;
   * 6. Click on button 'Save post';
   * 7. Navigate to the newly created post and click on button: 'Explore this post'
* **Expected result:** The link shoould be clickable and navigate to the designated URL.

## Test case 56

* **Title:** A link in a post could be clickable
* **Description:** Verify that pasted link in a post could be clickable and navigate to the respective URL.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** Low
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Add New post' button at the right corner of the page;
   * 3. Navigate to the 'Create new post' section;
   * 4. From 'Post's visibility' drop-down menu choose the option: 'Public post';
   * 5. In the section 'Message' paste the following URL: https://www.telerikacademy.com/;
   * 6. Click on button 'Save post';
   * 7. Navigate to the newly created post and click on button: 'Explore this post'
* **Expected result:** The link shoould be clickable and navigate to the designated URL.

## Test case 57

* **Title:** A public post could be changed to private
* **Description:** Verify that already created public post could be changed to private.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and at least one public post must be created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Click on button 'Browse" below section 'Browse public posts';
   * 4. Navigate to a post with author 'TeamNeptunus' and click on button 'Explore this post';
   * 5. Click on button 'Edit post';
   * 6. From 'Post's visibility' drop-down menu choose: 'Private post';
   * 7. In the Message text box type the text: 'This changes post from public to private';
   * 8. Click on 'Save post' button;
   * 9. Click on 'All posts of this user' button;
   * 10. Navigate to the post edited.
* **Expected result:** In the edited post details, the property Public Post should be False. 

## Test case 58

* **Title:** A private post could be changed to public
* **Description:** Verify that already created private post could be changed to public.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in and at least one private post must be created, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the right corner of the page;
   * 3. Navigate to the post with Topic: 'This changes post from public to private';
   * 4. Click on button 'Explore this post';
   * 5. Click on button 'Edit post';
   * 6. From 'Post's visibility' drop-down menu choose: 'Public post';
   * 7. In the Message text box type the text: 'This changes post from private to public';
   * 8. Click on 'Save post' button;
   * 9. Click on 'All posts of this user' button;
   * 10. Navigate to the post edited.
* **Expected result:** In the edited post details, the property Public Post should be True. 

## Test case 59

* **Title:** Registered and logged in user should be able to see all his/her posts
* **Description:** Verify that Registered and logged in user is able to see all his/her posts not depending on what their visibility is
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, the user has created at least one public and one private post, site is running on localhost via Docker Desktop
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Personal profile' link at the right corner of the page;
   * 3. Navigate to the 'Recent Posts' section;
   * 4. Click on any post's picture;
   * 5. Click on 'All posts of this user' button;
  * **Expected result:** A list of posts should appear, each of them having the following attributes: picture /if attached/, author, professional category of author, Public Post: True/False (depending on post's visibility), Topic, date and time of post creation, two buttons: 'Explore post' and 'See profile', Likes, Comments and Rank and a button for post like /or dislike, if already liked/. 

## Test case 60

* **Title:** Registered and logged in user is able to see public posts of other users
* **Description:** Verify that registered and logged in user is able to see public posts of other users.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one public post created by other user
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
* **Expected result:** A list of public posts should appear, each of them having the following attributes: picture /if attached/, author, professional category of author, Public Post: True, Topic, date and time of post creation, two buttons: 'Explore post' and 'See profile', Likes, Comments and Rank and a button for post like /or dislike, if already liked/. 

## Test case 61

* **Title:** Registered and logged in user is not able to see private posts of other users
* **Description:** Verify that registered and logged in user is not able to see private posts of other users.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one private post created by other user
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
* **Expected result:** A list of public posts should appear, each of them having the following attributes: picture /if attached/, author, professional category of author, Public Post: True /for all posts in list/, Topic, date and time of post creation, two buttons: 'Explore post' and 'See profile', Likes, Comments and Rank and a button for post like /or dislike, if already liked/.

## Test case 62

* **Title:** Registered and logged in user is able to like his/her own posts
* **Description:** Verify that registered and logged in user is able to like his/her own posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one post created by the user
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
   * 4. Navigate to a post with author 'TeamNeptunus' and click on 'Like' button
* **Expected result:** The value of Likes property should be increased by 1 and the button 'Like' should be changed to 'Dislike' 

## Test case 63

* **Title:** Registered and logged in user is able to dislike his/her own posts
* **Description:** Verify that registered and logged in user is able to dislike his/her own posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one post created and liked by the user
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
   * 4. Navigate to a post with author 'TeamNeptunus' that already has like from the same author and click on 'dislike' button
* **Expected result:** The value of Likes property should be decreased by 1 and the button 'Dislike' should be changed to 'Like' 

## Test case 64

* **Title:** Registered and logged in user is able to like other users' posts
* **Description:** Verify that registered and logged in user is able to like other users' posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one public post created by the other user
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
   * 4. Navigate to a post with author 'TeamNeptunus' and click on 'Like' button
* **Expected result:** The value of Likes property should be increased by 1 and the button 'Like' should be changed to 'Dislike' 

## Test case 63

* **Title:** Registered and logged in user is able to dislike other users' posts
* **Description:** Verify that registered and logged in user is able to dislike other users' posts.
* **Narrative:** As a Registered user I want to use post and comment functionalities.
* **Priority:** High
* **Pre-condition:** Application is running. The user must be registered and logged in, site is running on localhost via Docker Desktop, there is at least one public post created by other user and liked by the logged in user
* **Test data:** Username: TeamNeptunusTwo, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081/;
   * 2. Click on 'Latest posts' link at the page header;
   * 3. Navigate to the 'Browse public posts' section and click on 'Browse' button below this section;
   * 4. Navigate to a post with author 'TeamNeptunus' that already has like from user TeamNeptunusTwo and click on 'dislike' button
* **Expected result:** The value of Likes property should be decreased by 1 and the button 'Dislike' should be changed to 'Like' 