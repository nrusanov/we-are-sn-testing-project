# **Registration form**


## Test case 01

* **Title:** Registration form should have all the fields as per requirement
* **Description:** Verify that the registration form have all the fields as per requirement.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu
* **Expected result:** When the registration form is loaded, the fields for "Username", "Your Email", "Password*, "Confirm Password" and "What is your professional category?" should аppear in it.

## Test case 02

* **Title:** The required fields should be marked with the asterisk symbol (*)
* **Description:** Verify that the required/mandatory fields are marked with * against the field.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
* **Expected result:** The required/mandatory fields for "Username", "Your Email", "Password", "Confirm Password" and "What is your professional category?" are marked with * against the field.

## Test case 03

* **Title:** Unregistered user should be able to create registration with all required fields
* **Description:** Verify that the user is able to register by entering the valid data in all the required fields.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Successful registration.
* **Executed by automation tool:** Postman, Selenium WebDriver

## Test case 04

* **Title:** Unsuccessful registration by entering the valid data only in some required fields (leaving the field for 'Username' blank) (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register, leaving the field for 'Username' blank.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Leave the field for Username empty.
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 7. Choose on of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the all required fields must be filled out.

## Test case 05

* **Title:** Unsuccessful registration registration by entering the valid data only in some required fields (leaving the field for 'email' blank) (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register, leaving the field for 'email' blank.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Leave the field for 'email' empty;
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 7. Choose on of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the all required fields must be filled out.

## Test case 06

* **Title:** Unsuccessful registration registration by entering the valid data only in some required fields (leaving the field for 'password' blank) (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register, leaving the field for 'password' blank
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Leave the field for 'Password' blank.
   * 6. Fill in the field for "Confirm Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 7. Choose on of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the all required fields must be filled out.


## Test case 07

* **Title:** Unsuccessful registration by entering the valid data only in some required fields (leaving the field for 'Confirm password' blank)  (negative)
* **Narrative:**  As Unregistered user I want to get a proper message when I try to register, leaving the field for 'Confirm password' blank
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Leave the field for "Confirm Password" empty;
   * 7. Choose on of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the all required fields must be filled out.


## Test case 08

* **Title:** Unsuccessful registration filling all the mandatory fields with invalid email (negative)
* **Narrative:**  As Unregistered user I want to get a proper message when I try to register with an invalid email.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: invalid
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with invalid email;
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 6. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 7. Click on the "Register" button
* **Expected result:** Registration failed. An error message appears stating that the email is invalid.

## Test case 09

* **Title:** Unsuccessful registration by leaving all the required fields blank (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register, leaving all the required fields blank.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Leave all the fields blank;
   * 4. Click on the "Register" button
* **Expected result:** A pop-up error message appears stating that the fields cannot be empty.

## Test case 10

* **Title:** Unsuccessful registration with an existing username (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with an existing username.
* **Priority:** High 
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with existing username;
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Registration failed. A pop-up error message appears stating that the name you entered already exists.

## Test case 11

* **Title:** Unsuccessful registration with an existing email (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with an existing email.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the "Your Email" field with an existing email;
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Registration failed. A pop-up error message appears stating that the email you entered already exists.

## Test case 12

* **Title:** Unregistered user must have received a email confirmation after the successful registration
* **Description:** Verify that user is received a email confirmation after successful registration.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** The user to receive an email to confirm the registration with.

## Test case 13

* **Title:** Unsuccessful registration with different "Password" and "Confirm Password" (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with different "Password" and "Confirm Password".
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Confirm Password: Neptunus_8765, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 6. Fill in the field for "Confirm Password" with different password from the "Password" field; 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** A pop-up error message appears stating that the "Password" and "Confirm Password" are different.

## Test case 14

* **Title:** Unregistered user create registration with "Username" field containing lowercase and uppercase letters, numbers, special symbols and allowable characters lenght
* **Description:** Verify that а user is able to create a registration with "Username" field containing lowercase and uppercase letters, numbers, special symbols and allowable characters lenght (between 2-30).
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with text containing lowercase and uppercase letters, numbers, special symbols and characters lenght between 2-30; 
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Successful registration.

## Test case 15

* **Title:** Unsuccessful registration with "Username" field containing more than the allowable characters lenght (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with "Username" field containing more than 30 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with text containing lowercase and uppercase letters and more than the allowable characters lenght (30); 
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Username" field cannot contain more than 30 characters.

## Test case 16

* **Title:** Unsuccessful registration with "Username" field containing less than the allowable characters lenght (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with "Username" field containing more less 2 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with text containing lowercase and uppercase letters and less than the allowable characters lenght (30); 
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Username" field cannot contain less than 2 characters.


## Test case 17

* **Title:** Unsuccessful registration with "Your Email" field containing  more than the allowable characters length (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with "Your Email" field containing more more than 255 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** 
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with text containing lowercase and uppercase letters, numbers, special symbols and more than the allowable characters lenght (255);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Your Email" field cannot contain more than the 255 characters.


## Test case 18

* **Title:** Unsuccessful registration with "Password" field containing more than the allowable characters lenght (negative)
* **Narrative:**  As Unregistered user I want to get a proper message when I try to register with "Password" field containing more more than 255 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with password containing a lowercase and uppercase letter, number, special character and more than the allowable characters lenght (255);  
   * 6. Fill in the field for "Confirm Password" with the same password;  
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Password" field cannot contain more than the 255 characters.

## Test case 19

* **Title:** Unsuccessful registration with "Password" field containing less than the allowable characters lenght (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with "Password" field containing less than 6 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with password containing a lowercase and uppercase letter, number, special character and less than the allowable characters lenght (6);  
   * 6. Fill in the field for "Confirm Password" with the same password;  
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Password" field cannot contain less than the 6 characters.


## Test case 20

* **Title:** Unsuccessful registration with "Confirm Password" field containing more than the allowable characters lenght (negative)
* **Narrative:** As Unregistered user I want to get a proper message when I try to register with "Confirm Password" field containing more more than 255 characters
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with invalid password containing a lowercase and uppercase letter, number, special character and more than the allowable characters lenght (255);  
   * 6. Fill in the field for "Confirm Password" with the same invalid password;  
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Password" and "Confirm Password" fields cannot contain more than the 255 characters.

## Test case 21

* **Title:** Unsuccessful registration with " Confirm Password" field containing less than the allowable characters lenght (negative)
* **Narrative:**As Unregistered user I want to get a proper message when I try to register with "Confirm Password" field containing less than 6 characters.
* **Priority:** High
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with invalid password containing a lowercase and uppercase letter, number, special character and less than the allowable characters lenght (6);  
   * 6. Fill in the field for "Confirm Password" with the same invalid password;  
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** Unsuccessful registration. A pop-up error message appears stating that the "Password" and "Confirm Password" fields cannot contain less than the 6 characters.


## Test case 22

* **Title:** Confirmation message should be displayed when user successfully register
* **Narrative:** As Unregistered user I want to be able to get a confirmation message.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Username: TeamNeptunus, Password: Neptunus_21, Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button
* **Expected result:** The message: "Congratulations! Your registration is complete" appears.

## Test case 23

* **Title:** Unregistered user create registration using the keyboard tab button 
* **Narrative:** As Unregistered user I want to be able to register using the keyboard tab button.
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Go to the "Your Email" field with the keyboard tab button;
   * 5. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 6. Go to the "Password"  field with the keyboard tab button;
   * 7. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 8. Go to the "Confirm Password"  field with the keyboard tab button;
   * 9. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 10. Fill in the field for "Confirm Password" with the same valid password; 
   * 11. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 12. Go to the "Register" button with the keyboard tab button;
   * 13. Click on the "Register" button
* **Expected result:** Successful registration.

## Test case 24

* **Title:** Unregistered user create registration with the keyboard Enter key 
* **arrative:** As Unregistered user I want to be able to register using the keyboard Enter key .
* **Priority:** Medium
* **Pre-condition:** The docker must be set up. The user must have a valid email.
* **Test data:** Email: Neptunus.qa21@gmail.com
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
   * 7. Choose one of the categories from "What is your professional category?*" dropdown menu;
   * 8. Click on the "Register" button using the keyboard Enter key
* **Expected result:** Successful registration.

## Test case 25

* **Title:** All fields in registration page should be blank on first visit
* **Description:** Verify that all fields in registration page are blank on first visit.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
* **Expected result:** All fields on the registration page are empty.

## Test case 26

* **Title:** "Password" should be in encrypted form when you enter it
*** Description:** Verify that the "Password" is in encrypted form when the user enters it.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:** 
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
* **Expected result:** "Password" is in encrypted form when the user enters it.

## Test case 27

* **Title:** "Confirm Password" should be in encrypted form when you enter it
* **Description:** Verify that the "Confirm Password" is in encrypted form when the user enters it.
* **Narrative:** As Unregistered user I want to be able to register in the site.
* **Priority:** High
* **Pre-condition:** The docker must be set up. 
* **Test data:** None
* **Environment:** Windows 10, Google Chrome 91.0.4472.124, Microdoft Edge 91.0.864.64, Mozilla Firefox 89.0.2
* **Steps to reproduce:**
   * 1. Navigate to URL http://localhost:8081/;
   * 2. Click on "REGISTER" link, which is located in the header menu;
   * 3. Fill in the field for "Username" with valid username (between 2-30 characters, 1 lower case letter and 1 upper case letter);
   * 4. Fill in the field for "Your Email" with valid email ( <256 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);
   * 5. Fill in the field for "Password" with valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol);  
   * 6. Fill in the field for "Confirm Password" with the same valid password (between 6-255 characters, 1 lower case letter, 1 upper case letter, 1 numeric character and a special symbol); 
* **Expected result:** "Confirm Password" is in encrypted form when the user enters it.



