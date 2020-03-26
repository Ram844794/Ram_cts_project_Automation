package Runner_PKG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src\\main\\resources\\FEATURES",glue="STEP_DEF_PKG")


public class Testrunner extends AbstractTestNGCucumberTests{
	
}
