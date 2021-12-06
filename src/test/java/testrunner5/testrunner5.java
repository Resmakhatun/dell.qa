package testrunner5;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "SepDefffff")

//tags= {""})
public class testrunner5 extends AbstractTestNGCucumberTests {

}





