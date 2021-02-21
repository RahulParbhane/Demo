package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/appfeatures"},
		glue= {"Stepdefinition"},
		plugin= {"pretty"}
)

public class TestRunner {

}
