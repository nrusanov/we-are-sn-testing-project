# **Test Plan for WEare Social Network**


**Prepared by:**
- Dayana Docheva
- Nikolay Rusanov

### **Table of contents**
1. INTRODUCTION    
2. OBJECTIVES AND TASKS
3. SCOPE OF TESTING
    - 3.1. FUNCTIONALITIES TO BE TESTED
    - 3.2. FUNCTIONALITIES NOT TO BE TESTED
4. TESTING STRATEGY
5. HARDWARE/ENVIRONMENT REQUIREMENTS/TOOLS
6. RESOURCES
7. SCHEDULE
8. ENTRY CRITERIA
9. EXIT CRITERIA
10. TEST DELIVERABLES

---

### 1. **INTRODUCTION:**   
This document"s purpose is to define the process for the overall strategy of 
testing [WEare Social Network](http://164.138.216.247:8082/) 
application as well as the tools and techniques to be used to assert 
the product quality.

---

### 2. **OBJECTIVES AND TASKS**
- **Objectives**   
 Overall testing approach is to have different levels of testing in order to assure needed quality and to find problems as early as possible.

 The main testing goals for the current product are: 
    - Verify that the requirements of the website are fulfilled by the application;
    - Check if the application meets the expectations and needs of the customers;
    - Identify bugs/issues in the software
   
- **Tasks**  
    - Performing an Exploratory Testing and Manual Testing of the UI covering 
    main functionalities and happy paths and creation of coverage report;
    - Creation of suites and development of Test Cases;
    - Executing automation tests covering the UI 
    (happy paths and other important functionalities);
    - Performing API testing using Postman;	
    - Logging of bugs/issues using GitLab issue tracker;
    - Preparing script for execution of automated tests;
    - Preparing document with required prerequisites to run the tests;
    - Preparing document with a short description how to run the tests, 
    how to filter them, etc;
    - Reporting

---

### 3. **SCOPE**

##### 3.1. **FUNCTIONALITIES TO BE TESTED**
- **Unregistered user**:
    - Register;
    - Search profiles;
    - Public post view;
    - View comments;
    - Public profile view;
- **Registered user**:  
    - Log in, log out;
    - Profile functionalities - edit, delete, upload a profile picture, 
    set visibility of picture, etc.;
    - Post functionalities - create, edit, delete, like/dislike, 
    upload a picture;
    - Comment functionalities - create, edit, delete, like/dislike, 
    upload a picture;
    - Connection functionalities;
- **Administrator**:
    - Log in, log out;
    - Edit / delete profiles;
    - Edit / delete posts;
    - Edit / delete comments;
    - Connection functionalities

##### 3.2. **FUNCTIONALITIES NOT TO BE TESTED** 

Due to limited time for testing and since no such requirement is present in software documentation, the 
software won't be tested against browsers different from the ones in point 5 as per this test plan. 

---

### 4. **TESTING STRATEGY**

The strategy for testing the sofware product aims at equivalent distribution of taks between team members.
The team members will divide functionalities into test suites and every member will be responsible for 
his/her test cases writing and execution.  
Every test delivarable will be committed to GitLab repository and a merge request link will be provided, so
the other member would be able to check the delivarable / or each team member will discuss with the other
the delivarable before committing to GitLab.
The team will have daily communication via Microsoft Teams and will held a weekly meeting about progress.
Occasional meetings are also possible regarding changes in deadlines and test schedule. 


- **Testing tools**:  
    - IntelliJ IDEA;
    - Selenium Webdriver;   
    - Postman;   
    - GitLab;   


- **Unit testing** - Unit testing is already performed by the development team and is considered done;  
- **System and Integration Testing** - System and Integration testing are part of the testing team engagement. 
The following types of testing will be performed:  
     - Functional testing - Functional testing is performed using the functional specification provided by 
the client and verifies the system against the functional requirements;
     - Exploratory testing - will be executed covering the Public part and Private part. 
The Exploratory testing session will be between 60 and 90 minutes. The testing process will be documented 
and the occurred issues will be reported;
     - Smoke testing - The purpose of the smoke testing is to ensure that the critical functionalities 
of the application are working fine;
     - Usability testing - The goal of usability testing is to reveal areas of confusion and uncover 
opportunities to improve the overall user experience;
     - Regression testing - The purpose of regression testing is to ensure that the code changes adversely 
not affect the existing functionality;
- **Acceptance testing**- The purpose of this test is to evaluate the system's compliance with the business 
requirements and verify if it has met the required criteria for delivery to end users.

---

### 5. **HARDWARE/ENVIRONMENT REQUIREMENTS**: 
-**Hardware**:
     - HP ProBook 6570b, Windows 10 Pro version, Processor: Intel Core i5-3320M CPU @
     2.60 Ghz, RAM: 8 GB 
     - Lenovo IdeaPad S30-15IWL, Windows 10 Enterprise version: 20H2, 
     Processor: Intel Core i7-8565U CPU, 1.99 GHz, RAM: 8 GB   

-**Browsers**:   
    - Chrome ver. 91.0.4472.124  (64-bits);  
    - Firefox ver. 89.0.2 (64-bit); 
    - Edge ver. 91.0.864.64 (64-bit) 

-**Environment requirements**: 
    - Browsers - Google Chrome, Mozilla Firefox, Edge
    - GitLab
    - JDK 11
    - IntelliJ IDEA
    - Maven package manager
    - Postman
    - Trello.com - for project management and tasks progress tracking 

---

### 6. **RESOURCES**:
-**2 QA's**:

    - Nikolay Rusanov
    - Dayana Docheva

---

### 7. **SCHEDULE**:
The project will be executed in five weeks period starting from 28.06.2021.
This include:
- First two week: 
    - Read and analyze documentation - 1 man-hour;   
    - Create a Team Git and Trello board - 1 man-hour;   
    - Test plan creation - 6 man-hours;   
    - Choose a template for test cases - 0,5 man-hours;
    - Choose a template for issue logging - 0,5 man-hours;
    - Exploratory testing - 3 man-hours; 
    - Exploratory testing issue logging - 4 man-hours;  
    - Exploratory testing report creation - 2 man-hours;
    - Progress and test plan review - 0,5 man-hours;
- Third week;
    - Create test cases and distribute them in suites - 12 man-hours;
    - Setup automation environment - 12 man-hours;
- Fourth week;  
    - Execute all manual and automation tests - 12 man-hours;
    - API Tests creation and execution - 24 man-hours;  
- Fifth week
    - Preparing test reports and deliverables - 20 man-hours;  

---  

### 8. **ENTRY CRITERIA**:  
- Issues and bugs templates are agreed by team members;
- Requirements are defined and approved;
- Test environment is available and ready for use;
- Test tools installed in the environment are ready for use;
- Test cases are developed and ready

---  

### 9. **EXIT CRITERIA**: 
- All high priority test cases are executed and passed​;
- All medium priority test cases are executed and 80% passed;
- There are no critical or blocking issues that are left outstanding;
- The testing deadline has been reached

---  

### 10. **TEST DELIVERABLES**:  
- Test plan;
- Exploratory testing report;
- Test cases;
- Coverage report;
- Defects report;
- Test summary report;
- Automated tests code/repository link;
- Script for execution of automated tests;
- Document with required prerequisites to run the tests;
- Document with a short description how to run the tests, 
how to filter them, etc

