# **Log in**

## Test case 01

* **Title:** Login page should have all the necessary text fields and login buttons
* **Description:** Verify that all the text-boxes, login buttons, and links are present on the Login page.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/;
   * 2. Click on "Sign In" button, which is located in the header menu;
* **Expected result:** The login page should have all the necessary text fields and login buttons, namely the fields for "Username", "Password" and "Login" button.

## Test case 02

* **Title:** Admin login with valid credenitals
* **Description:** Verify that the admin is able to login with a valid credentials
* **Narrative:**  As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with a valid username;
   * 4. Fill in the "Password" field with a valid password;
   * 5. Click on "Login" button
* **Expected result:** The admin is logged in.

## Test case 03

* **Title:** Admin login with a valid username and an invalid password (negative)
* **Description:** Verify that a admin is not able to login with a valid username and an invalid password.
* **Narrative:**  As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with a valid username;
   * 4. Fill in the "Password" field with an invalid password;
   * 5. Click on "Login" button
* **Expected result:** The admin is not logged in. An error message appears stating that the password is incorrect.

## Test case 04

* **Title:** Admin login with an invalid username and a valid password (negative)
* **Description:** Verify that the admin is not able to login with an invalid username and a valid password.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with an invalid username;
   * 4. Fill in the "Password" field with a valid password;
   * 5. Click on "Login" button
* **Expected result:** The user is not logged in. An error message appears stating that the username is incorrect.

## Test case 05

* **Title:** Admin login with an invalid username and an invalid password (negative)
* **Description:** Verify that the admin is not able to login with an invalid username and an invalid password.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with an invalid username;
   * 4. Fill in the "Password" field with an invalid password;
   * 5. Click on "Login" button
* **Expected result:** The admin is not logged in. An error message appears stating that the username and the password are incorrect.

## Test case 06

* **Title:** Admin login with a blank fields (negative)
* **Description:** Verify that the admin is not able to login with a blank fields for username and password.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Leave the "Username" field blank;
   * 3. Leave the "Password" field blank;
   * 4. Click on "Sign In" button, which is located in the header menu;
* **Expected result:** The user is not logged in. An error message appears stating that the username and the password are incorrect.

## Test case 07

* **Title:** Password should be in encrypted
* **Description:** Verify that the password is in masked form when typed in the "Password" field.
* **Narrative:**  As an Admin I want to be able to log in.
* **Priority:** High
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 4. Fill in the "Password" field with an valid password;
* **Expected result:** The password is encrypted.

## Test case 08

* **Title:** Admin should be able to paste in the "Username" field 
* **Description:** Verify that the admin is able to copy-paste in the "Username" field.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 4. Click on the "Username" field and paste the copied text;
* **Expected result:** The "Username" field contains the copied username.

## Test case 09

* **Title:** Admin should be able to paste in the "Password" field 
* **Description:** Verify that the admin is able to copy-paste in the "Password" field.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 4. Click on the "Password" field and paste the copied text;
* **Expected result:** The "Password" field contains the copied password.

## Test case 10

* **Title:** Admin login using the keyboard tab button 
* **Description:** Verify that the admin is able to navigate or access the different fields by pressing the ‘Tab’ key on the keyboard.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with a valid username;
   * 4. Go to the "Password" field with the keyboard tab button;
   * 5. Fill in the "Password" field with a valid password;
   * 6. Go to the "Login" button with the keyboard tab button;
   * 7. Click on "Login" button
* **Expected result:** The admin is logged in.

## Test case 11

* **Title:** Log in with valid credenitals and pressing the keyboard Enter key 
* **Description:** Verify that the admin is able to login by entering valid credentials and pressing Enter key.
* **Narrative:** As an Admin I want to be able to log in.
* **Priority:** Medium
* **Pre-condition:** Application is running. The user is registered.
* **Test data:** Username: adminTeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL: http://164.138.216.247:8082/login;
   * 2. Click on "Sign In" button, which is located in the header menu;
   * 3. Fill in the "Username" field with a valid username;
   * 4. Fill in the "Password" field with a valid password;
   * 5. Click on the "Login" button using  the keyboard Enter key 
* **Expected result:** The admin is logged in.


