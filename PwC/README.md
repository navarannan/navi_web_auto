# Cucumber Framework

Cucumber Web Automation framework for PwC

### Design Pattern

The Framewrok is built using Page Object Model Design Pattern using Selenium PageFactory. The various classes used and a summary as follows

### DSL language/Feature File
```
WebUI_Tests.feature
```

### Page Classes
```
HomePage
ContactUsPage
SearchResultsPage
```

### Common Utility Functions
```
BasePage
```

### Driver instantiation
```
DriverFactory
```

## Cucumber Runner
```
TestRunner
```


### Common Properties for tests 
```
data.properties
```

### Hooks 
```
MasterHooks
```


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

Softwares needed to run the tests locally 

```
Windows OS
JDK 1.8 for Windows
ChromeDriver compatible with Chrome on your machine
Maven
```
## Notes 
#### Check the version of chrome on local machine and download compatible chromedriver from 
```
https://chromedriver.chromium.org/
```

Replace the downloaded chromedriver.exe with the chromedriver.exe on "src\test\java\drivers" folder


## Running the tests

### Using IDE
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

### Extent Reports

```
Check PwC\output foler
```

