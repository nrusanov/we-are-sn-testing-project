# **User Personal Profile**


## Test case 01

* **Title:** "Edit" button should redirect to the edit page 
* **Description:** Verify that clicking on the "еdit Profile" button should load a edit page to change the users personal profile information.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is located in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
* **Expected result:** To load an edit page with user data in it.

## Test case 02

* **Title:** Edit page should display by default all the added record in the fields.
* **Description:** Verify that all fields filled in at registration, namely username, password, email and professional category must be loaded by default on the edit page
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
* **Expected result:** To be displayed all completed registration fields on the edit page, namely username, password, email and professional category.

## Test case 03

* **Title:** Registered user should be able to update the profile with all required fields in the "Personal information" section
* **Description:** Verify that the user is able to update their profile entering valid data in all the required fields in the "Personal information" section.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is located in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field and fill it with valid users first name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter, latins or cyrillic letters);
   * 6. Click on "Last Name" field  and fill it with valid users last name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Choose a birtday date from the "birthday" dropdown menu;
   * 8. Click on "Email" field and type a valid new one ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 9. Click on "Update My Profile" button
* **Expected result:** The profile to be updated with the entered data.

## Test case 04

* **Title:** Registered user cannot update the profile with some required fields (leaving the field for ''Last name" blank) (negative)
* **Description:** Verify that the user is not able to update their profile entering the valid data only in some required fields - leaving the field for ''Last name" blank
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is located in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field and fill it with valid users first name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter, latins or cyrillic letters);
   * 6. Leave the "Last Name" field blank
   * 7. Choose a birtday date from the "birthday" dropdown menu;
   * 8. Leave the old email in the "Email" field;
   * 9. Click on "Update My Profile" button
* **Expected result:** Updating failed. An error message appears stating that the all required fields must be filled out.

## Test case 05

* **Title:** Registered user cannot update the profile with some required fields (leaving the field for ''First name" blank) (negative)
* **Description:** Verify that the user is not able to update their profile entering the valid data only in some required fields - leaving the field for "First name" blank
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is located in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field and fill it with valid users first name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter, latins or cyrillic letters);
   * 6. Click on "Last Name" field and fill it with valid users last name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Leave the "birthday" dropdown menu empty;
   * 8. Leave the old email in the "Email" field;
   * 9. Click on "Update My Profile" button
* **Expected result:** Updating failed. An error message appears stating that the all required fields must be filled out.

## Test case 06

* **Title:** Registered user cannot update the profile with some required fields (leaving the field for ''birtday" empty) (negative)
* **Description:** Verify that the user is not able to update their profile entering the valid data only in some required fields - leaving the field for "birthday" empty.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is located in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field blank
   * 6. Click on "Last Name" field and fill it with valid users last name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Choose a birtday date from the "birthday" dropdown menu;
   * 8. Leave the old email in the "Email" field;
   * 9. Click on "Update My Profile" button
* **Expected result:** Updating failed. An error message appears stating that the all required fields must be filled out.

## Test case 07

* **Title:** Registered user should be able to edit the profile with all required fields and all not required fields in the "Personal information" section
* **Description:** Verify that the user is able to edit their profile entering valid data in all the required fields and all not required fields in the "Personal information" section.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field blank
   * 6. Click on "Last Name" field and fill it with valid users last name in it (between 3-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Choose a birtday date from the "birthday" dropdown menu;
   * 8. Choose a gender option from the "Gender" dropdown menu;
   * 9. Leave the old email or type a new one in the "Email" field;
   * 10. Fill in the "Drop Few Words about Yourself" field with valid data (between 3-250 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters,  1 numeric character and a special symbol);
   * 11. Choose a city from the "city" dropdown menu;
   * 12. Choose a country;
   * 13. Click on "Update My Profile" button
* **Expected result:** The profile to be updated with the entered data.

## Test case 08

* **Title:** Registered user should be able to edit the professional category in the "Professional information" section
* **Description:** Verify that the user is able to edit their profile choosing an another option from the required dropdown menu "What is your professional category" in the "Professional information" section.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "Which industry does the workplace/business belong to?* section;
   * 6. Choose an option from the "What is your professional category?" dropdown menu;
   * 7. Click on "Update" button;
* **Expected result:** The profile to be updated with the entered data.

## Test case 09

* **Title:** Registered user cannot edit his Username (negative)
* **Description:** Verify that the user is not able to edit his Username.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Low
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Navigate to "User Name" field, which is located in "Personal Profile" section
* **Expected result:** The "User Name" field cannot be edited.

## Test case 10

* **Title:** Registered user cannot update "First Name" field with more than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update "First Name" field in their profile with more than the allowable characters (255).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field and enter more than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "First Name" field cannot contain more than the 255 characters.

## Test case 11

* **Title:** Registered user cannot update "Last Name" field with more than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update "First Name" field in their profile with more than the allowable characters (255).
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Last Name" field and enter more than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "Last Name" field cannot contain more than the 255 characters.

## Test case 12

* **Title:** Registered user cannot update "First Name" field with less than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update "First Name" field in their profile with less than the allowable characters (3).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "First Name" field and enter less than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "First Name" field cannot contain less than the 3 characters.

## Test case 13

* **Title:** Registered user cannot update "Last Name" field with more less the allowable characters (negative)	
* **Description:** Verify that а user is not able to update "First Name" field in their profile with less than the allowable characters (3).
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Last Name" field and enter less than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "Last Name" field cannot contain less than the 3characters.

## Test case 14

* **Title:** Registered user cannot update "Drop Few Words about Yourself" field with more than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update "Drop Few Words about Yourself" field in their profile with more than the allowable characters (250).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Drop Few Words about Yourself" field and enter more than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Editing failed. A pop-up error message appears stating that the "Drop Few Words about Yourself" field cannot contain more than the 255 characters.

## Test case 15

* **Title:** Registered user cannot update "Drop Few Words about Yourself" field with less than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update the "Drop Few Words about Yourself" field in their profile with less than the allowable characters (3).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Drop Few Words about Yourself" field and enter less than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "Drop Few Words about Yourself" field cannot contain less than the 3 characters.

## Test case 16

* **Title:** Registered user cannot update "Email" field with more than the allowable characters (negative)	
* **Description:** Verify that а user is not able to update the "Email" field in their profile with more than the allowable characters (255).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Email" field and enter more than the allowable characters;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the "Email" field cannot contain more than the 255 characters.


## Test case 17

* **Title:** Registered user cannot update the "Email" field without containing the "@" symbol (negative)	
* **Description:** Verify that а user is not able to update the "Email" field in their profile without it containing the "@" symbol.	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Click on "Email" field and enter text without containing the "@" symbol;
   * 6. Click on "Update My Profile" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the entered text in the "Email" field is not valid.


## Test case 18

* **Title:** Registered user cannot update the birthday date with a future one (negative)
* **Description:** Verify that а user is not able to update the birthday date in "birthday" dropdown menu in their profile with a futere one
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Choose a birthday date in the future from the "birthday" dropdown menu;
   * 6. Click on "Update My Profile" button 
* **Expected result:** The date of birth cannot be updated with a future date.

## Test case 19

* **Title:** Registered user should be able to fill all the fields for services and to set weekly availability 
* **Description:** Verify that the user is able to fill all the field for services with a valid data and to set a valid weekly availability in their profile in the "What services can you offer?" section.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a valid services in all the fields for this (between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 8. Click on "Update" button
* **Expected result:** The profile to be updated with the entered data about the services and the weekly availability that the user can offer.


## Test case 20

* **Title:** Registered user should be able to fill only one of the fields for services and to set weekly availability 
* **Description:** Registered user should be able to fill only one of the fields for services with a valid data and to set a valid weekly availability in the "What services can you offer?" section.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a valid service in only one of the fields for this(between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 8. Click on "Update" button
* **Expected result:** The profile to be updated with the entered data about the service and the weekly availability that the user can offer.


## Test case 21

* **Title:** Registered user cannot set a service with more than the allowable characters (negative)	
* **Description:**  Verify that а user is not able to set a service in the fields specified for this in their profile with more than the allowable characters (255).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Low
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a services in the fields specified for this with more than the allowable characters;
   * 7. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the fields for services cannot contain more than the 255 characters.

## Test case 22
* **Title:** Registered user cannot set a service with less than the allowable characters (negative)	
* **Description:** Verify that а user is not able to set a service in the fields specified for this in their profile with less than the allowable characters (1).	
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Low
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a services in the fields specified for this with less than the allowable characters;
   * 7. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the fields for services cannot contain less than the 1 character.

## Test case 23
* **Title:** Registered user cannot set weekly availability over than 168 hours (negative)
* **Description:** Verify that а user is not able to set weekly availability over than 168 hours in their profile 
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Low
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a valid services in the fields for this (between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Set a invalid weekly availability over than 168 hours using the up arrows;
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the weekly availability cannot be more than 168 hours.

## Test case 24

* **Title:** Registered user cannot set a negative value for weekly availability (negative)
* **Description:** Verify that а user is not able to set a negative value for weekly availability in their profile 
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Low
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a valid services in the fields for this (between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Set a negative value for weekly availability using the down arrows;
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the weekly availability cannot be a negative value per hour.

## Test case 25

* **Title:** Registered user cannot set a value for weekly availability without entering services (negative)
* **Description:** Verify that а user is not able to set a value for weekly availability in their profile without entering any services.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Leave the fields for services blank;
   * 7. Set a valid weekly availability using the up arrows (between 1-168 hours);
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the weekly availability cannot be set without entering any services.

* **Title:** Registered user cannot set services without entering a value for weekly availability (negative)
* **Description:** Verify that а user is not able to set services without entering a value for weekly availability in their profile.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "What services can you offer?" section;
   * 6. Enter a valid services in the fields for this (between 1-255 characters, 1 lower case letter and 1 upper case letter,  latins or cyrillic letters);
   * 7. Leave the weekly availability field at 0,0 as default
   * 8. Click on "Update" button
* **Expected result:** Updating failed. A pop-up error message appears stating that the services cannot be set withoout entering a valid weekly availability.

## Test case 27

* **Title:** Registered user should be able to set a profile picture and choose its visibility 
* **Description:** Verify that the user is able to set a profile picture and choose one of the visibility options - public or private.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "Personal info & Safety" section;
   * 6. Click on the "Choose File" button and upload a picture;	
   * 7. Choose visibility of the picture from the dropdown menu;
   * 7. Click on "Update" button
* **Expected result:** To be displayed a profile picture in the user profile.

## Test case 28
* **Title:** Registered user should be able to delete a profile picture
* **Description:** Verify that the user is able to delete an already attached picture in their profile.
* **Narrative:** As a Registered user I want to be able to edit my profile.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered and logged in.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Log in with valid credentials;
   * 3. Click on "Personal profile" link, which is locatet in the header menu;
   * 4. Click on the "edit Profile" button, which is located to the right of the profile picture;
   * 5. Scroll down to the "Personal info & Safety" section;
* **Expected result:** To have a button to delete the profile picture.

