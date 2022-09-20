# com.nopcommerce.demo
### Selenium framework design from scratch using Java

### This project contains the below features
                 External Locators property        //This property file will contains the value of the locators [Alternative of page object and page factory]
                 Page Object Pattern
                 Page Factory Pattern
                 Logging Feature
                 Custom Test-Runner (TestNG.xml)
## Steps
###  ⚫ Step 1: Download & Install Java 8
                  https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
                
                
###  ⚫ Step 2: Set Java as an Environment variable
            
####            Check whether Java is installed. Write below command in CMD 
                  java -version 


###  ⚫ Step 3: Download & Install Eclipse
                  https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
                
                
###  ⚫ Step 4:  Set Eclipse as an Environment variable
            
            
###  ⚫ Step 5: Create a new maven project in Eclipse
                  File -> New -> Project -> Maven Project       
                  
                  
###  ⚫ Step 6: Create project structure
                  src/test/java
                      --- base (package)
                            --- BaseTest (class)
                      --- testcase (package)
                            --- TestClasses (class)
                      --- utilities (package)
                            --- ReadpropertyFile (class)  
                            
                  src/test/resources
                      --- configfiles (package)
                            --- config.properties (File)
                            --- locators.properties (File)
                       --- testdata (Folder)
                            --- Excel files
                            
                  --- log4j.properties (File)
                      
                  testrunner (folder)
                      --- testng.xml
                   
                      
                      
###  ⚫ Step 7: Add below dependencies to "pom.xml"
                      --- Selenium Webdriver         (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
                      --- Test NG                    (https://mvnrepository.com/artifact/org.testng/testng)
                      --- Report NG                  (https://mvnrepository.com/artifact/org.uncommons/reportng)
                      --- ExtentReports              (https://mvnrepository.com/artifact/com.aventstack/extentreports/5.0.9)
                      --- log4j                      (https://mvnrepository.com/artifact/log4j/log4j/1.2.17)
                      --- Apache Log4j core          (https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core) 
                      --- Apache Log4j API           (https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api) 
                      --- Apache POI common          (https://mvnrepository.com/artifact/org.apache.poi/poi)
                      --- poi-ooxml                  (https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.2)
                      --- xmlbeans                   (https://mvnrepository.com/artifact/org.apache.xmlbeans/xmlbeans/5.1.1)
                      --- Apache Commons Collections (https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.4)
                      --- Selenium Webdriver manager (https://bonigarcia.dev/webdrivermanager/)


###  ⚫ Step 8: Create a "config.properties" file under "configfiles" package and store browser, testurl there
                      browser = chrome
                      testurl = https://admin-demo.nopcommerce.com/
                
                
###  ⚫ Step 9: Create a "ReadpropertyFile" class under "utilities" package to read the "config.properties. file


###  ⚫ Step 10: Create a "BaseTest" class under "base" package
                      --- Make a setUp method              //will run before each test
                                --- Launch Driver
                      --- Make a tearDown method           //will run after each test
                                --- Close Driver
                      
                      
###  ⚫ Step 11: Remove all hard coded file directory using "System.getProperty("user.dir")"
                      Example: FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
                      
                      
###  ⚫ Step 12: Externalize Locators from "Test Script" to "locators.properties" file and read that file from "BaseTest"
                      --- It will load the locators from locators.properties instead of hardcoding them


###  ⚫ Step 13: Create and use TestNG.XML(Test Runner) to make different test suits and run them
                      --- Create a folder named "testrunner" to store the XML file inside it.
                      --- Project ->TestNG ->Convert to TestNG ->Set location of "testrunner" folder ->Finish

                      N.B: Make sure to install TestNG from eclipse marketplace
                      
                      
###  ⚫ Step 14: Data Driven Testing with Excel file
                      --- Make XLSX data file and store it under "testdata"
                      --- Create a main class named "ReadXLSdata" under untilities to read the testdata from excel file.


## Possible errors handling in Eclipse
#### Error 1: The compiler compliance specified is 1.8 but a JRE 15 is used
     Solution: Either ensure the proper JRE is there or go to the Windows->Preferences->Java->Compiler and make sure your compliance setting matches.


#### Error 2: Build path specifies execution environment Java SE 1.7
     Solution:  In Eclipse -> your project-> properties -> java build path : Libraries ->Remove the "JRE System Library[J2SE 1.4]" -> click "Add Library" button -> JRE System Library -> select the new "Executin Environment" or Workspace default JRE


#### Error 3: ID is null
     Cause:  When the locators.properties file wwasn't loaded properly in "BaseTest" class
     Solution:  Check whether you read and loaded the locators.properties file properly
