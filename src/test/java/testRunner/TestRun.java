package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\Features",
		glue = "StepDefinations",
		tags="@regression",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/HTMLReports/Sanity03.html"})


public class TestRun {
	/* this class should be Empty */
	
	
}

