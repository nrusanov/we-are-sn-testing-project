# API Tests for "WE are Social Network"


### Pre-requisites to preparing the test environment

- Windows 10 
- Browsers: Google Chrome , Microsoft Edge, Mozilla Firefox 
- **WE are Social Network** to be hosted locally - [(Look here how)](https://gitlab.com/TelerikAcademy/alpha-28-qa/-/tree/master/05.%20Final%20Project/WEare%20Docker%20yml%20version) - This is done only once, before the first run of the test script.


### Running API tests

#### Pre-requisites 

- Clone the repo[(Access here)](https://gitlab.com/DayanaDocheva/neptunus-final-project)
- Postman [(Download here)](https://www.postman.com/downloads/)
- Node.js [(Download here)](https://nodejs.org/en/download/)
- Newman Latest Version [(Download here)](https://www.npmjs.com/package/newman)
- Newman Reporter Latest Version [(Download here)](https://www.npmjs.com/package/newman-reporter-htmlextra)

For Windows users, navigate to the **Postman Test Automation** folder and double-click on **run_tests.bat**, or alternatively, navigate to the folder using CMD or PowerShell, then type:
```
.\run_tests.bat 
```

After all the test suites finish running, you should have similar output:

```
C:\Users\Lenovo\Desktop\neptunus-final-project\Automation\Postman Tests>newman run WEareSocialNetworkAPI.postman_collection.json -e WEareSocialNetworkAPI.postman_environment.json -r htmlextra
Using htmlextra version 1.19.6
Newman Run Progress |████████████████████████████████████████| 100% || Requests: 47/47 || ETA: 0s

Created the htmlextra report in this location: /newman

Cleaning up posts...

Script finished executing successfully!
```

You'll find the report after the run in **postman/newman** folder as an .html file that you can preview using the browser.