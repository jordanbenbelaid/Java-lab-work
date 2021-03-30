package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cuke/task1.feature", 
plugin = {"pretty", 
		"html:src/test/resources/reports/htmlreport",
		"json:src/test/resources/reports/jsonreport.json",
		"junit:src/test/resources/reports/xmlreport.xml"}, 
glue = {"stepdefs"},
monochrome = true 
)
public class Task1Runner {

}
