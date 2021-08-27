package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feauture", glue="StepDefinition",tags={"@Smoke,@Functional"})
public class Run extends AbstractTestNGCucumberTests {

}
