package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefenitions",
		monochrome = true,
		plugin= {
				"html:target/site/cucumber-html"
		}
		)
public class TestRunner {

}
