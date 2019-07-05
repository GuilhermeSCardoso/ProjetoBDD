package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/Cliente.feature",
		glue = { "" },
		monochrome = true,
		dryRun = false
		)

public class ClienteTest {
	
	

}
