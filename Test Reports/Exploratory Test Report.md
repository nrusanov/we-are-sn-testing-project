# **Exploratory Test Report**


## **WEare Social Network**

**Overview**
	
The purpose of the test session is to explore the main sections as a non-registered user, registered user and as admin and to check if the functionalities work as expected. Also make a overview of the web application for typos.
The web application is a platform for connection with people, create, comment and like posts, get a feed of the newest/most relevant posts of you connections.

**Start**

As directed 02/07/2021

**Testers**

 - Nikolay Rusanov 
 - Dayana Docheva

**Duration**

This test session last for 90 minutes. The test session is a single session for doing all the test for the web application. 
The preparation time, small breaks and the completion of bugs report are not included in the total duration of 90 minutes.

**Task breakdown**

The test session lasts for 90 minutes. In that timeframe the testers needs to identify any kind of bugs in the systems and other functional or non-functional errors or data errors in the system. 
The time period is split between the two testers, оne tested on Google Chrome, the other on Edge.

**Set up**

For the setup, there are steps below for the exploration of the system what needs to be included and arranged before the testing.

 - Make sure you have compatible device like - laptops etc. for opening the website.
 - Make sure you have access to the web application.
 - Make sure you have high speed internet connection.
 - Make sure you have good hardware of the device that you are working on – like a good ram which can hold more memory, a clear display screen etc.
 - A good screenshots app that you are familiar with. 
 - All necessary items like pen, pencil or note books if needed to note down important sittings.
 - A good location where no one can disturb.
 - Make sure you have a software to record bugs –notepad, word, excel etc.


**Preparation sample**

|Step Id|Step Action|
|---|---|
|01|Go to http://164.138.216.247:8082/|
|02|Choose the email addresses and names to be used during the test|
|03|Ensure your screen grab software is working well|
|04|Open and prepare the Bug report template on word/notepad|
|05|Ensure you have high speed internet|
|06|Ensure you are well-prepared with pens, papers etc. before starting|
|07|Make sure you have the updated browsers|

**Testing Sample**

|Step Id|Step action|
|---|---|
|01|Register on the system|
|02|Carry out normal account maintenance|
|03|Check the response time for the web application|
|04|Check if the web application is suitable for all types of devices|
|05|Check if all the options in the web application does the correct functions|

**Data**

|Email address|Username|Password|
|---|---|---|
|neptunus.qa@gmail.com|NeptunusTeam|neptunus21|
|neptunus.qa@gmail.com|NeptunusTeamTwo|neptunus21|
|neptunus.qa@gmail.com|adminNeptunus|neptunus21|

## **Output from the Exploratory Test process**

**Test notes**

|Id|Area|Description|
|-|---|---|
|01|Connections|It would be more user friendly after sign in, somewhere on the site to show a notification that there is a request from an account for approval|
|02|Posts|It would be better if default value of Post visibility is empty|
|03|Post, Comments|It would be better if the text are for creation of post and comment is called "Description"|
|04|Post, Comments|It would be more user friendly if there is a "Cancel" button right next to the "Save Post and "Post Comment" buttons|
|05|Post, Comments|It would be more user friendly when deleting a post or comment, a pop-up appears with a confirmation button|
|06|Public feed|It would be more user friendly if the search shows the total number of search results and the total number of pages with users|
|07|Public feed|It would be more user friendly if when viewing user profiles, the date of registration and the city are in a more prominent color, so as not to merge with the background|
|08|Public feed|It would be more user friendl if when viewing user profiles there are "Previous" and "Next" buttons under them|
|09|Home page|It would be more user friendly when searching for a user, clicking on the field for professions to suggest what the options are|
|10|Personal profile|It would be better if you could see who my friends are, and not just show how many they are|
|11|Personal profile|It would be more user friendly if the "edit profile" button has a blue background like the other buttons and the first letter is capitalized|
|12|Personal profile|It would be good if you click on one of the options in the navigation bar to the left of the "profile" section, the active button will light up in the corresponding field|
|13|Personal profile|It would be more user friendly if the "birthday*" field is called "Date of birth"|
|14|Login page|It would be more user friendly user to be able to log in with email|
|15|Register page|It would be more user friendly, when registering to have the option to see what is written in the fields "Password" and "Confirm password"|
|16|Register page|It would be more user friendly if the "Register" button is in a more prominent color, so as not to merge with the background|
|17|Latest posts|It would be more user friendly to see a message that there are no matches when you search for a post with a filter for the user's profession and there are no matches|


**Task statistics**

Session setup – 10%
Test execution -80%. 
Planned vs Opportunity – 10%

**Bugs**

|Id|Description|
|-|---|
|01|New user registration allows it to be done using an already used email from another user|
|02|Тhe username does not allow to include numbers and special characters|
|03|The error message when registering with numbers and special characters in the Username is incorrect|
|04|The fields for Username, Email, Password and Confirm Password are not marked as mandatory|
|05|The icons for Username and Email are cut|
|06|Login page asks for name instead of email|
|07|The icons for Twitter, Facebook and Instagram don't work properly|
|08|The link "How it works?" does not redirect to the correct page|
|09|The active button always lights up on "Add New posts"|
|10|Clicking on the "load more" button shows duplicate profiles from previous pages|
|11|Clicking on the search button displays results without entering search criteria|
|12|The fields for First name and Last name are not marked as mandatory|
|13|Birthday date could be in the future|
|14|In the city dropdown menu, the list of cities is not complete and is not sorted by any criteria|
|15|The Country field is fixed and cannot be changed|
|16|"Drop Few Words about Yourself" field accept more than the allowable number of symbols|
|17|Тhe profile photo is not loaded into the "Personal info & Safety" form|
|18|There is no button to delete a profile photo|
|19|There is no explicit error message when trying to upload picture with size bigger than allowed|
|20|There is no explicit error message when trying to edit First Name of the user with more than allowed characters|
|21|There is no explicit error message when trying to edit Last Name of the user with more than allowed characters|
|22|Тhe results for latest post are not arranged in chronological order|
|23|"Browse" button in "Browse public posts" section does not show the results in chronological order
|24|Browse public post has a dropdown menu with only one option|
|25|The buttons - life, sport, tech and travel do not work|
|26|Creating a post does not show the actual time|
|27|Posting a comment does not show the current time|
|28|Comments are not arranged in chronological order|
|29|The post creation button is called "Save"|
|30|There is no title option when creating a new post|
|31|User does not see the content in his old comment while editing it|
|32|User does not see the content in his old post while editing it|
|33|User does not see the content in the services fields while editing it|
|34|It is allowed to create a new post without content in it|
|35|It is allowed to create a new comment without content in it|
|36|There is no option to delete a picture from created post|
|37|Grammatical error in the footer section "Have a Questions?"|
|38|Message for submitting more than the allowable characters in the "Drop Few Words about Yourself" field contains a typo|
|39| Тhe "connect" button does not change its name when a request is sent|
|40|Approving а profile request does not return a valid response|
|41|"New friend requsts" button contains a typo|
|42|Approving request do not contains a picture of the user|
|43|The button "Refresh Rank-All-Posts" does not show any results|
|44|"View users" button hides part of the header menu|


**Charter Issues**


## Issue ID 01

* Title: New user registration allows it to be done using an already used email from another user
* Description: When creating a new user registration, the system allows an already used email to be submitted by another user when trying to register a new user.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64 
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/register;
   * 2. Fill in the Username field with random data;
   * 3. Fill in the Email field with neptunus.qa@gmail.com;
   * 4. Fill in the Password field with random data;
   * 5. Fill in the Confirm Password field with random data;
   * 6. Choose a professional category from the dropdown menu;
   * 7. Click on "Register" button
* Expected result: A pop-up will appear stating that the entered email has already been used.
* Actual result: The registration is successful.

## Issue ID 02

* Title: Тhe username does not allow to include numbers and special characters
* Description: It does not allow you to register with a username that includes numbers and special characters.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/register;
   * 2. Fill in the Username field with "neptunus_21;
   * 3. Fill in the Email field with random data;
   * 4. Fill in the Password field with random data;
   * 5. Fill in the Confirm Password field with random data;
   * 6. Choose a professional category from the dropdown menu;
   * 7. Click on "Register" button
* Expected result: Successful registration.
* Actual result: Error message is displayed: "username requires no whitespaces, only character".

## Issue ID 03

* Title: The error message when registering with numbers and special characters in the Username is incorrect
* Description: Creation of a registration with a Username that includes numbers and special characters does not show a proper error message.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/register;
   * 2. Fill in the Username field with "neptunus21";
   * 3. Fill in the Email field with random data;
   * 4. Fill in the Password field with random data;
   * 5. Choose a professional category from the dropdown menu;
   * 6. Click on "Register" button
* Expected result: Error message displayed: "Username does not require numbers and special characters, only letters".
* Actual result: Error message is displayed: "username requires no whitespaces, only character".

## Issue ID 04

* Title: The fields for Username, Email, Password and Confirm Password are not marked as mandatory
* Description: On the Register page, the fields for creation of registration Username, Email, Password and Confirm Password are not marked as mandatory.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/register;
   * 2. Choose a professional category from the dropdown menu;
   * 3. Click on "Register" button;
* Expected result: The fields for Username, Email, Password and Confirm Password are marked with "*" as mandatory for filling in.
* Actual result: The fields for Username, Email, Password and Confirm Password are not marked with "\*" as mandatory for filling in.


## Issue ID 05

* Title: The icons for Username and Email are cut
* Description: On the Registar page, at the far left of the Username and Email fields, there are icons that are not cropped correctly
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/register
* Expected result: The Username and Email icons on the Registration page should be intact.
* Actual result: The Username and Email icons on the Registration page are partially cropped.

## Issue ID 06

* Title: Login page asks for name instead of email
* Description: When you want to log in, the first field is for Username.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login
* Expected result: "Email" field is present.
* Actual result: "Username" field is present.

## Issue ID 07

* Title: The icons for Twitter, Facebook and Instagram don't work properly
* Description: In the footer of the Home page, the icons, which should be links for Twitter, Facebook and Instagram, redirect to the top of the page, not to the relevant links.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/;
   * 2. Navigate to the bottom left corner;
   * 3. Click on any of the icons for Twitter, Facebook or Instagram;
* Expected result: The links for Twitter, Facebook and Instagram to open their pages.
* Actual result: The links for Twitter, Facebook and Instagram redirect to the top of the page.

## Issue ID 08

* Title: The link "How it works?" does not redirect to the correct page
* Description: In the footer of the Home page, the link "How it works?" under Useful Links redirect to the wrong page.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082;
   * 2. Navigate to the bottom of the page, under Useful Links;
   * 3. Click on "How it works?" link
* Expected result: Redirect to "How it works?" page.
* Actual result: Redirect to "About us" page.

## Issue ID 09

* Title: The active button always lights up on "Add New posts"
* Description: When you click on any of the links in the header, the active button always lights up in orange on "Add New posts" and should light up according to the page on which it is.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082;
   * 2. Navigate to the header menu;
   * 3. Choose one of the links except "Add New post" and click on it
* Expected result: The active button should light up in orange on the choosen link.
* Actual result:The active button does not light up in orange on the choosen link, but lights up on "Add New post".

## Issue ID 10

* Title: Clicking on the "load more" button shows duplicate profiles from previous pages
* Description: Оn "Home" page, when you click the search button, 10 profiles are displayed on each page, below which there is a "Load more" button. When you click the button, duplicate profiles may appear on subsequent pages.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082;
   * 2. Click on "Search" button;
   * 3. Scroll down to the "Load more" button, located under the last profile;
   * 4. Click on "Load more" button
* Expected result: Show different profiles from previous pages.
* Actual result: Some of the profiles are repeated.

## Issue ID 11

* Title: Clicking on the search button displays results without entering search criteria
* Description: Clicking on the "Home" page search button shows results without entering any of the search criteria, namely Professional Category and Name.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Navigate to the "Search" button;
   * 4. Leave the Professional Category and Name fields blank;
   * 5. Click on "Search" button
* Expected result: A pop-up message appears stating that no search data has been entered.
* Actual result: Displays all user profiles.

## Issue ID 12

* Title: The fields for First name and Last name are not marked as mandatory
* Description: On "Personal profile" page,  in "Personal Profile" section, the fields for First Name and Last name are not marked as mandatory, but the profil cannot be updated without them.  An error occurs: "first/last name must have at least 3 symbols!".
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the "Personal Profile" section;
   * 6. Click on "Update My Profile" button
* Expected result: The fields for First Name and Last Name are marked with "*" as mandatory for filling in.
* Actual result: The fields for First Name and Last Name are not marked with "*" as mandatory for filling in.

## Issue ID 13

* Title: Birthday date could be in the future 
* Description: On "Personal profile" page, in "Personal Profile" section, Birthday date could be in the future.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the "Personal Profile" section;
   * 6. Choose a future date from the birthdat dropdown menu
* Expected result: A pop-up message appears stating that the birthday date is invalid.
* Actual result: A future date of birth can be chosen.


## Issue ID 14

* Title: In the city dropdown menu, the list of cities is not complete and is not sorted by any criteria
* Description: On "Personal profile" page, in "Personal Profile" section, in the city dropdown menu, the list of cities is not complete and is not sorted by any criteria.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the city dropdown menu in "Personal Profile" section;
   * 6. Click on city dropdown menu	
* Expected result: Тhe list of cities should be complete and arranged according to some criteria.
* Actual result: Тhe list of cities is not complete and is not arranged by any criteria.

## Issue ID 15

* Title: The Country field is fixed and cannot be changed
* Description: On "Personal profile" page, in "Personal Profile" section, the field for the country is fixed to Bulgaria and cannot be changed with another country.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the Country field in "Personal Profile" section;
* Expected result: To be able to choose another country.
* Actual result: The Country cannot be changed.

## Issue ID 16

* Title: "Drop Few Words about Yourself" field accept more than the allowable number of symbols
* Description: On "Personal profile" page, in "Personal Profile" section, "Drop Few Words about Yourself" field allows more than the allowable number of characters to be written (250).
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the "Drop Few Words about Yourself" field in "Personal Profile" section;
   * 6. Enter more than the allowable number of characters 
* Expected result: A pop-up appears with a message that no more characters can be entered.
* Actual result: Allows more than the allowable number of characters to be written.

## Issue ID 17

* Title: Тhe profile photo is not loaded into the "Personal info & Safety" section
* Description: On "Personal profile" page, in "Personal info & Safety", when attach a photo from the button, the photo is not loaded into the section.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the bottom of the page to "Personal info & Safety" section;
   * 6. Click on "Choose File" button and upload a photo
* Expected result: The profile photo is displayed in the section.
* Actual result: The profile photo is not displayed in the section.

## Issue ID 18

* Title: There is no button to delete a profile photo
* Description: On "Personal profile" page, in "Personal info & Safety" section, there is no button to delete the profile picture.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the bottom of the page to "Personal info & Safety" section;
   * 6. Click on "Choose File" button and upload a photo
* Expected result: There should be a button to delete a profile photo.
* Actual result: There is no button to delete a prоfile photo.

## Issue ID 19

* Title: There is no explicit error message when trying to upload а photo with size bigger than allowed
* Description: When trying to upload а profile photo with size bigger than allowed (1MB), the softwate does not show an explicit error message.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the bottom of the page to "Personal info & Safety" section;
   * 6. Click on "Choose File" button and upload a photo bigger than 1MB;
   * 7. Click on "Update" button
* Expected result: Show an explicit error stating that is not allowed to upload a photo with size bigger than allowed.
* Actual result: "Whitelabel Error Page" exception is displayed.

## Issue ID 20

* Title: There is no explicit error message when trying to edit First Name of the user with more than allowed characters
* Description:  When trying to edit First Name of the user in "Edit Professional information" section with more than allowed characters, the softwate does not show an explicit error message.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the First Name field in "Personal profile" section;
   * 6. Edit First Name with more than the allowable characters;
   * 7. Click on "Update My Profile" button
* Expected result:  Show an explicit error stating that the First Name cannot be renamed with more than the allowable number of characters.
* Actual result: "Whitelabel Error Page" exception is displayed.

## Issue ID 21

* Title: There is no explicit error message when trying to edit Last Name of the user
* Description:  When trying to edit Last Name of the user in "Edit Professional information" section with more than allowed characters, the softwate does not show an explicit error message.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the Last Name field in "Personal profile" section;
   * 6. Edit Last Name with more than the allowable characters;
   * 7. Click on "Update My Profile" button
* Expected result:  Show an explicit error stating that the Last Name cannot be renamed with more than the allowable number of characters.
* Actual result: "Whitelabel Error Page" exception is displayed.

## Issue ID 22

* Title: The results for latest posts are not arranged in chronological order
* Description: On "Latest posts" page, the results are not arranged in chronological order.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Scroll down to the user posts
* Expected result: The posts should be arranged in chronological order.
* Actual result: The posts are not arranged in chronological order.

## Issue ID 23

* Title: "Browse" button in "Browse public posts" section does not show the results in chronological order
* Description: On "Latest posts" page, clicking on "Browse" button in "Browse public posts" section does not show the results for latest posts in chronological order.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Click on "Browse" button under "Browse public post" section
* Expected result: The posts should be arranged in chronological order.
* Actual result: The posts are not arranged in chronological order.

## Issue ID 24

* Title: Browse public post has a dropdown menu with only one option
* Description: On "Latest posts" page, "Browse public posts" section has a dropdown menu containing only one option - "All public posts".
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Click on the dropdown menu in "Browse public post" section
* Expected result: The dropdown menu should contain more than one option.
* Actual result: The dropdown menu contains only one option - "All public posts".

## Issue ID 25

* Title: The buttons - life, sport, tech and travel do not work
* Description: When you choose one of the users posts, click on "Explore this post" button, there are four buttons - life, sport, tech and travel that are not working.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Choose one of the users posts;
   * 5. Click on "Explore this post" button;
   * 6. Scroll down to the buttons - life, sport, tech and travel which are located under the #WEare social network section;
   * 7. Click on any of the buttons	
* Expected result: The buttons - life, sport, tech and travel to redirect to a concrete page.
* Actual result: The buttons - life, sport, tech and travel redirect to the top of the page.

## Issue ID 26

* Title: Creating a post does not show the actual time
* Description: When creating a post, the post time is incorrect. Shows three hours ago.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Add New post" link in the header menu;
   * 4. Navigate to the "Create new post" section;
   * 5. Fill in the "Message" field;
   * 6. Click on "Save post" button;
   * 9. Scroll down to the post you created
* Expected result: Show the actual time of creating a post.
* Actual result: Shows three hours ago.

## Issue ID 27

* Title:Posting a comment does not show the actual time
* Description: When posting a comment, the post time is incorrect. Shows three hours ago.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Choose one of the users posts;
   * 5. Click on "Explore this post" button;
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Fill in the "Leave a comment" section;
   * 8. Click on "Post comment" button
   * 9. Click on "Show Comments" button over the "Leave a comment" section
* Expected result: Show the actual time of posting a comment.
* Actual result: Shows three hours ago.

## Issue ID 28

* Title: Comments are not arranged in chronological order
* Description: When posting a comment under a post, it does not arrange them in chronological order
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Choose one of the users posts;
   * 5. Click on "Explore this post" button;
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Fill in the "Leave a comment" section;
   * 8. Click on "Post comment" button;
   * 9. Fill in the "Leave a comment" section again;
   * 10. Click on "Post comment" button;
   * 11. Click on "Show Comments" button over the "Leave a comment" section
* Expected result: The comments should be in chronological order.
* Actual result: The comments are not in chronological order.

## Issue ID 29

* Title: The post creation button is called "Save"
* Description: On "Create new post" page, the button to create a new post does not mean that the post will be published, but rather saved.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Add New post" link in the header menu;
   * 4. Scroll down to the "Save" button in "Create new post" section
* Expected result: The post creation button to be called "Post".
* Actual result: The post creation button is called "Save".

## Issue ID 30

* Title: There is no title option when creating a new post
* Description: On "Create new post" page,	there is no field for the post title in the section for creating a new post. There is only for the description.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Add New post" link in the header menu;
   * 4. Scroll down to the "Create new post" section
* Expected result: To have a field to fill in the title of the post.
* Actual result: There is no field to fill in the title of the post.

## Issue ID 31

* Title: User does not see the content in his old comment while editing it
* Description: When user try to edit their comment, the old text is not visible and the user should start writing it from scratch.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Scroll down to the "Recent Posts" section; 
   * 5. Choose one of the user posts and click on it;
   * 6. Scoll down to the "Show comments" button located over "Leave a comment" section;
   * 7. Click on "Show comment" button;
   * 8. Choose one of the comments and click on "Edit comment" button;
   * 9. Scroll down to the "Message" field in "Edit a comment" section;
* Expected result: The old comment to be visible to the user.
* Actual result: The old comment is invisible to the user.

## Issue ID 32

* Title: User does not see the content in his old post while editing it
* Description: When user try to edit their post, the old text is not visible and the user should start writing it from scratch.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Scroll down to the "Recent Posts" section; 
   * 5. Choose one of the user posts and click on it;
   * 6. Click on "Edit post" button located to the right of the profile picture;
   * 7. Scroll down to the "Message" field in "Edit post" section;
* Expected result: The old post to be visible to the user.
* Actual result: The old post is invisible to the user.

## Issue ID 33

* Title: User does not see the content in the services fields while editing it
* Description: On "Personal Profile" page, in "Update your Services here" section user does not see the content in the fields while editing it and should start writing it from scratch.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Scroll down to the "Recent Posts" section; 
   * 5. Choose one of the user posts and click on it;
   * 6. Click on "Edit post" button located to the right of the profile picture;
   * 7. Scroll down to the "Update your Services here" section"
* Expected result: The old services to be visible to the user.
* Actual result: The old services are invisible to the user.

## Issue ID 34

* Title: It is allowed to create a new post without content in it
* Description: When creating a new post, it can be published without any content in it.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Add New post" link in the header menu;
   * 4. Scroll down to the "Create new post" section;
   * 5. Click on "Save post" button
* Expected result: A pop-up appears stating that it is not allowed to publish a post without content in it.
* Actual result: A new post has been published without content in it.
.

## Issue ID 35

* Title: It is allowed to create a new comment without content in it
* Description: When creating a new comment, it can be published without any content in it.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Latest Posts" link in the header menu;
   * 4. Choose one of the users posts;
   * 5. Click on "Explore this post" button;
   * 6. Scroll down to the "Leave a comment" section;
   * 7. Click on "Post comment" button
* Expected result: A pop-up appears stating that it is not allowed to publish a comment without content in it.
* Actual result: A new comment has been published without content in it.

## Issue ID 36

* Title: There is no option to delete a picture from created post
* Description: When editing a profile, there is no option to delete an already attached photo, оnly to change one.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Scroll down to the "Recent Posts" section; 
   * 5. Choose one of the user posts and click on it;
   * 6. Click on "Edit post" button located to the right of the profile picture
* Expected result: To have а button to delete an already attached photo.
* Actual result: There is no button to delete an already attached photo.

## Issue ID 37

* Title: Grammatical error in the footer section "Have a Questions?"
* Description: The footer section "Have a Questions?" contains a grammatical error.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082;
   * 2. Scroll down to the "Have a Questions?" section in the footer of the page
* Expected result: The section "Have a Questions?" to be called "Have a Question?" or "Have Questions?" .
* Actual result: The section is called "Have a Questions?".

## Issue ID 38

* Title: Message for submitting more than the allowable characters in the "Drop Few Words about Yourself" field contains a typo
* Description: There is a typo in "Personal review must have be max 250 symbols!" when trying to submit more than the allowable number of symbols in the "Drop Few Words about Yourself" field.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "edit Profile" button;
   * 5. Scroll down to the "Drop Few Words about Yourself" field in "Personal Profile" section;
   * 6. Enter more than the allowable number of characters;
   * 7. Click on "Update My Profile" button
* Expected result: A message with the following text should appear: "Personal review must be max 250 symbols!"
* Actual result: The following message appears: "Personal review must have be max 250 symbols!".


## Issue ID 39

* Title: Тhe "connect" button does not change its name when a request is sent
* Description: When you click on "connect" button to send a friend request, the button does not change its name to "Requested", but remains "connect".
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Navigate to the "Search" button and click on ti;
   * 4. Choose on of the users profiles and click on "See Profile" button;
   * 5. Click on "connect" button
* Expected result: The button to be changed to "Requested".
* Actual result: The button is still called "connect".

## Issue ID 40

* Title: Approving а profile request does not return a valid response
* Description: When approving a profile request, returns a response that contains the text "There are no requests".
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "New Friend Requsts" button;  
   * 5. Click on "Approve Request" button
* Expected result: The response to contain the text "The request has been approved".
* Actual result: The response contains the text "Opsss... There are no request".

## Issue ID 41

* Title: "New friend requsts" button contains a typo
* Description: When approving a profile request, there is a grammatical error in the button assigned to it.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Navigate to the "New Friend Requsts" button;  
* Expected result: The button to be called "New friend requests".
* Actual result: The button is called "New friend requsts".

## Issue ID 42

* Title: Approving request do not contains a picture of the user
* Description: When approving a profile request, a photo of the profile that sent the request does not appear in the dedicated section.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal Profile" link in the header menu;
   * 4. Click on "New Friend Requsts" button;  
* Expected result: The user's profile picture appears.
* Actual result: The user's profile picture does not appears.

## Issue ID 43

* Title: The "Refresh Rank-All-Posts" button does not show any results and hides part of the header menu
* Description: Logged in as an administrator, when you are on "GO TO admin zone" on the top of the page "Refresh rank-all-posts" button appears, which hides part of the header menu and does not show any results.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials as an admin;
   * 3. Click on "GO TO admin zone" link in the header menu;
   * 4. Click on "Refresh Rank-All-Posts" button
* Expected result: To refrest all posts by rank.
* Actual result: Does not show any results.

## Issue ID 44

* Title: "View users" button hides part of the header menu
* Description: "View users" button is located on part of the header menu and hides part of it.
* Environment: Windows 10 , Google Chrome 91.0.4472.124, Edge 91.0.864.64
* Steps to reproduce: 
   * 1. Go to URL http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials as an admin;
   * 3. Click on "GO TO admin zone" link in the header menu
* Expected result: The "View users" button should be below the header of the page.
* Actual result: The "View users"  is located on the header menu.



