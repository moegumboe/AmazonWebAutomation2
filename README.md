# AmazonWebAutomation2
Automation practice #2 with Amazon - **Mohammad Khan**

### Project Structure
 
 *Selenium + Page Object Model*
    
      AmazonWebAutomation/ src/ main/ java/ 
                             |           |
                             |           |-----/ in.amazon/
                             |           |          |
                             |           |          |-----/ actions/ HelperMethods
                             |           |          |
                             |           |          |-----/ base_package/ BaseClass
                             |           |          |
                             |           |          |-----/ driver/ chromedriver.exe
                             |           |          |
                             |           |          |-----/ page_object/ HamburgerMenu
                             |           |                             / ItemDetailsPage
                             |           |                             / SearchResultsPage
                             |           |
                             |           |-----/ rescources/
                             |                      |
                             |                      |-----/ config.properties
                             |                             
                             |                             
                             |                            
                             / test/ java/
                                      |
                                      |-----/ in.amazon/testcases
                                                            |
                                                            |-----/ AmazonTest
                         
                            pom.xml



> Recommend to use the latest version of:
[Java](https://www.oracle.com/java/technologies/downloads/)
[Intellij IDEA](https://www.jetbrains.com/idea/download/#section=windows)

# runnning the project
Once you have Java and Intellij IDEA on your machine, open this project by clicking `get from VCS` and simly past the URL of this project into the URL field prompted by Intellij. After that click `Clone` and the project will open up. Once the project loads and downloads all the dependencies you will go to the `AmazonTest` class (*see diagram above*).

From there you can run the class by either clicking the green arrow on the line where the class signature starts or by right-clicking and selecting `Run AmazonTest`.

### Additional Comments
There are so many things to do with this project as Amazon is a massive website, and this is just a snippit of what would be the begining of an automation project. 
With that being said, In this project you will see the use of:
1. Helper class
2. Pages seperated out
3. Different types of selectors
4. Test class
5. clear and consise code



