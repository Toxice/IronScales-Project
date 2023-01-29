# IronScales-Project 
### Automation Project for IronScales By Mor Romano 

<p>
  <a href = "https://ironscales.com/"/>
<img src="https://ironscales.com/hs-fs/hubfs/Icons%20and%20Logos/ironscales_logo_rectangle_2021.png?width=315&height=114&name=ironscales_logo_rectangle_2021.png"/>
  </p>
                       

# Structure
## src - contains the source code of the project ( main and test folder)
## Actions - contains methods that wrap existing Selenium methods (and methods used for the Java remove test case)
## Java - contains the Remove method
## Flows - contains method that make up a test case
## pageobjects/IronScales - contains the Page Objects

# main/java :

# utilities ::
contains the automation infrastructre

## Base
contains all the variables needed

## CommonOps
contains the @BeforeClass , @AfterClass , @AfterMethod methods

## PageObject Manager
contains method that implemets the page objects

## Verifications
contains methods for verifiying test cases

# Test Cases :: 

## TestNG files
1. TestNGJava.xml - for the Java Remove Test Case
2. TestNGWeb.xml - for the Solution and Position Test Cases (Selenium Questions 1 and 2)
3. TestNGWebsites.xml - for the Selenium Websites Test Case (Selenium Question 3)

# How to test the Repo:
## first run:
`
mvn validate -P<TestNG id>
`
## then run:
`
mvn compile -P<TestNG id>
`
## and then run the test command:
`
mvn test -P<TestNG id>
`

## TestNGJava.xml:

`
mvn test -PJava
`

## TestNGWeb.xml:

`
mvn test -PWeb
`

## TestNGWebsites.xml:

`
mvn test -PWebsites
`
