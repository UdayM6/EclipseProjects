package Cucumberoptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
					plugin= {"pretty","html:target/htmlreports","json:target/jsonReports/cucumber-reports.json"},
					glue= {"stepdefinitions"},
					tags= {"@AddPlace or @DeletePlace"})
public class TestRunner {

	//featuers --> feature file patch
	//glue --> stepdefinition package name
	//,tags= {"@AddPlace","@DeletePlace"}
}
