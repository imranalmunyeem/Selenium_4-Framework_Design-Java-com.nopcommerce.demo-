# com.nopcommerce.demo
### Selenium framework design from scratch using Java

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
                            --- TestClass (class)
                      --- utilities (package)
                            --- ReadpropertyFile (class)  
                  src/test/java
                      -- configfiles (package)
                            --- config.properties (File)
                      -- logs (package)
                      -- reports (package)
                      -- testdata (package)
                      
                      
###  ⚫ Step 7: Add below dependencies to "pom.xml"
                      --- Selenium Webdriver         (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
                      --- Test NG                    (https://mvnrepository.com/artifact/org.testng/testng)
                      --- Report NG                  (https://mvnrepository.com/artifact/org.uncommons/reportng)
                      --- Apache Log4j core          (https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core) 
                      --- Apache Log4j API           (https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api) 
                      --- Apache POI common          (https://mvnrepository.com/artifact/org.apache.poi/poi) 
                      --- Selenium Webdriver manager (https://bonigarcia.dev/webdrivermanager/)


## Possible errors handling in Eclipse
#### Error 1: The compiler compliance specified is 1.8 but a JRE 15 is used
     Solution: Either ensure the proper JRE is there or go to the Windows->Preferences->Java->Compiler and make sure your compliance setting matches.


#### Error 2: Build path specifies execution environment Java SE 1.7
     Solution:  In Eclipse -> your project-> properties -> java build path : Libraries ->Remove the "JRE System Library[J2SE 1.4]" -> click "Add Library" button -> JRE System Library -> select the new "Executin Environment" or Workspace default JRE
