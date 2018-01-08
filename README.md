# cucumber_projects
*Eclipse version*

Eclipse IDE for Java Developers
Version: Neon.2 Release (4.6.2)
Build id: 20161208-0600

## Useful plugins

Chrome plugin 'Tidy Gherkin' - helps keep feature files consistent in layout and well formated

##How to create project

1. In Eclipse
File --> New --> Java Project
Type in <Project Name>
Click on Next button 
Choose Libraries tab
Add external jar files and click on Finish button

Create package
Click on src folder to call menu and choose Java Package
Type a name, click on finish
Create file <name>.feature inside of the package
The same way create required classes files

### Run tests with TestNG
Outside of the src folder create <name>.xml file
Create test runner file (for example see http://toolsqa.com/cucumber/cucumber-options/)


CucumberProject2

gherkin-2.12.2.jar
testng-6.9.10.jar
junit-4.12.jar
jcommander-1.72.jar
hamcrest-all-1.3.jar
cucumber-testng-1.2.5.jar
cucumber-jvm-formatter.jar
cucumber-jvm-deps-1.0.5.jar
cucumber-junit-1.2.5.jar
cucumber-java-1.2.5.jar
cucumber-html-0.2.6.jar
cucumber-core-1.2.5.jar



brew install ant
ant clean
ant runcukes (see build.xml file)
