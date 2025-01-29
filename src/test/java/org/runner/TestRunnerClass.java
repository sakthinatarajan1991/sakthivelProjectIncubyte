package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src\\test\\resources\\FeatureScenario" , glue = "org.steplogics" ,
dryRun = false , monochrome = false )
public class TestRunnerClass {

}
