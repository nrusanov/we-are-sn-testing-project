# **Edit users profiles**

## Test case 43

* **Title:** Admin should be able to edit other users profiles with all required fields in the "Personal information" section
* **Description:** Verify that the admin is able to edit other users profiles entering valid data in all the required fields in the "Personal information" section.
* **Narrative:** As an Admin user I want to be able to edit other users profiles.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Click on "First Name" field and fill it with a valid data (between 3-255 characters, 1 lower case letter and 1 upper case letter, latins or cyrillic letters);
   * 8. Click on "Last Name" field  and fill it with a valid data(between 3-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 9. Choose a birtday date from the "birthday" dropdown menu;
   * 10. Click on "Email" field and type a valid new one ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 11. Click on "Update My Profile" button
* **Expected result:** The profile to be edited with the entered data.

## Test case 44

* **Title:** Admin should be able to edit the other users professional category in the "Professional information" section
* **Description:** Verify that the admin is able to edit the other users profiles choosing an another option from the required dropdown menu "What is your professional category" in the "Professional information" section.
* **Narrative:** As an admin I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Scroll down to the "Which industry does the workplace/business belong to?* section;
   * 8. Choose an option from the "What is your professional category?" dropdown menu;
   * 9. Click on "Update" button;
* **Expected result:** The profile to be updated with the entered data.

## Test case 45

* **Title:** Admin cannot edit the other users Username (negative)
* **Narrative:** As an admin I want to get a proper error message when I try to edit the other users Username.
* **Priority:** Low
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Navigate to "User Name" field, which is located in "Personal Profile" section
* **Expected result:** The "User Name" field cannot be edited.

## Test case 46

* **Title:** Admin should be able to edit all the fields for services and to set weekly availability in the other users profile
* **Description:** Verify that the admin is able to edit all the field for services with a valid data and to set a valid weekly availability in the other users profile in the "What services can you offer?" section.
* **Narrative:** As an admin I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Scroll down to the "What services can you offer?" section;
   * 8. Enter a valid services in all the fields for this (between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 9. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 10. Click on "Update" button
* **Expected result:** The profile to be edited with the entered data about the services and the weekly availability that the user can offer.

## Test case 47

* **Title:** Admin should be able to edit profile picture and choose its visibility in the other users profiles
* **Description:** Verify that the admin is able to edit profile picture and choose one of the visibility options - public or private in the other users profiles.
* **Narrative:** As an admin I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Scroll down to the "Personal info & Safety" section;
   * 8. Click on the "Choose File" button and upload a picture;	
   * 9. Choose visibility of the picture from the dropdown menu;
   * 10. Click on "Update" button
* **Expected result:** The profile picture to be edited with the choosen one. 

## Test case 48

* **Title:** Admin should be able to delete the profile picture of other users profiles
* **Narrative:** As an admin I want to be able to delete the profile picture of other users profiles.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile and to have an already attached profile picture.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 7. Scroll down to the "Personal info & Safety" section;
* **Expected result:** To have a button to delete the profile picture.

## Test case 49

* **Title:** Admin should be able to disable the other users profiles
* **Narrative:** As an admin I want to be able to disable the other users profiles.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose one of the other users profiles and click on "See profile" button;
   * 6. Click on "disable" button, which is located to the left of the profile picture
* **Expected result:** The profile to be deactivated.

## Test case 50

* **Title:** Admin should be able to enable the other users profiles
* **Narrative:** As an admin I want to be able to enable other users already disabled profiles.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The admin is registered and logged in. To have at least one other user profile, which is already disabled.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://localhost:8081
   * 2. Click on "Sign in" link, which is located in the header menu;
   * 3. Log in with a valid credentials;
   * 4. Click on "Search" button;
   * 5. Choose the users profile, which you have already deactivated and click on "See profile" button;
   * 6. Click on "enable" button, which is located to the left of the profile picture
* **Expected result:** The profile to be activated.
