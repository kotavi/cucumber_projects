package myproject;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/myproject",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = "@Sanity"
)

public class ShoppingTestRunner extends AbstractTestNGCucumberTests {
	

}
