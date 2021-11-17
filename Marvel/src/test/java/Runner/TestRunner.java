package Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\MavelSearchPage.feature",tags="@Shop_Page",
				glue= "StepDefinition",dryRun = false,monochrome = true,plugin = {"pretty"}
				)
public class TestRunner {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
    
}
