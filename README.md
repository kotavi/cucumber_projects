# cucumber_projects
*Eclipse version*

Eclipse IDE for Java Developers<br />
Version: Neon.2 Release (4.6.2)<br />
Build id: 20161208-0600<br />

## Useful plugins

Chrome plugin 'Tidy Gherkin' - helps keep feature files consistent in layout and well formated

## How to create project

1. In Eclipse
File --> New --> Java Project<br />
Type in <Project Name><br />
Click on Next button <br />
Choose Libraries tab<br />
Add external jar files and click on Finish button<br />

### Create package
Click on src folder to call menu and choose Java Package<br />
Type a name, click on finish<br />
Create file <name>.feature inside of the package<br />
The same way create required classes files<br />

### Run tests with TestNG
Outside of the src folder create <name>.xml file<br />
Create test runner file (for example see http://toolsqa.com/cucumber/cucumber-options/)


## CucumberProject

gherkin-2.12.2.jar<br />
testng-6.9.10.jar<br />
junit-4.12.jar<br />
jcommander-1.72.jar<br />
hamcrest-all-1.3.jar<br />
cucumber-testng-1.2.5.jar<br />
cucumber-jvm-formatter.jar<br />
cucumber-jvm-deps-1.0.5.jar<br />
cucumber-junit-1.2.5.jar<br />
cucumber-java-1.2.5.jar<br />
cucumber-html-0.2.6.jar<br />
cucumber-core-1.2.5.jar<br />


### Run tests with Ant
brew install ant<br />
ant clean<br />
ant runcukes (see build.xml file)<br />
