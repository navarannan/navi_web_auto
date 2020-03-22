# Cucumber Framework

Cucumber Web Automation framework for PwC

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

Copy the chromedriver to local machine, eg
```
C:\Webdrivers\chromedriver.exe
```
#### Maven is integrated with new versions of Eclipse. If not install Maven plugin for Eclipse

#### If the test is run from command line Maven can be installed from https://maven.apache.org/install.html

## Running the tests

### Using Eclipse
Clone the repository on Git
```
git clone https://github.com/navarannan/navi_web_auto
```
Open the project "PwC" as a Meven Project in Eclipse
```
File>>Import>>Maven>>Existing Maven Projects
Wait for Maven to download dependencies
```
Run the project as a JUnit Test
```
Right Click on Project Root Folder (PwC in our case)>>Run As>>JUnit Test
```

### From Windows Command Line or git Bash
Clone the repository on Git
```
git clone https://github.com/navarannan/navi_web_auto
cd navi_web_auto
cd PwC
mvn compile
mvn test
```
