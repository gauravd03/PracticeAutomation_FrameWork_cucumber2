package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {

		@CucumberOptions(
				tags="",
				features = "src/test/resource/Features",
				glue ="com.stepdefinition"
				//plugin = {"pretty:target/cucumber-reports/cucumber.html",}
				)
		public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

		}
	}


	


