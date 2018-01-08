package com.main.mvnproject;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/test/resources",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = "@Sanity"
)

public class amazonRunnerTest {
	

}