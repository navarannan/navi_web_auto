# Cucumber Framework

Cucumber Web Automation framework for PwC

### Design Pattern

The Framewrok is built using Page Object Pattern using Selenium PageFactory. The various classes used and a summary as follows

### Page Classes
```
HomePage
ContactUs Page
SearchResultsPage
```

### Common Utility Functions
```
BasePage
```

### Common Properties for tests 
```
data.properties
```

### Driver Instantiation and Parsing Properties File
```
Base
```

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

Softwares needed to run the tests locally 

```
Windows OS
Eclipse IDE for Java Developers for Windows
JRE 1.8 for Windows
ChromeDriver 80.0.3987.106 
```
## Notes 
#### Check the version of chrome on local machine and download compatible chromedriver from 
```
https://chromedriver.chromium.org/
```

Replace the downloaded chromedriver.exe with the chromedriver.exe on "src\test\java\drivers" folder

#### Maven is integrated with new versions of Eclipse. If not install Maven plugin for Eclipse

#### If the test is run from command line Maven can be installed from https://maven.apache.org/install.html

## Running the tests

### Using Eclipse
Clone the repository on Git
```
git clone https://github.com/navarannan/navi_web_auto
```
Open the project "PwC" as a Maven Project 
```
File>>Import>>Maven>>Existing Maven Projects
```
Download the Maven dependencies, On Eclipse
```
Right click Project Root Folder (PwC in our case) in Eclipse>>Run AS>>Maven Clean
Right click Project Root Folder>>Run AS>>Maven Build
```
Run the project as a Maven Test
```
Right click Project Root Folder>>Run AS>>Maven Test

```
Run the project as a JUnit Test
```
Right Click on Project Root Folder (PwC in our case)>>Run As>>JUnit Test
```

Run the project as a TestNG Test
```
Right Click on Project Root Folder (PwC in our case)>>Run As>>TestNG Test
```

### From Windows Command Line or git Bash
Clone the repository on Git
```
git clone https://github.com/navarannan/navi_web_auto
cd navi_web_auto
cd PwC
mnv clean
mvn compile
mvn test
```
