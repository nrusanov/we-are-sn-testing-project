# UI Tests for "WE are Social Network"


### Pre-requisites to preparing the test environment

- Windows 10 
- Browsers: Google Chrome , Microsoft Edge, Mozilla Firefox 
- **WE are Social Network** to be hosted locally - [(Look here how)](https://gitlab.com/TelerikAcademy/alpha-28-qa/-/tree/master/05.%20Final%20Project/WEare%20Docker%20yml%20version) - This is done only once, before the first run of the test script.


### Running UI tests

#### Pre-requisites 

- Clone the repo[(Access here)](https://gitlab.com/DayanaDocheva/neptunus-final-project)
- JDK 11[(Download here)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- IntelliJ IDEA[(Download here)](https://www.jetbrains.com/idea/download/#section=windows)
- Apache Maven[(Download here)](https://maven.apache.org/download.cgi)

#### Page Object Model Tests

For Windows users, navigate to the **Selenium WebDriver Test Automation** folder and double-click on **run_RegisterFunctionalityTests, run_LoginFunctionalityTests, run_PersonalProfileFunctionalityTests**, or alternatively, navigate to the folder using CMD or PowerShell, then type:
```
.\run_RegisterFunctionalityTests.bat,  .\run_LoginFunctionalityTests.bat, .\run_PersonalProfileFunctionalityTests.bat
```

#### BDD Tests

For Windows users, navigate to the **Selenium WebDriver Test Automation** folder and double-click on **BDD_runAllTests**, or alternatively, navigate to the folder using CMD or PowerShell, then type:
```
.\BDD_runAllTests.bat 
```

You'll find the report after the run in **Selenium WebDriver Test Automation** folder as an .html file that you can preview using the browser.