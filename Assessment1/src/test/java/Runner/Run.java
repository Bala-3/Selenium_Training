package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feauture", glue="Stepdefinition")
public class Run extends AbstractTestNGCucumberTests{

}