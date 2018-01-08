
package com.license.create.positive;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/com/license/features",
		plugin = {"pretty", "html:target/create-license-report"},
		tags = "@Positive"
)

public class createLicenseTestRunner extends AbstractTestNGCucumberTests {
	

}