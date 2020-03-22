# Cucumber Framework

Cucumber Web Automation framework for PwC

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

Softwares needed to run the tests locally

```
Eclipse IDE for Java Developers
JRE 1.8
ChromeDriver 80.0.3987.106 
```
Notes:- 
1. Check the version of chrome on local machine and download compatible chromedriver from 
```
https://chromedriver.chromium.org/
```

Copy the chromedriver to local machine, eg
```
C:\Webdrivers\chromedriver.exe
```
2. Maven is integrated with new versions of Eclipse. If not install Maven plugin for Eclipse

## Running the tests

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
