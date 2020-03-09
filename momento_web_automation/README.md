# Cucumber Framework

Cucumber Web Automation framework for Cotton On E-Commerce 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

Softwares needed to run the tests locally

```
Rubymine IDE
Ruby v 2.5.5 for Windows
Git bash for Windows
chromedriver 
```
Note:- Check the version of chrome on local machine and download compatible chromedriver from 
```
https://chromedriver.chromium.org/
```

Copy the chromedriver to ruby bin directory, eg
```
C:\Ruby25-x64\bin\chromedriver.exe
```


## Running the tests

Clone the repository on Git. On git bash execute the following


```
cd momento_web_automation
gem install rake bundler watir
gem install testgen
bundle install
cucumber features/Web_UI_Tests.feature
```

