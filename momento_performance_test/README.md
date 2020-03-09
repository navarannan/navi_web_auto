# Ruby-jemeter framweork for Load Testing

Ruby-jemeter framweork for Load Testing

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

Softwares needed to run the tests locally

```
Apache jmeter
Ruby v 2.5.5 for Windows
Git bash for Windows
```

Apache jmeter can downloaded from
```
https://jmeter.apache.org/download_jmeter.cgi
```

Download the zip file and extract to C: drive

Note the path of jmeter executable, example

```
C:/apache-jmeter-5.2.1/bin
```



## Running the tests

Clone the repository on Git. On git bash execute the following

Update the path of jemeter on 
```
spec/load_test.rb
```
example
```
path: 'C:/apache-jmeter-5.2.1/bin',
```

Execute the following on git Bash

```
cd momento_performance_test/
gem install rake bundler
bundle install
ruby spec/load_test.rb
```

The performance statiscs are captured on 
```
results.jtl
```
