package com.selenium.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",
		plugin={"pretty","html:Reports/cucumber-html-report"},
		tags={}
		)

public class RunnerTest {

}


