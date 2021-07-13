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
 - Make sure you have a software to record bugs – notepad, word, excel etc.


**Preparation sample**

|Step Id|Step Action|
|---|---|
|01|Go to http://164.138.216.247:8082/|
|02|Choose the email addresses and names to be used during the test|
|03|Ensure your screen app software is working well|
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
|hmxpwzdq@abv.bg|TestUser|ngjeP#Ve
|Neptunus.qa21@gmail.com|TeamNeptunus|Neptunus_21
|Neptunus.qa21@gmail.com|TeamNeptunusTwo|Neptunus_21
|Neptunus.qa21@gmail.com|adminNeptunus|Neptunus_21

## **Output from the Exploratory Test process**

**Test notes**

|Id|Area|Description|
|-|---|---|
|01|Connections|It would be more user friendly after sign in, somewhere on the site to show a notification that there is a request from an account for approval|
|02|Connections|It would be better for the system to return response that the friend request has been approved|
|02|Posts|It would be better if default value of Post visibility is empty|
|03|Post, Comments|It would be better if the text for creation of post and comment is called "Description"|
|04|Post, Comments|It would be more user friendly if there is a "Cancel" button right next to the "Save Post and "Post Comment" buttons|
|05|Post, Comments|It would be more user friendly when deleting a post or comment, a pop-up appears with a confirmation button|
|06|Public feed|It would be more user friendly if the search shows the total number of search results and the total number of pages with users|
|07|Public feed|It would be more user friendly if when viewing user profiles, the date of registration and the city are in a more prominent color, so as not to merge with the background|
|08|Public feed|It would be more user friendly if when viewing user profiles there are "Previous" and "Next" buttons under them|
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
|10|User cannot cancel a friend request sent to him/her|
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
|40|"New friend requsts" button contains a typo|
|41|Approving request do not contains a picture of the user|
|42|The button "Refresh Rank-All-Posts" does not show any results|
|43|"View users" button hides part of the header menu|









