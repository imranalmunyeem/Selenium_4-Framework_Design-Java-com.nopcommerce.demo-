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
                
####            Set Eclipse as an Environment variable
            
            
###  ⚫ Step 4: Create a new maven project in Eclipse
                  File -> New -> Project -> Maven Project
                
## Possible errors handling in Eclipse
#### Error 1: The compiler compliance specified is 1.8 but a JRE 15 is used
     Solution: Either ensure the proper JRE is there or go to the Windows->Preferences->Java->Compiler and make sure your compliance setting matches.


#### Error 2: Build path specifies execution environment Java SE 1.7
     Solution:  In Eclipse -> your project-> properties -> java build path : Libraries ->Remove the "JRE System Library[J2SE 1.4]" -> click "Add Library" button -> JRE System Library -> select the new "Executin Environment" or Workspace default JRE
