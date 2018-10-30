package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\Saurav Saha\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//first make dryrun=true and chk the mapping and then make it false, else test case won't run if dr=true
			//dry run won't give error in junit, it only shows in console
			//tags = {"~@SmokeTest","@RegressionTest","~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest